
/**
 * This is the other example using bubble sort. This uses strings.
 *
 * @author Evan Vicidomini
 * @version 2/27/19
 */
public class bubbleSortTwo
{
    /**
     * This is the void method that creates the bubble for the index.
     * 
     * @param array  The array used in the bubble sort example.
     */
    public static void bubbleSortEx(String[] array)
    {
        String pos = "";
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < (array.length - 1); j++)
            {
                if(array[j].charAt(0) < array[j+1].charAt(0))
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
        String[] array = {"Michael", "Pam", "Dwight", "Jim", "Andy", "Angela", "Kevin"};
        
        bubbleSortEx(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}

