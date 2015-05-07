package com.jags.explore.java.threads.concurrentapi.blockingqueues;

import java.util.concurrent.BlockingQueue;

/**
 * Created by 36262Ja on 04/12/2014.
 */
public class Consumer implements Runnable {

  private BlockingQueue<String> sharedQueue;

  public Consumer(BlockingQueue<String> sharedQueue) {
    this.sharedQueue = sharedQueue;
  }

  @Override
  public void run() {
    try {
      System.out.println("Taking.. ");
      Thread.sleep(2000);
      System.out.println(sharedQueue.take());
      System.out.println(sharedQueue.take());
      System.out.println(sharedQueue.take());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
