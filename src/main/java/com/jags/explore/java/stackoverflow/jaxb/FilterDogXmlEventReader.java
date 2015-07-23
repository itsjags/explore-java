package com.jags.explore.java.stackoverflow.jaxb;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import javax.xml.stream.util.EventReaderDelegate;

/**
 * Created by 36262Ja on 11/05/2015.
 */
public final class FilterDogXmlEventReader extends EventReaderDelegate {

  FilterDogXmlEventReader(XMLEventReader delegate) {
    super(delegate);
  }

  public XMLEvent nextEvent() throws XMLStreamException {
    // Read next event
    XMLEvent e = super.nextEvent();
    // If it's a start element for dog
    if (e.getEventType() == XMLEvent.START_ELEMENT && "Dog".equals(e.asStartElement().getName().getLocalPart())) {
      // Then run through events until a closing dog tag
      do {
        e = super.nextEvent();
      } while (e.getEventType() != XMLEvent.END_ELEMENT || ! "Dog".equals(e.asEndElement().getName().getLocalPart()));
      // then read next tag after closing dog
      e = super.nextEvent();
    }
    return e;
  }
}