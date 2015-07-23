package com.jags.explore.java.stackoverflow.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.StringReader;

/**
 * Created by 36262Ja on 11/05/2015.
 */
public class ConvertXmlToObject {

  public static void main(String... args) throws JAXBException, XMLStreamException {
    String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
        "<root>\n" +
        "    <animals>" +
        "        <dog></dog>" +
        "        <cat></cat>" +
        "    </animals>\n" +
        "</root>";

    // create jaxb context
    JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
    XMLEventReader xmlReader = XMLInputFactory.newFactory().createXMLEventReader(new StringReader(xml));
    Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

//    Root root = (Root)unmarshaller.unmarshal(new StringReader(xml));
    Root root = (Root) unmarshaller.unmarshal(new FilterDogXmlEventReader(xmlReader ));
    System.out.println(root);
    System.out.println(root.getAnimals().size());

  }
}