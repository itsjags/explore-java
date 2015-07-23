package com.jags.explore.java.utils;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by 36262Ja on 17/07/2015.
 */

@XmlRootElement
public class Book {

  public Book(String author, String title) {
    this.author = author;
    this.title = title;
  }

  public Book() {
  }

  @XmlElement
  private String author;

  @XmlElement
  private String title;
}
