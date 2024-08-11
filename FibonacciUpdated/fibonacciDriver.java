import java.util.Scanner;
/**
 * This is the driver for the fibonacci sequence
 *
 * @author Evan Vicidomini
 * @version 10/31
 */
public class fibonacciDriver
{
    public static void main(String[] args)
    {
        //Define the first fibonacci sequence used in the program.
        Fibonacci fs1 = new Fibonacci(); //Fibonacci sequence 1.
        Scanner kb = new Scanner(System.in);
        int e = fs1.getE();
        int f1 = fs1.getF1();
        int f2 = fs1.getF2();
        
        //Print values to the user.
        System.out.println("Give the end value for a fibonacci sequence");
        e = kb.nextInt();
        
        //Print f1 and f2 to the user.
        System.out.print(" " + f1 + " " + f2);
        
        //Create the looped program.
        for(int i = 2; i < e; i++)
        {
            int f3 = f1 + f2; //"f3" defined as combined fibonacci numbers.
            System.out.print(" " + f3);
            f1 = f2;
            f2 = f3;  
        }
    }
}
