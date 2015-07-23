package com.jags.explore.java.threads.concurrentapi;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 36262Ja on 04/06/2015.
 */
public class CyclicBarrierTest {

  private static final CyclicBarrier barrier = new CyclicBarrier(11, new Runnable() {

    @Override
    public void run() {
      System.out.println("Finalizing the finished data." + Thread.currentThread().getName());
    }
  });

  static class Worker implements Runnable {

    private final CyclicBarrier barrier;
    private long sleepDuration;

    Worker(CyclicBarrier barrier, long sleepDuration) {
      this.barrier = barrier;
      this.sleepDuration = sleepDuration;
    }

    @Override
    public void run() {
      System.out.println("Processing something : " +barrier.getNumberWaiting() );
      try {
        Thread.sleep(sleepDuration);
        barrier.await();
      } catch (InterruptedException e) {
        e.printStackTrace();
      } catch (BrokenBarrierException e) {
        e.printStackTrace();
      }
      System.out.println("DONE Processing something and awaiting" + barrier.getParties());

    }
  }

  public static void main(String args[]) {
    int poolSize = 10;
    final ExecutorService executorService = Executors.newFixedThreadPool(poolSize);
    for (int i= 1; i <= poolSize; i++) {
      executorService.submit(new Worker(barrier, i * 500));
    }
    System.out.println("Main Thread Finishing");
    try {
      System.out.println("Waiting in main..");
      Thread.sleep(10000);
      barrier.await();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (BrokenBarrierException e) {
      e.printStackTrace();
    }
    executorService.shutdown();
  }
}
