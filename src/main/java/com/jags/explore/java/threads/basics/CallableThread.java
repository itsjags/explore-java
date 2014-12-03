package com.jags.explore.java.threads.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by 36262Ja on 13/11/2014.
 */
public class CallableThread implements Callable<String> {

  private final String threadName;

  public CallableThread(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public String call() throws Exception {
    System.out.println("Callable Thread " + threadName);
    return "returning " + threadName;
  }

  public static void main(String args[]) throws ExecutionException, InterruptedException {

    // NOTE: Callable cannot be given to a Thread for its execution. It has to be used along with some execution
    // services to get the results.

    ExecutorService executor = Executors.newFixedThreadPool(5);
    List<Future<String>> futures = new ArrayList<Future<String>>();
    futures.add(executor.submit(new CallableThread("t1")));
    futures.add(executor.submit(new CallableThread("t2")));
    futures.add(executor.submit(new CallableThread("t3")));
//    executor.awaitTermination(1, TimeUnit.SECONDS);
    for (Future future : futures) {
      while (!future.isDone()) {
        System.out.println("waiting on.. " + future.get());
      }
      System.out.println(future.isDone() + " : " + future.get());
    }

    executor.shutdown();

  }
}
