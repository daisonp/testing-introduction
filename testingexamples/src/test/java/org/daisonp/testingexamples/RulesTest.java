package org.daisonp.testingexamples;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RulesTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void throwsNothing() {
        assertTrue(true);
    }

    @Test
    public void throwsExceptionWithSpecificType() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }
    
    @Test
    public void failsDueToWrongExceptionType() {
        thrown.expect(IllegalArgumentException.class);
        throw new NullPointerException();
    }
}
