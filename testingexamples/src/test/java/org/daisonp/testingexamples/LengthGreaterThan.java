package org.daisonp.testingexamples;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

/**
 * Tests if the argument is a string that is at least the supplied minimum
 * length
 * 
 * @author daisonp
 */
public class LengthGreaterThan extends BaseMatcher<String> {
  private int minLength;

  private LengthGreaterThan(final int minLength) {
    this.minLength = minLength;
  }

  public static LengthGreaterThan lengthIsGreaterThan(final int minLength) {
    return new LengthGreaterThan(minLength);
  }

  @Override
  public void describeTo(Description description) {
    description.appendText("length of at least ").appendValue(minLength);
  }

  @Override
  final public void describeMismatch(Object item, Description description) {
    description.appendText("was ");
    if (item == null) {
      description.appendValue(null);
    } else {
      description.appendText("only ").appendValue(item.toString().length());
    }
  }

  @Override
  public boolean matches(Object item) {
    return item != null && item instanceof String && item.toString().length() >= minLength;
  }
}