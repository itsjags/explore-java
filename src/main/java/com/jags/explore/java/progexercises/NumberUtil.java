package com.jags.explore.java.progexercises;

/**
 * Created by 36262Ja on 01/06/2015.
 */
public class NumberUtil {

  public String checkEven(int input) {
    if ((input % 2) == 0) {
      return "even";
    } else {
      return "odd";
    }
  }

  public boolean checkPrime(int input) {

    boolean prime = false;
    if (input == 1 || input == 2) { // 1 or 2
      prime = true;
    } else if ( input % 2 == 0 ) { //even numbers
      prime = false;
    } else { // odd number
      Math.sqrt(input);
    }
    return false;
  }

  public static void main(String... args) {
    System.out.println(new NumberUtil().checkEven(1));
  }
}
