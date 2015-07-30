package com.jags.explore.java.generics;

/**
 * Created by 36262Ja on 24/07/2015.
 */
public class FruitProducer {

  public static void main(String[] args) throws InstantiationException, IllegalAccessException {
    FruitFactory<Class> factory = new FruitFactory<>();
//    factory.createFactory(Fruit.class);
//    factory.createFactory(Apple.class);
  }

}

class Fruit {

  Fruit() {
    System.out.println("Created a fruit");
  }
}

class Apple extends Fruit {
  Apple () {
    System.out.println("Created an Apple");
  }
}

class Orange extends Fruit {
  Orange() {
    System.out.println("Created an Orange");
  }
}
