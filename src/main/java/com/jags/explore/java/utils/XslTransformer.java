package com.jags.explore.java.utils;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


/**
 * Created by 36262Ja on 31/10/2014.
 */
public class XslTransformer {

  public static void main(String[] args) throws IOException, URISyntaxException, TransformerException {
    TransformerFactory factory = TransformerFactory.newInstance();
    Source xslt = new StreamSource(new File("transform.xslt"));
    Transformer transformer = factory.newTransformer(xslt);

    Source text = new StreamSource(new File("input.xml"));
    transformer.transform(text, new StreamResult(new File("output.xml")));
  }
}

