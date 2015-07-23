package com.jags.explore.java.stackoverflow;

import org.junit.*;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 36262Ja on 08/05/2015.
 */
public class LockTest {

  @org.junit.Test
  public void testLock() {
    Lock lock = new ReentrantLock();
    while (true) {
//      if (lock.tryLock()) {
      lock.lock();
        //lock.lock(); same result if I include an explicit lock here
        System.out.println("has been locked");
//      }
    }
  }
}