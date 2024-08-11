import java.util.Scanner;
/**
 * This program demostrates the use of a copy constructor for the month class
 *
 * @author Evan Vicidomini
 * @version 10/9/18
 */
public class monthCopyDriver
{
    public static void main(String[] args)
    {
        //Define variables
        int monthNumber;
        String monthName;
        Scanner kb = new Scanner(System.in);
        
        //Get the month number
        System.out.println("Give the number of a month");
        monthNumber = kb.nextInt();
        
        //Get the first month instance and print it to the user
        month m1 = new month(monthNumber);
        System.out.println(m1);
        
        //Create copy instance
        month m2 = new month(m1);
        
        //Print the copy to the user
        System.out.println("Here is the copy of m1");
        System.out.println(m2);
    }
}
