package com.jags.explore.java.threads.concurrentapi.locks;

/**
 * Created by 36262Ja on 27/04/2015.
 */
public class NonSynchronizeDemo {

  public static void main (String args[]) {
    Resource ioResource = new Resource();

    Thread t1 = new Thread(new ResourceAccessThread("T1", ioResource));
    Thread t2 = new Thread(new ResourceAccessThread("T2", ioResource));

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Main Thread Finished");

  }

}
