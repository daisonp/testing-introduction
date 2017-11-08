package org.daisonp.testing.staticanalysis;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Customer {
  private Integer id;
  private String name;
  private LocalDate dob;
  
  public Customer(Integer id, String name, LocalDate dob) {
    this.id = id;
    this.name = name;
    this.dob = dob;
  }
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public LocalDate getDob() {
    return dob;
  }
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public String ageOnDate(LocalDate dateToCompare) {
    long months = dob.until( dateToCompare, ChronoUnit.MONTHS);   
    return new StringBuilder("Years: ")
        .append(+months /12)
        .append(" Months : ")
        .append(months % 12)
        .toString();
  }
  
}
