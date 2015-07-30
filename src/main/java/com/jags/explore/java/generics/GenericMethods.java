package com.jags.explore.java.generics;

import java.util.Collection;

/**
 * Created by 36262Ja on 24/07/2015.
 */
public class GenericMethods {

  public <T> T addAndReturn(T t, Collection<T> collection) {
    collection.add(t);
    return t;
  }


}
