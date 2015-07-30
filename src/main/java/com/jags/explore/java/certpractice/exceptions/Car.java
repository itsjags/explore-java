package com.jags.explore.java.certpractice.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipException;

/**
 * Created by 36262Ja on 24/07/2015.
 */
public class Car extends Vehicle {

  /**
   *
   * @throws FileNotFoundException
   *
   * Overriding method can throw only narrower
   */
  @Override
  public void getInfo()  throws FileNotFoundException {
//    super.getInfo();
    System.out.println("sub class info");
  }

  public static void main(String[] args) {
    Vehicle car = new Car();
    try {
      car.getInfo();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
