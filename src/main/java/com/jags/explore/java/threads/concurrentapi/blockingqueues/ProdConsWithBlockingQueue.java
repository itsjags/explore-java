package com.jags.explore.java.threads.concurrentapi.blockingqueues;

import com.jags.explore.java.utils.SimpleThreadFactory;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

/**
 * Created by 36262Ja on 21/11/2014.
 */
public class ProdConsWithBlockingQueue {

  private final static ThreadFactory threadFactory = new SimpleThreadFactory();

  public static void main(String args[]) throws InterruptedException {
    BlockingQueue<String> sharedBlockingQueue = new ArrayBlockingQueue<String>(2);

    Producer producer = new Producer(sharedBlockingQueue);
    Consumer consumer = new Consumer(sharedBlockingQueue);

    threadFactory.newThread(producer).start();
    threadFactory.newThread(consumer).start();

//    new Thread(producer).start();
//    new Thread(consumer).start();

    Thread.sleep(4000);
    System.out.println("Finished..");
  }
}
