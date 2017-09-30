package org.daisonp.testingexamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionTests {
	
	/*
	 * assertEquals and assertNotEquals
	 * 
	 * assertEquals compares 2 values to check whether they have the same value, can supply 
	 * primitives or objects. If 2 objects are being compared then the comparison is done 
	 * using the equals() method of the objects.
	 *
	 * assertNotEquals checks that the values are not the same.
	 */
	@Test
	public void assertEquals_passes_when_2_different_object_but_equals_method_return_true() {
		TestObject obj1 = new TestObject("MATCH");
		TestObject obj2 = new TestObject("MATCH");
		assertEquals(obj1, obj2);
	}

	@Test 
	public void assertNotEquals_passes_when_2_different_objects_and_equals_method_return_false() {
		TestObject obj1 = new TestObject("MATCH");
		TestObject obj2 = new TestObject("NOMATCH");
		assertNotEquals(obj1, obj2);
	}
	
	// Checks on doubles and floats can take an additional delta value
	// that allows the values to be classed as equal if the difference
	// in the numbers are within the delta
	@Test
	public void assertEquals_double_within_tolerance() {
		assertEquals("values not within tolerance of 1", 23.45d, 24d, 1d);
	}
	
	@Test
	public void assertNotEquals_double_not_within_tolerance() {
		assertNotEquals("values within tolerance of 1", 23.45d, 25d, 1d);
	}
	
	
	/*
	 * assertSame and assertNotSame
	 * 
	 * Asserts that two objects refer to the same object and not just that the objects.equals()
	 * methods are equal.
	 */
	@Test
	public void assertNotSame_passes_when_2_objects_are_not_the_same_reference_but_have_the_same_value() {
		TestObject obj1 = new TestObject("MATCH");
		TestObject obj2 = new TestObject("MATCH");
		assertNotSame(obj1, obj2);
	}
	
	@Test
	public void assertSame_passes_when_2_objects_are_the_same_reference() {
		TestObject obj1 = new TestObject("MATCH");
		TestObject obj2 = obj1;
		assertSame(obj1, obj2);
	}
	
	
	/*
	 * assertTrue and assertFalse
	 * 
	 * assertTrue checks a value to see if is true
	 * assertFalse checks a value to see if is false
	 */
	@Test
	public void assertTrue_passes_when_value_is_true() {
		TestObject obj = new TestObject("a object").isTrue(Boolean.TRUE);
		assertTrue("fails if false", obj.isTrue());
	}
	
	@Test 
	public void assertFalse_pass_when_value_is_false() {
		TestObject obj = new TestObject("an object").isTrue(Boolean.FALSE);
		assertFalse("fails if true", obj.isTrue());
	}
	
	
	/*
	 * assertNull and assertNotNull
	 * 
	 * assertNull checks that a variable has been set
	 * assertNotNull checks that a variable has not been set
	 */
	@Test
	public void assertNull_pass_when_value_is_not_set() {
		String NULL_STRING = null;
		assertNull(NULL_STRING);
	}
	
	@Test
	public void assertNotNull_pass_when_value_is_set() {
		String A_STRING = "a string";
		assertNotNull(A_STRING);
	}
	
	/*
	 * assertArrayEquals
	 * 
	 * Checks that 2 arrays have the same values and are in the same order, as
	 * with assertEquals checks on floats and doubles can contain a tolerance
	 * level
	 * 
	 */
	@Test
	public void assertArraysEqual_passes_when_array_have_same_values_and_in_same_order() {
		String [] array1 = {"one", "two", "three" };
		String [] array2 = {"one", "two", "three" };
		assertArrayEquals(array1, array2);
	}
	
	@Test
	public void assertArraysEqual_fails_when_array_has_same_values_but_in_different_order() {
		String [] array1 = {"one", "two", "three" };
		String [] array2 = {"two", "three", "one" };
		assertArrayEquals(array1, array2);
	}
}

/**
 * Object used in tests
 */
final class TestObject {
    private String id;
    private Boolean isTrue;

    public TestObject(final String id) { 
        this.id = id;
    }
    
    public TestObject isTrue(final Boolean value) {
        this.isTrue = value;
        return this;
    }
    
    public Boolean isTrue() {
        return isTrue;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other == null)
            return false;
        else {
            return this.id.equals( ((TestObject)other).id );
        }
    }

    @Override
    public String toString() {
        return new StringBuilder("SomeObject [")
            .append("id=").append(id)
            .append(", isTrue=").append(isTrue)
            .append("]")
            .toString();
    }
}              

