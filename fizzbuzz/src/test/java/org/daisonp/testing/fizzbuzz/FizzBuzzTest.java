package org.daisonp.testing.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	private static final FizzBuzz FIZZ_BUZZ = new FizzBuzz();

	@Test
    public void should_return_original_number_when_not_divisable_by_3_or_5() {
        String result = FIZZ_BUZZ.run(1);
        assertEquals("1", result);
    }
    
    @Test
    public void should_return_Fizz_when_number_divisable_by_3() {
        String result = FIZZ_BUZZ.run(3);
        assertEquals("Fizz", result);
    }
    
    @Test
    public void should_return_Buzz_when_number_divisable_by_5() {
        String result = FIZZ_BUZZ.run(5);
        assertEquals("Buzz", result);
    }
    
    @Test
    public void should_return_FizzBuzz_when_number_divisable_by_3_and_5() {
        String result = FIZZ_BUZZ.run(15);
        assertEquals("FizzBuzz", result);
    }

}
