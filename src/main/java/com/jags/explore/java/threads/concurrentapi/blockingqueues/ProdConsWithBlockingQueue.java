package com.jags.explore.java.threads.concurrentapi.blockingqueues;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by 36262Ja on 21/11/2014.
 */
public class ProdConsWithBlockingQueue {

  public static void main(String args[]) throws InterruptedException {
    BlockingQueue<String> sharedBlockingQueue = new ArrayBlockingQueue<String>(1024);

    Producer producer = new Producer(sharedBlockingQueue);
    Consumer consumer = new Consumer(sharedBlockingQueue);

    new Thread(producer).start();
    new Thread(consumer).start();

    Thread.sleep(4000);
    System.out.println("Finished..");
  }
}
