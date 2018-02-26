/**
* Java Dating Program Message Class
* 
* This Java class contains the message class of the 
* Java dating program. The functions of this class manages the messages 
* between advertisers and responders. This class contains all the set and get methods for messaging.
*
* @author  Hsu Sheng Hu Kenneth
* @version 1.0
* @since   25/02/2018
*/

public class Message {
    private String body;
    private String to;
    private String from;
   
    
    // Constructor
    public Message (String from, String to, String body){
        this.body = body;
        this.to = to;
        this.from = from;
    }
    
    // Set methods    
    public void setTo(String to)
    {this.to = to;}

    public void setBody(String body)
    {this.body = body;}
    
    public void setFrom(String from)
    {this.from = from;}
    
    // Get methods
    public String getTo() {return to;}
    public String getBody() {return body;}
    public String getFrom() {return from;}
}
