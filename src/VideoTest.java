

/**
 *
 * @author 17906252 - Paulo Jose - w1790625
 */

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VideoTest {
    
    
    
    public static void main(String [] args)
            
    {
        
        Scanner menuinput = new Scanner(System.in);
        VideoStore newvs = new VideoStore();
        
        String menuselection = " "; 
        
        do
        {
            System.out.println("----------------------------------------\nPaulo's Video Store Manager Application\n----------------------------------------\n MAIN MENU\n List (Enter L)\n Borrow (Enter B)\n Quit (Enter Q)\n");
            System.out.print("Please enter a letter to proceed with one of the options: ");
            menuselection = menuinput.nextLine();
            System.out.println();
            
            {
                if(menuselection.equalsIgnoreCase("B"))
                {
                
                    System.out.println("What is the name of the customer? Please enter it");
                    String nameentry = menuinput.nextLine();
                    
                    System.out.println("Which specific video does the customer want to borrow? Please enter the name of the video");
                    String videoentry = menuinput.nextLine();
                    
                    newvs.borrow (nameentry, videoentry);
                    System.out.println();
                }
                 
                    else if (menuselection.equalsIgnoreCase("L"))
                    {
                        newvs.listallvideos();
                    }
                
               
                
            } 
            
 
            
            
            
            
            
        } while(!menuselection.equalsIgnoreCase("Q"));
        
        
        
        
    }
}
