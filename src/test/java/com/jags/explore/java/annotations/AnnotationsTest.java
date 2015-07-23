package com.jags.explore.java.annotations;

import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.assertj.core.api.StrictAssertions.assertThat;

/**
 * Created by 36262Ja on 12/06/2015.
 */
public class AnnotationsTest {

  private static Validator validator;
  @Before
  public void setup() {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    validator = factory.getValidator();
  }

  @Test
  public void testEmailAnnotationWithInvalidEmail() {
    Contact contact = new Contact("jags", "080");
    final Set<ConstraintViolation<Contact>> constraintViolations = validator.validate(contact);
    assertThat(constraintViolations.size()).isEqualTo(1);
    assertThat(constraintViolations.iterator().next().getMessage()).isEqualTo("Custom validation Message");

  }

  @Test
  public void testEmailAnnotationWithValidEmail() {
    Contact contact = new Contact("jags@test.com", "080");
    final Set<ConstraintViolation<Contact>> constraintViolations = validator.validate(contact);
    assertThat(constraintViolations.size()).isEqualTo(0);
  }

}
