package DAY14;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

public class ParseXML extends DefaultHandler {

    public static void main(String[] args) {
        try {
            SAXParserFactory fact=SAXParserFactory.newInstance();
            SAXParser parser=fact.newSAXParser();
            parser.parse(new File("C:\\Users\\arjun\\Desktop\\MindBridge\\CoreJava\\DAY14\\College.xml"),new ParseXML());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void startDocument() throws SAXException{
        System.out.println("Document Started");
    }
    public void endDocument() throws SAXException{
        System.out.println("Document Ended");
    }
    public void startElement(String uri, String localname, String qname, Attributes attributes) throws SAXException {
        System.out.println("Start Element"+qname);
    }
    public void endElement(String uri, String localname, String qname) throws SAXException{
        System.out.println("End element"+qname);
    }
    public void characters(char[]ch,int srt,int len) throws SAXException{
        System.out.println("Characters = "+new String(ch,srt,len));
    }
}
