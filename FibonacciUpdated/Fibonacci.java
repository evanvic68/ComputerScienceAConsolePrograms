
/**
 * This program creates the fibonacci sequence using recursive methods.
 *
 * @author Evan Vicidomini
 * @version 10/31
 */
public class Fibonacci
{
    public int f1; //Field defines "fibonacci" number 1.
    public int f2; //Field defines "fibonacci" number 2.
    public int e; //Field defines "start" number. 
    
    /**
     * This is the first constructor for the object. Defines f and s as 
     * 0 until user input.
     */
    public Fibonacci()
    {
        f1 = 0;
        f2 = 1;
        e = 0;
    }
    
    /**
     * This is the second constructor for the object. Sets values for f and e to 
     * define the uses of them in the class.
     * 
     * @param Fibonacci  Defines the name of f.
     * @param startForFibonacci  Defines the name of s.
     */
    public Fibonacci(int fibonacciOne, int fibonacciTwo, int endForFibonacci)
    {
        f1 = fibonacciOne;
        f2 = fibonacciTwo;
        e = endForFibonacci;
    }
    
    /**
     * This is the recursive method for the fibonacci object
     * 
     * @param f  Fibonacci number manipulated for the object.
     */
    public static int getE(int e)
    {
        if(e == 1)
        {
            return 0;
        }
        else if(e == 2)
        {
            return 1;
        }
        else 
        {
            return getE(e-1) + getE(e-2);
        }
    }
    
    /**
     * This method returns f1 to the driver
     * 
     * @return f1  The first number of the fibonacci sequence.
     */
    public int getF1()
    {
        return f1;
    }
    
    /**
     * This method returns f2 to the driver
     * 
     * @return fw  The second number of the fibonacci sequence.
     */
    public int getF2()
    {
        return f2;
    }
    
    /**
     * This method returns e to the driver
     */
    public int getE()
    {
        return e;
    }
}
