package com.jags.explore.java.threads.concurrentapi;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 36262Ja on 20/10/2014.
 */
public class Consumer implements Runnable {

  private BlockingQueue sharedQueue;
  private Lock lock;

  public Consumer(BlockingQueue sharedQueue) {
    this.sharedQueue = sharedQueue;
    lock = new ReentrantLock();
  }

  public void consume() {
    lock.lock();
//    sharedList.get()
  }

  @Override
  public void run() {

  }
}
