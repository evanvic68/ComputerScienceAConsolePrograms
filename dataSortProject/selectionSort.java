
/**
 * This is the first example using selection sort. This uses numbers.
 *
 * @author Evan Vicidomini
 * @version 3/5/19
 */
public class selectionSort
{
    /**
     * This is the method used to create the selection sort.
     * 
     * @param array  The array used for the selection sort.
     */
    public static void getSelection(int[] array)
    {
        int index;
        int minIndex;
        int minValue; 
        
        for(int ss = 0; ss < array.length; ss++)
        {
            index = ss;
            minIndex = ss;
            minValue = array[ss];
            
            for(index = (ss + 1); index < array.length; index++)
            {
                if(array[index] < minValue)
                {
                    minValue = array[index];
                    minIndex = index;
                }
                index++;
            }
            
            array[minIndex] = array[ss];
            array[ss] = minValue;
        }
    }
    
    public static void main(String[] args)
    {
        int[] array = {7, 2, 3, 8, 9, 1};
        
        getSelection(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
