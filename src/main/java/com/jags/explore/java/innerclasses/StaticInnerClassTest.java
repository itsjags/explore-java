package com.jags.explore.java.innerclasses;

/**
 * Created by 36262Ja on 03/10/2014.
 */
public class StaticInnerClassTest {

  public static void main(String args[]) {
    StaticInnerClass.InnerStaticClass staticInnerClass = new StaticInnerClass.InnerStaticClass();
    staticInnerClass.print();
    staticInnerClass.print("hello...");
  }
}
