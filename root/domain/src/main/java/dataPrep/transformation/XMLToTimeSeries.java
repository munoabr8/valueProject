package dataPrep.transformation;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XMLToTimeSeries {
    public static void main(String[] args) throws Exception {
    	
    	System.out.println("Current Working Directory: " + System.getProperty("user.dir"));
        // Load and parse the XML file
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("data.xml");

        // Extract relevant data elements and timestamps
        NodeList dataNodes = document.getElementsByTagName("data");
        List<DataPoint> timeSeries = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (int i = 0; i < dataNodes.getLength(); i++) {
            Element dataElement = (Element) dataNodes.item(i);
            String timestampStr = dataElement.getAttribute("timestamp");
            Date timestamp = dateFormat.parse(timestampStr);
            String value = dataElement.getTextContent();

            timeSeries.add(new DataPoint(timestamp, value));
        }

        // Sort the time series by timestamp
        timeSeries.sort((dp1, dp2) -> dp1.getTimestamp().compareTo(dp2.getTimestamp()));

     // Feedback
     for (DataPoint dataPoint : timeSeries) {
         System.out.println("Timestamp: " + dataPoint.getTimestamp() + " Value: " + dataPoint.getValue());
     }
        
        
        // Create a new XML document or other data structure for the time series
        // and output the result as needed
    }
}

class DataPoint {
    private Date timestamp;
    private String value;

    public DataPoint(Date timestamp, String value) {
        this.timestamp = timestamp;
        this.value = value;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getValue() {
        return value;
    }
}
