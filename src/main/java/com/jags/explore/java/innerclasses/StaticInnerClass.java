package com.jags.explore.java.innerclasses;

/**
 * Created by 36262Ja on 03/10/2014.
 */
public class StaticInnerClass {

  private int var = 10;
  private String str = "hello world ";
  private static int staticVar = 20;

  static class InnerStaticClass {
    InnerStaticClass() {
      System.out.println("inner static class constructor");
    }

    public void print() {
      System.out.println("Printing private outer class var " + staticVar);
    }

    public void print(String str) {
      System.out.println("Printing string " + str);
    }

  }

  public void printOuter() {
    new InnerStaticClass().print(str);
  }
}
