package com.jags.explore.java.stackoverflow;

/**
 * Created by 36262Ja on 07/05/2015.
 */
class Outer<T> {
  class Inner {

  }

  static class Nested {
    Outer.Inner inner;
//    Inner inner; // Error: Outer.this cannot be referenced from a static context
  }
}