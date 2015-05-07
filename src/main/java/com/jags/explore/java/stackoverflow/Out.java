package com.jags.explore.java.stackoverflow;

/**
 * Created by 36262Ja on 05/05/2015.
 */
public class Out {
  int value = 7;
  void print() {
    final int value1 = 9;//how to access this variable
    class Local {
      int value = 11;
      void print() {
        int value = 13;
        System.out.println("Value in method: " + value);
        System.out.println("Value in local class: " + this.value);
        System.out.println("Value in method of outer class: " + value1);//here
        System.out.println("Value in outer class: " + Out.this.value);
      }
    }
    new Local().print();
  }

  public static void main(String args[]) {
    Out out = new Out();
    out.print();
  }
}