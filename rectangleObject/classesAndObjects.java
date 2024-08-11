/**
 * This class contains methods that help produce the area of a rectangle
 * 
 * @Evan Vicidomini
 * @September 5, 2018
 * 
 * Extra notes:
 * Constructor: sets the initial values for an object
 */

public class classesAndObjects 
{    
    public double length;
    public double width;
    
    //Create a rectangle
    /**
     * 
     */
    public classesAndObjects()
    {
        length = 0;
        width = 0;
    }

    /**
     * Sets the value for the length method
     * 
     * @param l     value of the length
     * @return length   value of the length
     */
    public classesAndObjects(double l, double w)
    {
        length = l;
        width = w;
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArea()
    {
        return length * width;
    }
}
