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
    int i = 10;
    while (i < 10) {
      sharedBlockingQueue.add("Adding .. " + i);
    }

  }
}
