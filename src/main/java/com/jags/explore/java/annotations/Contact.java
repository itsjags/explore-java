package com.jags.explore.java.annotations;

/**
 * Created by 36262Ja on 25/06/2015.
 */
public class Contact {

  @Email(message = "Custom validation Message")
  private String email;

  private String phone;

  public Contact(String email, String phone) {
    this.email = email;
    this.phone = phone;
  }

}
