package com.jags.explore.java.threads.concurrentapi;

import java.util.concurrent.CountDownLatch;

/**
 * Created by 36262Ja on 04/06/2015.
 */
public class CountDownLatchTest {

  private static final CountDownLatch beginLatch = new CountDownLatch(1);
  private static final CountDownLatch endLatch = new CountDownLatch(2);


  public static void main(String... args) {

    System.out.println("Beginning Process..");

    Thread kwiThread = new Thread(new LocationInterpreterTask(beginLatch, endLatch));
    Thread liThread = new Thread(new KWInterpreterTask(beginLatch, endLatch));
    kwiThread.start();
    liThread.start();

    try {
      System.out.println("Waiting deliberately");
      Thread.sleep(5000);
      System.out.println("Begin.. ");
      beginLatch.countDown();
      System.out.println("awaiting end. ");
      endLatch.await();
      System.out.println("Finished. ");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

interface InterpreterTask extends Runnable {
  void execute();
}

class KWInterpreterTask implements InterpreterTask {

  private final CountDownLatch beginLatch;
  private final CountDownLatch endLatch;

  KWInterpreterTask(CountDownLatch beginLatch, CountDownLatch endLatch) {
    this.beginLatch = beginLatch;
    this.endLatch = endLatch;
  }

  @Override
  public void execute() {
    System.out.println("Executing KW Interpreter Task with wait");
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }


  @Override
  public void run() {
    try {
      System.out.println("Waiting for begin Latch");
      beginLatch.await();
      execute();
      endLatch.countDown();
      System.out.println("Counting down KW Interpreter Task : " + endLatch.getCount() );
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}

class LocationInterpreterTask implements InterpreterTask {

  private final CountDownLatch beginLatch;
  private final CountDownLatch endLatch;

  LocationInterpreterTask(CountDownLatch beginLatch, CountDownLatch endLatch) {
    this.beginLatch = beginLatch;
    this.endLatch = endLatch;
  }

  @Override
  public void execute() {
    System.out.println("Executing location interpreter task");
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void run() {
    try {
      System.out.println("Waiting for begin Latch");
      beginLatch.await();
      execute();
      endLatch.countDown();
      System.out.println("Counted down location interpreter task" + endLatch.getCount() );
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
