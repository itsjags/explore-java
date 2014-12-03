package com.jags.explore.java.threads.basics;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by 36262Ja on 20/11/2014.
 */
public class BlockingQueueTest {

  BlockingQueue<String> stringBlockingQueue = new ArrayBlockingQueue<String>(3);

  public BlockingQueueTest(BlockingQueue<String> stringBlockingQueue) {
    this.stringBlockingQueue = stringBlockingQueue;
  }
}
