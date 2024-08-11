
/**
 * This is the program that creates the account numbers for the binary search
 *
 * @author Evan Vicidomini
 * @version 3/15/19
 */
public class accountNumber
{
    public static int[] accountNums;

    /**
     * This is the set method for the account numbers.
     * 
     * @param an  The variable that sets the value for the account numbers.
     */
    public accountNumber(int[] an)
    {
        accountNums = an;
    }
    
    /**
     * This is the void method that creates the bubble for the index.
     * 
     * @param array  The array used in the bubble sort example.
     */
    public static int[] binaryBubble(int[] array)
    {
        int pos = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < (array.length - 1); j++)
            {
                if(array[j] > array[j+1])
                {
                    pos = array[j];
                    array[j] = array[j+1];
                    array[j+1] = pos;
                }
            }
        }
        
        return array;
    }
 
    /**
     * This is the method for the search.
     * 
     * @param array  The test array for the method.
     * @param value  The choice of an account number.
     * @return found  Determines if the number is found.
     */
    public boolean binarySearch(int[] array, int value)
    {      
        int first = 0;
        int last = array.length;
        boolean found = false;
        int pos = -1;
        boolean isTrue;
        
        while(found != true && first <= last)
        {
            int middle = (first + last) / 2;
            
            if(array[middle] == value)
            {
                found = true;
                pos = middle;
            }
            else if(array[middle] > value)
            {
                last = middle - 1;
            }
            else
            {
                first = middle + 1;
            }
        }
        return found;
    }
    
    /**
     * This is the toString method for the program.
     * 
     * @return str  The toString for the binary search.
     */
    public String toString()
    {
        String str = "";
        
        for(int i = 0; i < accountNums.length; i++)
        {
            str += accountNums[i] + " ";
        }
        
        return str;
    }
}
