
/**
 * This is the other example using selection sort. This uses strings.
 *
 * @author Evan Vicidomini
 * @version 3/5/19
 */
public class selectionSortTwo
{
    /**
     * This is the method used to create the selection sort.
     * 
     * @param array  The array used for the selection sort.
     */
    public static void getSelection(String[] array)
    {
        int index;
        int minIndex;
        String minValue; 
        
        for(int ss = 0; ss < array.length; ss++)
        {
            index = ss;
            minIndex = ss;
            minValue = array[ss];
            
            for(index = (ss + 1); index < array.length; index++)
            {
                if(array[index].charAt(0) > minValue.charAt(0)) 
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
        String[] array = {"Michael", "Pam", "Dwight", "Jim", "Andy", "Angela", "Kevin"};
        
        getSelection(array);
        
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
