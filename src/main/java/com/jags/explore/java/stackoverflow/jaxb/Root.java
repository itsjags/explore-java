package com.jags.explore.java.stackoverflow.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by 36262Ja on 11/05/2015.
 */
@XmlRootElement(name = "root")
public class Root {

  private List<Animal> animals;
  private List<Animal> animalsDog;

  public List<Animal> getAnimals() {
    return animals;
  }

  @XmlElementWrapper(name = "animals")
  @XmlElements({
      @XmlElement(name = "dog", type = Dog.class),
      @XmlElement(name = "cat", type = Cat.class)
  })
  public void setAnimals(List<Animal> animals) {
    this.animals = animals;
  }

  @Override
  public String toString() {
    return "Root{" +
        "animals=" + animals +
        '}';
  }
}
