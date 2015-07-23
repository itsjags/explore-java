package com.jags.explore.java.annotations;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by 36262Ja on 12/06/2015.
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmailValid.class )
public @interface Email {


  String message() default "Invalid email format";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};

}
