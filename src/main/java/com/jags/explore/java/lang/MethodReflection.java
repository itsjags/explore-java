package com.jags.explore.java.lang;

import com.jags.explore.java.utils.EmailValidator;
import com.jags.explore.java.utils.SendEmail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by 36262Ja on 05/05/2015.
 */
public class MethodReflection {

  public static void main(String args[]) {


    Constructor<?>[] constructors = SendEmail.class.getConstructors();
    System.out.println(constructors.length);
    System.out.println(constructors[0]);

    final Method[] methods = EmailValidator.class.getDeclaredMethods();
    System.out.println(methods.length);
    for (Method method : methods) {
      System.out.println(method.getName());
    }

  }
}
