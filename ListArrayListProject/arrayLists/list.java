import java.util.List;
import java.util.ArrayList;
/**
 * This test java lists in a singular driver.
 *
 * @author Evan Vicidomini
 * @version 
 */
public class list
{
    public static void main(String[] args)
    {
        //Using a List with integer values.
        List<Integer> L1 = new ArrayList();
        L1.add(3);
        L1.add(4);
        System.out.println(L1);
        
        //Using a List with String values.
        List<String> L2 = new ArrayList();
        L2.add("Hello");
        L2.add("There");
        L2.add("Person");
        L2.remove(2);
        
        System.out.println(L2);
    }
}
