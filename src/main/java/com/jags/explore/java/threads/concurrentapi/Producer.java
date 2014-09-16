package com.jags.explore.java.threads.concurrentapi;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {

  private List<String> dataList;
  private Lock lock;

  public Producer(List<String> dataList) {
    this.dataList = dataList;
    this.lock = new ReentrantLock();
  }



  @Override
  public void run() {
    produce();

  }

  private void produce() {
    try {
      lock.lock();
      while (dataList.size() < 10) {
        dataList.add("data");
      }

    } finally {
      lock.unlock();

    }

  }


}
