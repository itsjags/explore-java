package com.jags.explore.java.adhoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36262Ja on 18/11/2014.
 */
public class Basics {

  static String names[] = {"Jag", "K"};

  public static void main (String... args) {
    for(String name : names) {
      System.out.println(name);
    }

    String path = "plumbers in england";
    final String[] split = path.split("((or)|(near))");
    System.out.println(split);

    List<String> list = new ArrayList<String>();
    System.out.println(list.contains("New") + " : " + list.size());
    list.add("old");
    list.set(0, "Test");
  }
}
