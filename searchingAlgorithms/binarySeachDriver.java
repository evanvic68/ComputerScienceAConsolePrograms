import java.util.Scanner;
/**
 * This is the driver for the binary search program, or the account numbers.
 *
 * @author Evan Vicidomini
 * @version 3/15/19
 */
public class binarySeachDriver
{
    public static void main(String[] args)
    {
        //Define the values for the program.
        int[] accountNums = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        int value = 0;
        Scanner kb = new Scanner(System.in);
        String ui = "";
        accountNumber a1 = new accountNumber(accountNums);
        
        //Call the method for bubble sort.
        int[] aN2 = a1.binaryBubble(accountNums);
        
        //Create looped program with user input.
        while(!(ui.equals("no") || ui.equals("No")))
        {
            //Ask the user if they want to search for a number.
            System.out.println("Would you like to search for an account number?");
            System.out.println("Type yes or no");
            ui = kb.next();
            
            //See if the number matches and give them an anser
            if(ui.equals("yes") || ui.equals("Yes"))
            {
                //Ask the user for a number
                System.out.println("Give a number. Example: 1111111");
                value = kb.nextInt();
                
                //Print the results
                System.out.println("Here are the sorted numbers");
                System.out.println(a1);
                System.out.println("User Choice: " + value);
                System.out.println(a1.binarySearch(aN2, value));
            }
            else if(ui.equals("no") || ui.equals("No"))
            {
                //Exit the program if no is typed.
                System.out.println("Bye");
            }
            else
            {
                //Make sures the user types yes or no only.
                System.out.println("This is no yes or no");
            }
        }
    }
}
