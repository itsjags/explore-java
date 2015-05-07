package com.jags.explore.java.threads.concurrentapi.blockingqueues;

import java.util.concurrent.BlockingQueue;

/**
 * Created by 36262Ja on 21/11/2014.
 */
public class Producer implements Runnable {

  private BlockingQueue<String> sharedBlockingQueue;

  public Producer(BlockingQueue<String> sharedBlockingQueue) {
    this.sharedBlockingQueue = sharedBlockingQueue;
  }

  @Override
  public void run() {
    System.out.println("Am I here..");

      try {
        sharedBlockingQueue.put("1");
        System.out.println("added 1 ");
//        Thread.sleep(1000);
        sharedBlockingQueue.put("2");
        System.out.println("added 2 ");
//        Thread.sleep(1000);
        sharedBlockingQueue.put("3");
        System.out.println("added 3 ");
        sharedBlockingQueue.put("4");
        System.out.println("added 4 ");

      } catch (InterruptedException e) {
        e.printStackTrace();
      }
  }
}
