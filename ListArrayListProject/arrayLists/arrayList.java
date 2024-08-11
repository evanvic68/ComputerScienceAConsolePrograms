import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class arrayList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arrayList 
{
    public static void main(String[] args)
    {
        ArrayList<Double> a1 = new ArrayList();
        
        a1.add(1.223);
        a1.add(2.344);
        a1.add(3.445);
        
        a1.remove(2);
        
        System.out.println(a1);
    }
}
