package com.jags.explore.java.annotations;

import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by 36262Ja on 12/06/2015.
 */
public class EmailValid implements ConstraintValidator<Email, String> {

  @Override
  public void initialize(Email constraintAnnotation) {
    // Nothing to initialize
    System.out.println("Initializing anything needed here");
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    System.out.println("Validating");
    // Just for the sake of validating. Not a valid check
    EmailValidator emailValidator = EmailValidator.getInstance();
    return emailValidator.isValid(value);
  }
}
