package com.jags.explore.java.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by 36262Ja on 17/07/2015.
 */
public class Marshaller {

  public static String marshal(Book book) throws JAXBException {
     javax.xml.bind.Marshaller m = JAXBContext.newInstance(Book.class).createMarshaller();
m.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
//    m.setProperty("com.sun.xml.bind.xmlDeclaration", false);
    m.setProperty(javax.xml.bind.Marshaller.JAXB_FRAGMENT, true);

final StringWriter w = new StringWriter();
    m.marshal(book, w);
    return w.toString();

    }

public static Book unmarshal(final String xml) throws JAXBException {
    return (Book) JAXBContext.newInstance(Book.class)
    .createUnmarshaller()
    .unmarshal(new StringReader(xml));
    }

  public static void main (String args[]) throws JAXBException {
    System.out.println(marshal(new Book("Author", "Book Title")));
  }
}
