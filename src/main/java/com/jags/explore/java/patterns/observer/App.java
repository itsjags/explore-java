package com.jags.explore.java.patterns.observer;

/**
 * Created by 36262Ja on 29/07/2015.
 */
public class App {

  public static void main(String[] args) {
    Animal cat = new Cat();
//    cat.addObserver();
    cat.draw();

    Animal dog = new Dog();
    dog.draw();
  }
}
