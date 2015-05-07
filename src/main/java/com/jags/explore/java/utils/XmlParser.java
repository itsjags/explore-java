package com.jags.explore.java.utils;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by 36262Ja on 22/04/2015.
 */
public class XmlParser {




  public Document getDocumentFromString(String xmlString) {

    String s = "This is a test strapline ♫ 😊";
    System.out.println(s);
    final String s1 = StringEscapeUtils.escapeHtml4(s);
    System.out.println(s1);
    final String escapeXml = StringEscapeUtils.escapeHtml4(xmlString);

    System.out.println(escapeXml);


    Document doc = null;
    try {
      DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
      final InputSource inputSource = new InputSource(new StringReader(xmlString));
//      inputSource.setEncoding("UTF-16");
      doc = builder.parse(inputSource);
    } catch (ParserConfigurationException pce) {
      System.out.println("Error configuring parser: " + pce);
    } catch (IOException ioe) {
      System.out.println("Error reading String parameter: " + ioe);
    } catch (SAXException se) {
      System.out.println("Error parsing document: " + se);
    }
    return doc;
  }

  public static void main (String... args) throws IOException {
    XmlParser parser = new XmlParser();
    parser.parse("MLresponseWithCodes.txt");

  }

  private void parse(String fileName) throws IOException {
    final InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream(fileName);
    final String s = IOUtils.toString(resourceAsStream);
    new String(Files.readAllBytes(Paths.get("")));
    System.out.println(s);
    getDocumentFromString(s);

  }
}
