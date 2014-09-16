package com.jags.explore.java.adhoc;

/**
 * Created with IntelliJ IDEA.
 * User: 36262Ja
 * Date: 26/08/14
 * Time: 09:42
 * To change this template use File | Settings | File Templates.
 */
public enum EnumTest {
  SUNDAY, MONDAY;

  void sayHello() {
    System.out.println("Hello..");
  }

  public static void main(String args[]) {
    EnumTest.SUNDAY.sayHello();
    System.out.println(EnumTest.values().length);

  }
}
