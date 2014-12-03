package com.jags.explore.java.threads.basics;

/**
 * Created by 36262Ja on 13/11/2014.
 */
public class ExtendedThread extends Thread {

  public ExtendedThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    System.out.println("Started thread " + getName());
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void main (String args[]) {
    Thread t1 = new ExtendedThread("1");
    Thread t2 = new ExtendedThread("2");
    Thread t3 = new ExtendedThread("3");
    t1.start();
    t2.start();
    t3.start();

    System.out.println("Main Finished");
  }
}
