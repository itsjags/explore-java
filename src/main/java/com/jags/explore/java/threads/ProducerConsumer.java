package com.jags.explore.java.threads;


import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/*
* In computing, the producer–consumer problem (also known as the bounded-buffer problem) is a classic example of a
* multi-process synchronization problem. The problem describes two processes, the producer and the consumer, who share
* a common, fixed-size buffer used as a queue. The producer's job is to generate a piece of data, put it into the
* buffer and start again. At the same time, the consumer is consuming the data (i.e., removing it from the buffer) one
* piece at a time. The problem is to make sure that the producer won't try to add data into the buffer if it's full
* and that the consumer won't try to remove data from an empty buffer.
*
*/
public class ProducerConsumer {


  public static void main (String... args) throws InterruptedException {

    Queue<String> sharedQueue = new ArrayDeque<String>();
    Thread producerThread = new Thread(new Producer(sharedQueue));
    Thread consumerThread = new Thread(new Consumer(sharedQueue)) ;
    Thread consumerThread2 = new Thread(new Consumer(sharedQueue)) ;
    consumerThread.start();
    producerThread.start();
    consumerThread2.start();
    producerThread.join();
    consumerThread.join();

  }
}

class Producer implements Runnable {

  private final Queue<String> sharedQueue;

  Producer(Queue<String> sharedQueue) {
    this.sharedQueue = sharedQueue;
  }

  @Override
  public void run() {
    produce();
  }

  private void produce() {
    synchronized (sharedQueue) {

    while (sharedQueue.size() < 11) {
//      System.out.println("inside..");
      Random random = new Random();
      int i = random.nextInt();
      System.out.println("Producing item " + i);
      sharedQueue.add("Item:" + i);

/*
      if (sharedQueue.size() == 10) {
        try {
          wait();
          break;
        } catch (InterruptedException e) {
          e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
      }
*/
    }
    notifyAll();
  }
}
}

class Consumer implements Runnable {

  private final Queue<String> sharedQueue;

  public Consumer(Queue<String> sharedQueue) {
    this.sharedQueue = sharedQueue;

  }

  @Override
  public void run() {
    consume();
  }

  private void consume() {
    synchronized (sharedQueue) {
      if (sharedQueue.size() == 0) {
        System.out.println("Going to wait..");
        try {
          sharedQueue.wait();
        } catch (InterruptedException e) {
          e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
      }
    while (sharedQueue.size() > 0) {
      String  item = sharedQueue.poll();
      System.out.println("                  " + item + " is consumed");
/*
      if (sharedQueue.isEmpty()) {
        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
      }
*/

      }
      sharedQueue.notifyAll();
    }
  }
}
