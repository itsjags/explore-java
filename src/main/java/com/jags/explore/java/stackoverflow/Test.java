package com.jags.explore.java.stackoverflow;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by 36262Ja on 07/05/2015.
 */
public class Test {
  BigDecimal big = new BigDecimal(10);
  BigInteger bigInt = new BigInteger("12334");

  public String toString() {
//    return ToStringBuilder.reflectionToString(this).concat("big:" + big);
    ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
    return ToStringBuilder.reflectionToString(this);
  }

  public static void main(String args[]) {
    Test test = new Test();
    System.out.println(test);

    int arr[] = new int[]{};

    int salesPhone = 1;
    System.out.println(salesPhone++ + ++salesPhone +
        ++salesPhone);
  }
}
