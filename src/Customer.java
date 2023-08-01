
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Paulo Jose - w1790625
 */

public class Customer {
    
    private String nameofcustomer;
    private int numberofborrowedvideos;
    
    public String getnameofcustomer()
    { 
        return nameofcustomer;
    }
    public void setnameofcustomer(String nameofcustomer)
    {
      this.nameofcustomer = nameofcustomer;
    }
    
    public int getnumberofborrowedvideos ()
    {
        return numberofborrowedvideos;
    }
   
    public void setnumberofborrowedvideos (int numberofborrowedvideos)
    {
        this.numberofborrowedvideos = numberofborrowedvideos;
    }
    
    public Customer (String nameofcustomer, int numberofborrowedvideos)
    {
        this.nameofcustomer = nameofcustomer;
        this.numberofborrowedvideos = numberofborrowedvideos;
 
    }
    
    public Customer()
    {
        this("", 0);
    }
            
    public void borrowvideo(Video v)
    {
       if (this.numberofborrowedvideos>=2)    
       {
           System.out.println ("This specific customer named "+this.getnameofcustomer()+ " has already has hit the limit of borrowed videos");
       }
       else if (v.getisitonloan())
               {
               SimpleDateFormat formatofreturndate = new SimpleDateFormat("dd MMMM yyyy");
              
               System.out.println("The particular video titled "+v.gettitleofvideo()+ " is already out on loan and it must be returned on "+formatofreturndate.format(v.getDatetobereturned()));
             
               
    }
       else 
       {
           SimpleDateFormat formatofreturndate = new SimpleDateFormat("dd MMMM yyyy");
           Calendar appcalendar = Calendar.getInstance();
           appcalendar.setTime(new Date());
           appcalendar.add (Calendar.DATE, 3);
           v.setDatetobereturned(appcalendar.getTime());
           v.setisitonloan(true);
           this.setnumberofborrowedvideos(this.getnumberofborrowedvideos() + 1);
           System.out.println("The video titled " + v.gettitleofvideo() + " has been borrowed to the customer named " + this.getnameofcustomer() + ".");
           System.out.println("The date in which the video must be returned is " + formatofreturndate.format(v.getDatetobereturned()));
                   
       }
}
    
}
