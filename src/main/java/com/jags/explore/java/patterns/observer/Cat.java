package com.jags.explore.java.patterns.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by 36262Ja on 29/07/2015.
 */
public class Cat extends Animal  {
  @Override
  public void draw() {
    System.out.println("Drawing Cat..");
    notifyObservers();
  }

}
