package com.jags.explore.java.threads.concurrentapi.locks;

/**
 * Created by 36262Ja on 27/04/2015.
 */
public class ResourceAccessThread implements Runnable {

  private String threadName;
  private Resource resource;

  public ResourceAccessThread(String threadName, Resource resource) {
    this.threadName = threadName;
    this.resource = resource;
  }

  @Override
  public void run() {
    // If you remove the synchronized block it becomes a non synchronized access resulting in random addition to resource.
    synchronized (resource) {
      resource.add(threadName);
      System.out.println("Thread " + threadName + " exiting.");
    }
  }

}
