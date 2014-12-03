package com.jags.explore.java.threads.basics;

/**
 * Created by 36262Ja on 13/11/2014.
 */
public class RunnableThread implements Runnable {

  private final String threadName;

  public RunnableThread(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public void run() {
    System.out.println("Runnable Thread " + threadName);
  }

  public static void main (String args[]) {

    Thread t1 = new Thread(new RunnableThread("t1"));
    Thread t2 = new Thread(new RunnableThread("t2"));
    Thread t3 = new Thread(new RunnableThread("t3"));

    t1.start();
    t2.start();
    t3.start();

    System.out.println("Main Thread finished");

  }
}
