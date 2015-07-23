package com.jags.explore.java.threads;

import org.apache.commons.lang3.RandomStringUtils;
import sun.java2d.loops.GraphicsPrimitive;

import java.util.ArrayList;
import java.util.List;

public class RacingCondition {


  private List<String> list = new ArrayList<String>();

  class ProductRead implements Runnable {

    public synchronized void read() {
      System.out.println("Reading...");
      if (list.size() == 0) {
        try {
//          wait();
          Thread.sleep(3000);
        } catch (InterruptedException e) {
          e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
      }
      list.get(0);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
      }
    }

    @Override
    public void run() {
      read();
    }
  }

  class ProductWrite implements Runnable {

    public synchronized void write() {
      System.out.println("writing...");
      if (list.size() == 10) {
        try {
          wait();
        } catch (InterruptedException e) {
          e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
      }
      list.add(RandomStringUtils.random(6));

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
      }
    }

    @Override
    public void run() {
      write();
    }
  }

  public void init() {
    Thread reader = new Thread(new ProductRead());
    Thread writer = new Thread(new ProductWrite());
    writer.start();
    reader.start();
    try {
      reader.join();
      writer.join();
    } catch (InterruptedException e) {
      e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
    }
  }

  public static void main(String args[]) {
    RacingCondition condition = new RacingCondition();
    condition.init();



  }


}
