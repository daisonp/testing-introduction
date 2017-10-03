package org.daisonp.testingexamples;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class AssumeTest {
  private static final Boolean SHOULD_RUN = Boolean.TRUE;

  @Test
  public void test_runs_and_fails() {
    assumeTrue(SHOULD_RUN);
    fail("test runs and fails");
  }

  @Test
  public void test_doesnt_fail() {
    assumeFalse(SHOULD_RUN);
    fail("Should never get here");
  }

}
