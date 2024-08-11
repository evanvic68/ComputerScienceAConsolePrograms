import java.util.Scanner;
/**
 * This is the test driver for the sequential search.
 *
 * @author Evan Vicidomini
 * @version 3/20/19
 */
public class sequentialSearchDriver
{
    public static void main(String[] args)
    {
        //Define the variables for the program.
        String[] r = {"Bob", "George", "Sally", "Hannah", "Tim", "Aden", "Alexis", "Jessica", "Josh", "Connor", "Grace"};
        roster r1 = new roster(r);
        Scanner kb = new Scanner(System.in);
        String us;
        String ui = "";
        
        //Create a looped program for the user to guess a name. 
        while(!ui.equals("no"))
        {
            //Ask the user if they want to guess a number.
            System.out.println("Would you like to guess a name?");
            System.out.println("Type 'yes' or 'no' to answer.");
            ui = kb.next();
            
            if(ui.equals("yes") || ui.equals("Yes"))
            {
                //Ask the user to guess a number.
                System.out.println("Give a name for a student");
                us = kb.next();
                
                //Print the results.
                System.out.println(r1);
                System.out.println("User Choice: " + us);
                System.out.println(r1.trueName(us));
            }
            else if(ui.equals("no") || ui.equals("No"))
            {
                //Exit the program if no is typed.
                System.out.println("Bye");
            }
            else
            {
                //Make sure the user types yes or no only.
                System.out.println("This is not yes or no.");
            }
        }
        
       
    }
}
