package com.jags.explore.java.enums;

/**
 * Created by 36262Ja on 03/10/2014.
 */
public enum Week {
  SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

  private int dayOfWeek;
  private Week(int dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public int getDayOfWeek() {
    return this.dayOfWeek;
  }

}
