
/**
 * This is the first example using insertion sort. This uses numbers.
 *
 * @author Evan Vicidomini
 * @version 3/5/19
 */
public class insertionSort
{
    /**
     * This gets the insertion sort for the array.
     * 
     * @param array  The array used for the insertion sort.
     */
    public static void getInsertion(int[] array)
    {
        int scan = 0;
        int unsortedValue = 0;
        int pos;
        
        for(int i = 0; i < array.length; i++)
        {
            scan = i;
            unsortedValue = array[i];
            
            while(scan > 0 && array[scan-1] > unsortedValue)
            {
                pos = array[scan];
                array[scan] = array[scan-1];
                array[scan-1] = pos;
                scan--;
            }
            array[scan] = unsortedValue;
        }
    }
    
    public static void main(String[] args)
    {
        int[] array = {7, 2, 3, 8, 9, 1};
        
        getInsertion(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
