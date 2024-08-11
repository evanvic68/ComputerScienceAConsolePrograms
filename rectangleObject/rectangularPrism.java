
/**
 * This is a new object for a rectangular prism.
 *
 * @author Evan Vicidomini
 * @version 11/21/18
 */
public class rectangularPrism extends classesAndObjects
{
    private double height;
    
    /**
     * This sets the values for the rectangular prism.
     * 
     * @param l  Sets the value of length in the super class equal to l.
     * @param w  Sets the value of width in the super class equal to w.
     * @param h  Sets the value of height equal to h in the subclass.
     */
    public rectangularPrism(double l, double w, double h)
    {
        super(l, w);
        height = h;
    }
    
    /**
     * This gets the length of the prism.
     * 
     * @return length  The length of the prism.
     */
    public double getLength()
    {
        return length;
    }
   
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getSurfaceArea()
    {
        return 2 * (getArea() + getHeight() * getLength() + getHeight() * getWidth());
    }
    
    public double getVolume()
    {
        return getArea() * getHeight();
    }
}
