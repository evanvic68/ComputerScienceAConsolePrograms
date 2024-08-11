import java.util.Scanner;
/**
 * This program demostrates the main prinicipals for the month class
 *
 * @author Evan Vicidomini
 * @version 10/9/18
 */
public class monthMainDriver
{
    public static void main(String[] args)
    {
        //Define the first number
        int monthNumber;
        String monthName;
        Scanner kb = new Scanner(System.in);
           
        //Get the month number
        System.out.println("Give the month number");
        monthNumber = kb.nextInt();
        
        //Get the first instance and price out the month
        month m1 = new month(monthNumber);
        System.out.println(m1);
        
        //Send the second statement to the user
        System.out.println("Give the month name");
        monthName = kb.next();
        
        //Get the second instance and print the statement
        month m2 = new month(monthName);
        System.out.println(m2);
        
        //Print the rest of the information
        if(m1.equals(m2) == true)
        {
            System.out.println("The statements are equal");
        }
        else
        {
            System.out.println("The statements are not equal");
        }
        
        if(m1.greaterThan(m2) == true)
        {
            System.out.println("The first month is greater than the second month");
        }
        else
        {
            System.out.println("The first month is not greater than the second month");
        }
        
        if(m1.lessThan(m2) == true)
        {
            System.out.println("The first month is less than the second month");
        }
        else 
        {
            System.out.println("The first month is not less than the second month");
        }
    }
}