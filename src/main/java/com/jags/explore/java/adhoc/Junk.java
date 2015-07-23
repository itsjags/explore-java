package com.jags.explore.java.adhoc;

/**
 * Created by 36262Ja on 17/07/2015.
 */
public class Junk {

  public static void main(String[] args) {
    String content = "<branchContent xmlns=\"http://yell.com/provisioning/branches/content\">\n" +
        "<description>Fabrications, AluminiumFabrications, Welding, Stainless Steel, Railings - Edit</description>\n" +
        "</branchContent>";
    System.out.println(content);
    String test = content.replaceFirst("^[<]branchContent[^>]*[>]", "").replaceFirst("[<][/]branchContent[>]$", "").trim();
    System.out.println(test);
  }
}
