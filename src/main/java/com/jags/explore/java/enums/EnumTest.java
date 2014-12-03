package com.jags.explore.java.enums;

/**
 * Created by 36262Ja on 03/10/2014.
 */
public class EnumTest {
  public static void main(String... args) {
    System.out.println(Week.FRIDAY);
    System.out.println(Week.FRIDAY.getDayOfWeek());
    System.out.println(Week.valueOf("FRIDAY"));

    Week week = Week.MONDAY;
  }
}
