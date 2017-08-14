package sairawat.weather;

import java.io.*;
import java.net.URL;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class WeatherDoc
{

    public WeatherDoc(String WOEID,String unit) throws IOException
    {
        WeatherDisplay disp = new WeatherDisplay();
        Document doc = generateXML(WOEID, unit);
        disp.getConditions(doc);
    }

    public static Document generateXML(String code,String unit)
        throws IOException
    {
        
       String XmlData = null;
       String url="https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20%3D"+code+"%20and%20u%3D%27"+unit+"%27&format=xml&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys";
               
       URL xmlUrl = new URL(url);
        InputStream in = xmlUrl.openStream();
        Document doc = parse(in);
        return doc;
    }

    public static Document parse(InputStream is)
    {
        Document doc = null;
        try
        {
            DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
            domFactory.setValidating(false);
            domFactory.setNamespaceAware(false);
            DocumentBuilder builder = domFactory.newDocumentBuilder();
            doc = builder.parse(is);
        }
        catch(IOException | ParserConfigurationException | SAXException ex)
        {
            System.err.println((new StringBuilder()).append("unable to load XML: ").append(ex).toString());
        }
        return doc;
    }

    
}
