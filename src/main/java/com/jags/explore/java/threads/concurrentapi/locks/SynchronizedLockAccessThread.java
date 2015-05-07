package com.jags.explore.java.threads.concurrentapi.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 36262Ja on 27/04/2015.
 */
public class SynchronizedLockAccessThread implements Runnable {

  private Resource resource;
  private String threadName;

  private Lock lock = new ReentrantLock();

  public SynchronizedLockAccessThread(Resource resource, String threadName) {
    this.resource = resource;
    this.threadName = threadName;
  }

  @Override
  public void run () {
    lock.lock();
    resource.add(threadName);
    System.out.println("Exit Thread " + threadName);
    lock.unlock();
  }

}
