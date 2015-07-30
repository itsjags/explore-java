package com.jags.explore.java.generics;

/**
 * Created by 36262Ja on 24/07/2015.
 */
public class FruitFactory<T> {

  public T createFactory(Class<T> cls) throws IllegalAccessException, InstantiationException {
    return cls.newInstance();
  }
}
