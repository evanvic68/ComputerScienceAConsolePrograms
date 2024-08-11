
/**
 * This is the other example using insertion sort. This uses strings.
 *
 * @author Evan Vicidomini
 * @version 3/5/19
 */
public class insertionSortTwo
{
    /**
     * This gets the insertion sort for the array.
     * 
     * @param array  The array used for the insertion sort.
     */
    public static void getInsertion(String[] array)
    {
        int scan = 0;
        String unsortedString = "";
        String pos;
        
        for(int i = 0; i < array.length; i++)
        {
            scan = i;
            unsortedString = array[i];
            
            while(scan > 0 && array[scan-1].charAt(0) < unsortedString.charAt(0))
            {
                pos = array[scan];
                array[scan] = array[scan-1];
                array[scan-1] = pos;
                scan--;
            }
            array[scan] = unsortedString;
        }
    }
    
    public static void main(String[] args)
    {
        String[] array = {"Michael", "Pam", "Dwight", "Jim", "Andy", "Angela", "Kevin"};
        
        getInsertion(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
