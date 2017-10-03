package org.daisonp.testingexamples;

import static org.daisonp.testingexamples.LengthGreaterThan.lengthIsGreaterThan;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertThatTest {

  public static String myColour = "RED";

  @Test
  public void using_assertEquals() {
    assertEquals("RED", myColour);
  }

  @Test
  public void using_assertThat() {
    assertThat(myColour, is(equalTo("RED")));
  }

  @Test
  public void using_assertThat_overriden_is() {
    assertThat(myColour, is("RED"));
  }

  @Test
  public void either_or_assertTrue() {
    String name = "Eric";
    assertTrue(name.startsWith("A") || name.startsWith("B"));
  }

  @Test
  public void either_or_assertThat() {
    String name = "Eric";
    assertThat(name, anyOf(startsWith("A"), startsWith("B")));
  }

  @Test
  public void custom_matcher_test_fail() {
    String value = "this is a test string";
    assertThat(value, lengthIsGreaterThan(25));
  }

  @Test
  public void custom_matcher_test_pass() {
    String value = "this is a test string";
    assertThat(value, lengthIsGreaterThan(5));
  }

  @Test
  public void custom_matcher_null_value() {
    assertThat(null, lengthIsGreaterThan(5));
  }
}
