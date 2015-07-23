package com.jags.explore.java.lang;

/**
 * Created by 36262Ja on 12/05/2015.
 */
public class CatchError {
    public static void main(String args[]) {
      try {
        myMethod();
      }
      catch (StackOverflowError s) {
        for (int i=0; i<2; ++i)
          System.out.println(i);
      }
    }
    public static void myMethod() {
      myMethod();
    }
  }

/*
Prints
0
1
 */