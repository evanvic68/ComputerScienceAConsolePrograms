
/**
 * This is the first example using bubble sort. This uses numbers.
 *
 * @author Evan Vicidomini
 * @version 2/27/19
 */
public class bubbleSort
{
    /**
     * This is the void method that creates the bubble for the index.
     * 
     * @param array  The array used in the bubble sort example.
     */
    public static void bubbleSortEx(int[] array)
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
    }
    
    public static void main(String[] args)
    {
        int[] array = {7, 2, 3, 8, 9, 1};
        
        bubbleSortEx(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
