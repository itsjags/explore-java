package com.jags.explore.java.threads.concurrentapi.locks;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 36262Ja on 27/04/2015.
 *
 * A shared resource accessed by multiple threads
 */
public class Resource {
  private List<String> list = new ArrayList<String>();

  public void add(String threadName) {
    for(int i=0; i<10; i++) {
    System.out.println( threadName + ":" +i);
//    synchronized (list) {
      list.add(threadName + ":" + i);
    }
  }

  public void remove() {
    for(int i=0; i<10; i++) {
    System.out.println("Removing : " + i);
//    synchronized(list) {
      list.remove("Removing : " + i);
    }
  }
}
