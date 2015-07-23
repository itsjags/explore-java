package com.jags.explore.java.lang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by 36262Ja on 12/05/2015.
 */
public class MultipleExceptions {
  public static void main(String args[]) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("file.txt");
      System.out.println("File Opened");
      fis.read();
      System.out.println("Read File");
    }
/*    finally {
      System.out.println("finally");
    }*/
    catch (FileNotFoundException fnfe) {
      System.out.println("File not found");
    }
    catch (IOException ioe) {
      System.out.println("File Closing Exception");
    }
      finally {
      System.out.println("finally");
    }
    System.out.println("Next task..");
  }
}