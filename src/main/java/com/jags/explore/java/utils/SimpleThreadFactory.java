package com.jags.explore.java.utils;

import java.util.concurrent.ThreadFactory;

/**
 * Created by 36262Ja on 28/04/2015.
 */
public class SimpleThreadFactory implements ThreadFactory {
  @Override
  public Thread newThread(Runnable runnable) {
    return new Thread(runnable);
  }
}
