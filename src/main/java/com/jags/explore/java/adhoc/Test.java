package com.jags.explore.java.adhoc;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

public class Test {

  static class t {}



  public static void main(String a[]) throws UnsupportedEncodingException {
    String s = "&pound;" + 10.00;
    System.out.println(s);

    Date date = Date.from(Instant.now());
    System.out.println(date);

//    LocalDate

    Locale locale = Locale.UK;
    Currency curr = Currency.getInstance(locale);
    System.out.println("Symbol: " + curr.getCurrencyCode());

    int x = 1, y = 2;
    ArrayList<String> list = new ArrayList<String>();
    Class test = Test.class ;
    if (test == Test.class) {

    }
    list.add("test");
    byte arr[] = new byte[] {1,2};
    t te = new t();
    int num = 0;
    if (num >= 0);
    System.out.println(String.format("LT : %tT", Calendar.getInstance()));
    System.out.println(String.format("LT : %tH:%tM:%tS", Calendar.getInstance(), Calendar.getInstance(), Calendar.getInstance()));

    StringTokenizer st1 = new StringTokenizer(",a,b", ",");
    StringTokenizer st2 = new StringTokenizer(",,ab", ",");
    StringTokenizer st3 = new StringTokenizer("ab,,,", "b");
    StringTokenizer st4 = new StringTokenizer(",ab,,a,", ",");
    System.out.println(st1.countTokens());
    System.out.println(st2.countTokens());
    System.out.println(st3.countTokens());
    System.out.println(st4.countTokens());

    DocumentBuilderFactory factory = null;

    testLength();

  }

  public static void testLength() {
    String r = "0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789 d d g\n" +
        "ssdfsdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdfasdffsdfasdfasdfasdfasd        end";

    System.out.println(r.length());
  }

}
