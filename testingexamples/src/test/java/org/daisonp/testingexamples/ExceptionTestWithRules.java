package org.daisonp.testingexamples;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExceptionTestWithRules {

	@Test
	public void throwsNothing() {
		assertTrue(true);
	}

	@Test
	public void throwsExceptionWithSpecificType() {
		try {
			throw new NullPointerException();
		} catch (Throwable e) {
			if (!(e instanceof NullPointerException)) {
				fail("Exception is not a null pointer exception");
			}
		}
	}

	@Test
	public void failsDueToWrongExceptionType() {
		try {
			throw new IllegalArgumentException();
		} catch (Throwable e) {
			if (!(e instanceof NullPointerException)) {
				fail("Exception is not a null pointer exception");
			}
		}
	}
}
