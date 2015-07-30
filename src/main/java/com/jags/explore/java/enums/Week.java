package com.jags.explore.java.enums;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by 36262Ja on 03/10/2014.
 */
// enum can implement an interface. But can not extend a class because all enum types are extended from Enum class
// which in turn extends Object and implements Serializable and Comparable interfaces
public enum Week implements Closeable{
  SUNDAY(1) {
    // enum type value can override inherited method
    @Override
    public String toString() {
      System.out.println("inside Sunday toString()");
      return "SUNDAY implementaion";
    };

    // Each enum type value must override abstract method
    @Override
    protected String getWeather() {
      return "Sunday Weather";
    }

  }, MONDAY(2) {
    @Override
    public String getWeather() {
      return "Monday Weather";
    }
  }, TUESDAY(3) {
    @Override
    public String getWeather() {
      return "Tuesday Weather";
    }
  }, WEDNESDAY(4) {
    @Override
    public String getWeather() {
      return "Wednesday Weather";
    }
  }, THURSDAY(5) {
    @Override
    public String getWeather() {
      return "Thursday Weather";
    }
  }, FRIDAY(6) {
    @Override
    public String getWeather() {
      return "Friday Weather";
    }
  }, SATURDAY(7) {
    @Override
    protected String getWeather() {
      return "Saturday Weather";
    }
  };

  private int dayOfWeek;

  protected abstract String getWeather();

  //enum constructor must be private
  private Week(int dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  //enum can have methods
  public int getDayOfWeek() {
    return this.dayOfWeek;
  }


  //enum can override methods
  @Override
  public String toString() {
    System.out.println("Inside enum toString()..");
    return super.toString();
  }

  //enum can
  @Override
  public void close() throws IOException {

  }
}
