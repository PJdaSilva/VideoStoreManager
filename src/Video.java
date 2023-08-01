
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
/**
 *
 * @author Paulo Jose - w1790625
 */
public class Video {
    
    private String titleofvideo;
    private Date Datetobereturned;
    private boolean isitonloan;
    
   
    public String gettitleofvideo()
   {
       return titleofvideo;
   }
   
   public void settitleofvideo (String titleofvideo)
   {
       this.titleofvideo = titleofvideo;
   }
   
   public Date getDatetobereturned()
   {
       return Datetobereturned;
   }
   
   public void setDatetobereturned (Date Datetobereturned)
   {
       this.Datetobereturned = Datetobereturned;
   }
   
   public boolean getisitonloan()
   {
       return isitonloan;
   }
   
   public void setisitonloan (boolean isitonloan)
   {
       this.isitonloan = isitonloan;
   }
   
   public Video (String titleofvideo)
   {
       this.settitleofvideo (titleofvideo);
       this.setDatetobereturned (Datetobereturned);
       this.setisitonloan (false);
   }
   
    public Video() 
    {
        this("");
    }
    
   public String toString()
           
           
   {
       
       
   
     SimpleDateFormat formatofreturndate = new SimpleDateFormat ("dd MMMM yyyy");
     
     
     String methodinterface = "";
     
     methodinterface = methodinterface + "Title of the video: " + this.gettitleofvideo() + "\n";
     methodinterface = methodinterface + "Status of the video: ";
     
     if (this.getisitonloan())
     {
        methodinterface = methodinterface + "Already on loan and should be given by " + formatofreturndate.format(this.getDatetobereturned());
     }
     else
     {
         methodinterface = methodinterface + "On the shelf";
     }
     return methodinterface;
     
     
     
       
   }
   
}
