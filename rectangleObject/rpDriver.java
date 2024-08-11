
/**
 * This is the driver for the rectangular prism
 *
 * @author Evan Vicidomini
 * @version 11/21/18
 */
public class rpDriver
{
    public static void main(String[] args)
    {
        //Get the object for the driver.
        rectangularPrism rp = new rectangularPrism(2, 3, 4);
        
        //Print surface area and the volume to the user.
        System.out.println("Surface Area: " + rp.getSurfaceArea());
        System.out.println("Volume : " + rp.getVolume());
    }
}
