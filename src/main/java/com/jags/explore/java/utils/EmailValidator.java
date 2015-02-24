package com.jags.explore.java.utils;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 36262Ja on 20/02/2015.
 */
public class EmailValidator {

  public static boolean isValidEmailAddress(String email) {
    boolean result = true;
    try {
      InternetAddress emailAddr = new InternetAddress(email);
      emailAddr.validate();
    } catch (AddressException ex) {
      result = false;
    }
    return result;
  }

  public static boolean isValidEmailAddressSyntax(String email) {
    String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
    java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
    java.util.regex.Matcher m = p.matcher(email);
    return m.matches();
  }

  public static boolean isValidEmailDomain(String email) {
    Pattern pattern = Pattern.compile("\\S+?(@hibu\\.com|@hibu\\.co.uk)");
    Matcher matcher = pattern.matcher(email);

    if (matcher.matches()) {
      System.out.println("Matches"); // Prints this for this email
    }
    return matcher.matches();
  }

  public static String fetchEmailDomain(String email) {
    return email.substring(email.lastIndexOf('@'));
  }

  public static boolean validateEmailDomain(String email) {
    String domains = "@yell.com,@yellgroup.com,@hibu.com,@hibu.co.uk";
    final String[] split = domains.split(",");
    final List<String> domainsList = Arrays.asList(split);
    final String domain = fetchEmailDomain(email);
    return domainsList.contains(domain);
  }

  public static String getDomainPattern() {
    String domains = "@yell.com,@yellgroup.com,@hibu.com,@hibu.co.uk";
    domains = domains.replaceAll("\\.", "\\\\.");
    domains = domains.replaceAll("\\.", "\\\\.");
    System.out.println(domains);
    final String[] split = domains.split(",");
    System.out.println(split.length);
    StringBuffer pattern = new StringBuffer("\\S+?(");

    for (String s : split) {
      pattern.append(s).append("|");
    }
    System.out.println(pattern.substring(0, pattern.lastIndexOf("|")));
    return pattern.toString().substring(0, pattern.lastIndexOf("|")).concat(")");
  }

  public  static void main(String args[]) {
    String email = "jagad@eesh.kumar@yellgroup.co.uk";
    System.out.println(EmailValidator.validateEmailDomain(email));
    System.out.println(EmailValidator.fetchEmailDomain(email));
    System.out.println(EmailValidator.getDomainPattern());
    System.out.println(EmailValidator.isValidEmailDomain(email));
    System.out.println(EmailValidator.isValidEmailAddressSyntax(email));
    System.out.println(EmailValidator.isValidEmailAddress(email));
  }
}
