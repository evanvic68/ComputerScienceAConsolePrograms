
/**
 * This is a test program for a value.
 *
 * @author Evan Vicidomini
 * @version 3/11/19
 */
public class m1
{
    private int v;

    /**
     * Constructor for objects of class m1
     */
    public m1()
    {
        v = 0;
    }
    
    /**
     * This is the set method for m1
     * 
     * @param value  The name of the variable v.
     */
    public m1(int value)
    {
        v = value;
    }
    
    /**
     * This is the get method for a value.
     * 
     * @return v  The value of the program.
     */
    public int getV()
    {
        return v;
    }
    
    /**
     * This is a test method for a for each loop
     * 
     * @param values  The test array for the loop.
     */
    public static int forEach(int[] values)
    {
        int t = 0;
        
        for(int v: values)
        {
           t += v; 
        }
        
        return t;
    }
    
    /**
     * This is a test of a recursive method for v.
     * 
     * @param v  The value v.
     */
    public int findV(int v)
    {
        if(v == 1)
        {
            return v = 0;
        }
        else
        {
            return v = findV(v + 1);
        }
    }
    
    /**
     * This is the toString method for the program.
     * 
     * @return str  The toString.
     */
    public String toString()
    {
        String str;
        
        return str = "Value equals: " + v;
    }
    
    public static void main(String[] args)
    {
        int[] values = {1, 2, 3, 4,};
        
        System.out.println(forEach(values));
    }
}
