package com.jags.explore.java.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

  private static final PropertiesLoader propertiesLoader = new PropertiesLoader();
  private PropertiesLoader(){}

  public static PropertiesLoader getInstance() {
    return propertiesLoader;
  }

  public Properties getProperties(final String filename) throws IOException {
    final InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(filename);
    Properties properties = new Properties();
    properties.load(resourceAsStream);
    return properties;
  }

  public static void main (String... args) throws IOException {
    final Properties properties = PropertiesLoader.getInstance().getProperties("./sample.properties");
    System.out.println(properties.getProperty("props1"));

  }

}
