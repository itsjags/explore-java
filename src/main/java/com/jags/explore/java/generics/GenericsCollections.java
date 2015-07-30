package com.jags.explore.java.generics;

import java.util.*;

/**
 * Created by 36262Ja on 24/07/2015.
 */
public class GenericsCollections {

  public static void main(String[] args) {

    List<String> list = new ArrayList<String>(); // Prior to Java 7
    List<String> list7 = new ArrayList<>(); // From java 7 compiler infers the type from variable. Hence ArrayList<String> is not needed

    final Iterator<String> iterator = list.iterator();
    while(iterator.hasNext()) {
      final String next = iterator.next(); // No need to cast from Object to String as it is inferred from generics specification
    }
    // forEach
    for (String next : list) {
      System.out.println(next); // No need to cast
    }

    // Same applies to SET

    Map<String, String> map = new HashMap<String, String>(); // prior to Java 7
    Map<String, String> map7 = new HashMap<>(); // Java 7 onwards

  }
}
