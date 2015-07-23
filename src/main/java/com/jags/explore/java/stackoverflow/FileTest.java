package com.jags.explore.java.stackoverflow;

import java.io.File;

/**
 * Created by 36262Ja on 12/05/2015.
 */
public class FileTest {

  public static void main(String args[]) {

    File file = new File("C:/jags/Tech");
    for (File f : file.listFiles()) {

      System.out.println(f.getName());
    }
  }
}
