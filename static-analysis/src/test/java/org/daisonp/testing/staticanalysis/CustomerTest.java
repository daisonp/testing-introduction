package org.daisonp.testing.staticanalysis;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

public class CustomerTest {
  private static final LocalDate DOB = LocalDate.of(2000, 3, 16);
  private static final LocalDate OTHER_DATE = LocalDate.of(2017, 3, 15);

  @Test
  public void testAgeOnDate() {
    Customer customer = new Customer(1, "Bob", DOB);
    assertEquals("Years: 16 Months : 11", customer.ageOnDate(OTHER_DATE));
  }

}
