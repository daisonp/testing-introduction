package org.daisonp.testing.staticanalysis;

public class ExtraFizzBuzz {

  public String run(Integer value) {
    if (value == null) {
      return "null";
    }
    StringBuilder sb = new StringBuilder();
    if (value % 3 == 0) {
      if (value % 10 == 0) {
        sb.append("Extra");
      }
      sb.append("Fizz");
    }
    if (value % 5 == 0) {
      sb.append("Buzz");
    }
    if (sb.length() == 0) {
      sb.append(value);
    }
    return sb.toString();
  }

}
