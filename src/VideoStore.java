
import java.util.ArrayList;



/**
 *
 * @author Paulo Jose - w1790625
 */
public class VideoStore {
    
  private ArrayList<Video> Videolist = new ArrayList();
  private ArrayList<Customer> Customerslist = new ArrayList();
    
 public VideoStore()
    {
        
       
        String[] VideoItems = new String[]{"Man of Steel", "Drive", "Blade Runner 2049", "Fury", "Dragon Ball Super Broly", "Greenland", "Cloverfield", "The Commuter", "Gladiator", "Runner Runner"};
        String[] CustomerListNames = new String[]{"Paul", "George", "Joseph", "Gabriela", "Mary", "Angela", "Carlos", "Giselle", "Taylor", "Noah"};
        
        for(int i =0; i < 10; ++i)
        {
            this.Videolist.add(new Video(VideoItems[i]));
            this.Customerslist.add(new Customer(CustomerListNames[i], 0));
        }
        
       
        
        
    }
            
    public void Customerslist()
    {
        System.out.println("This is a list of the video store customers");
        for(int i = 0; i < Customerslist.size(); i++)
        {
            System.out.println(Customerslist.get(i).getnameofcustomer());
        }
        System.out.println();
    }
    
    public void listallvideos()
    {
        System.out.println("This is the list of all videos that are available on the video store");
        for (int i = 0; i < this.Videolist.size(); ++i)
        {
            System.out.println(((Video)this.Videolist.get(i)).toString() + "\n");
   
        }
       
    }

   public void borrow(String nameofcustomerinput, String titleofvideoinput)
   {
       
       Customer custom = null;
       
       for(int i= 0; i < this.Customerslist.size();++i)
       {
           if (((Customer)this.Customerslist.get(i)).getnameofcustomer().equalsIgnoreCase(nameofcustomerinput))
                   {
                       custom = (Customer)this.Customerslist.get(i);
                       break;
                   }
                   
       }
       
       if (custom == null)
       {
          System.out.println("There is no customer in the system named " +nameofcustomerinput+ ".");    
       }
       
       else 
       {
           Video appvid = null;
           
           for( int i = 0; i < this.Videolist.size(); ++i)
           {
               if (((Video)this.Videolist.get(i)).gettitleofvideo().equalsIgnoreCase(titleofvideoinput))
               {
                 appvid = (Video)this.Videolist.get(i);
                 break;
               }
           }
           
           if (appvid == null)
           {
               System.out.println ("There is no video titled " +titleofvideoinput+ " in the system.");
           }
           else 
           {
            custom.borrowvideo(appvid);   
           }
           
       }
   }

}


//////////////////////////////////////////