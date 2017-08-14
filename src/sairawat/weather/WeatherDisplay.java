package sairawat.weather;

import org.w3c.dom.*;

public class WeatherDisplay
{

    public WeatherDisplay()
    {
    }

    public void getConditions(Document doc)
    {
        try
        {
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("channel");
            
            for(int temp = 0; temp < nList.getLength(); temp++)
            {
                Node nNode = nList.item(temp);
                
                if(nNode.getNodeType() == 1)
                {
                    Element eElement = (Element)nNode;
                    NodeList nl = eElement.getElementsByTagName("yweather:location");
                    for(int tempr = 0; tempr < nl.getLength(); tempr++)
                    {
                        Node n = nl.item(tempr);
                        if(nNode.getNodeType() == 1)
                        {
                            Element e0 = (Element)n;
                            city = e0.getAttribute("city");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e1 = (Element)n;
                            country = e1.getAttribute("country");
                        }
                    }

                    NodeList nl2 = eElement.getElementsByTagName("yweather:units");
                    for(int tempr = 0; tempr < nl2.getLength(); tempr++)
                    {
                        Node n2 = nl2.item(tempr);
                        if(nNode.getNodeType() == 1)
                        {
                            Element e2 = (Element)n2;
                            tempUnit = e2.getAttribute("temperature");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e2 = (Element)n2;
                            distanceUnit = e2.getAttribute("distance");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e2 = (Element)n2;
                            pressureUnit = e2.getAttribute("pressure");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e2 = (Element)n2;
                            speedUnit = e2.getAttribute("speed");
                        }
                    }

                    NodeList nl3 = eElement.getElementsByTagName("yweather:condition");
                    for(int tempr = 0; tempr < nl3.getLength(); tempr++)
                    {
                        Node n3 = nl3.item(tempr);
                        if(nNode.getNodeType() == 1)
                        {
                            Element e3 = (Element)n3;
                            temperature = e3.getAttribute("temp");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e3 = (Element)n3;
                            condition = e3.getAttribute("text");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e3 = (Element)n3;
                            conditionCode = e3.getAttribute("code");
                        }
                        
                    }

                    NodeList nl4 = eElement.getElementsByTagName("yweather:atmosphere");
                    for(int tempr = 0; tempr < nl4.getLength(); tempr++)
                    {
                        Node n4 = nl4.item(tempr);
                        if(nNode.getNodeType() == 1)
                        {
                            Element e4 = (Element)n4;
                            humidity = e4.getAttribute("humidity");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e4 = (Element)n4;
                            visibility = e4.getAttribute("visibility");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e4 = (Element)n4;
                            pressure = e4.getAttribute("pressure");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e4 = (Element)n4;
                            rising = e4.getAttribute("rising");
                        }
                    }

                    NodeList nl5 = eElement.getElementsByTagName("yweather:astronomy");
                    for(int tempr = 0; tempr < nl5.getLength(); tempr++)
                    {
                        Node n5 = nl5.item(tempr);
                        if(nNode.getNodeType() == 1)
                        {
                            Element e5 = (Element)n5;
                            sunrise = e5.getAttribute("sunrise");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e5 = (Element)n5;
                            sunset = e5.getAttribute("sunset");
                        }
                    }

                    NodeList nl6 = eElement.getElementsByTagName("yweather:wind");
                    for(int tempr = 0; tempr < nl6.getLength(); tempr++)
                    {
                        Node n6 = nl6.item(tempr);
                        if(nNode.getNodeType() == 1)
                        {
                            Element e6 = (Element)n6;
                            chill = e6.getAttribute("chill");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e6 = (Element)n6;
                            direction = e6.getAttribute("direction");
                        }
                        if(nNode.getNodeType() == 1)
                        {
                            Element e6 = (Element)n6;
                            speed = (new StringBuilder()).append(speed).append(e6.getAttribute("speed")).toString();
                            speed = e6.getAttribute("speed");
                        }
                    }

                }
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getTemperature()
    {
        return temperature;
    }

    public String getCondition()
    {
        return condition;
    }
    public String getConditionCode()
    {
        return conditionCode;
    }
    public String getHumidity()
    {
        return humidity;
    }

    public String getVisibility()
    {
        return visibility;
    }

    public String getPressure()
    {
        return pressure;
    }

    public String getRising()
    {
        return rising;
    }

    public String getSunrise()
    {
        return sunrise;
    }

    public String getSunset()
    {
        return sunset;
    }

    public String getWindChill()
    {
        return chill;
    }

    public String getWindDirection()
    {
        return direction;
    }

    public String getWindSpeed()
    {
        return speed;
    }

    public String getDistanceUnit()
    {
        return distanceUnit;
    }

    public String getPressureUnit()
    {
        return pressureUnit;
    }

    public String getTemperatureUnit()
    {
        return tempUnit;
    }

    public String getSpeedUnit()
    {
        return speedUnit;
    }

    public static String city;
    public static String country;
    public static String temperature;
    public static String condition;
    public static String conditionCode;
    public static String humidity;
    public static String visibility;
    public static String pressure;
    public static String rising;
    public static String sunrise;
    public static String sunset;
    public static String chill;
    public static String direction;
    public static String speed;
    public static String tempUnit;
    public static String distanceUnit;
    public static String pressureUnit;
    public static String speedUnit;
}
