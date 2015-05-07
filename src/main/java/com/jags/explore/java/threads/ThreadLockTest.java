package com.jags.explore.java.threads;

public class ThreadLockTest {


  public synchronized void method1(ThreadLockTest test1) {
    System.out.println("Aquired method 1");
    try {
      Thread.sleep(5000);
      test1.method2(this);
    } catch (InterruptedException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
    System.out.println("Exiting method 1");
  }

  public synchronized void method2(ThreadLockTest test2) {
    System.out.println("Aquired method 2");
    try {
      test2.method1(this);
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
    System.out.println("Exiting method 2");
  }

  public static void main (String... args) {

    final ThreadLockTest obj1 = new ThreadLockTest();
    final ThreadLockTest obj2 = new ThreadLockTest();

    Thread t1 = new Thread() {
      public void run() {
        obj1.method1(obj2);
      }
    };
    t1.start();

    try {
      t1.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    new Thread() {
      public void run() {
        obj2.method2(obj1);
      }
    }.start();

    System.out.println("Exiting.. ");

  }


}



