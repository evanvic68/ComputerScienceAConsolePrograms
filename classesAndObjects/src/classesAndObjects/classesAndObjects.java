package classesAndObjects;

/*
 * This class contains methods that help produce the area of a rectangle
 * 
 * @Evan Vicidomini
 * @September 5, 2018
 * 
 * Extra notes:
 * Constructor: sets the initial values for an object
 */

public class classesAndObjects {
	
	private double length;
	private double width;
	
	//Create a rectangle
	public Rectangle(){
		length = 0;
		width = 0;
	}
	
	/*
	 * Sets the value for the length method
	 * 
	 * @param l 	value of the length
	 * @return length 	value of the length
	 */
	public double setLength(double l){
		
		length = l;
		return length;
	}
	
	/*
	 * Sets the value for the length method
	 * 
	 * @param w		value of the width
	 * @return width 	value of the width
	 */
	public double setWidth(double w){
		
		width = w;
		return width;
	}
	
	/*
	 * Get the length value
	 * 
	 * @return length	value of length
	 */
	public double getLength(){
		
		return length;
	}
	
	/*
	 * Get the width value
	 * 
	 * @return width	value of width
	 */
	public double getWidth(){
		
		return width;
	}
	
	/*
	 * Get the area value
	 * 
	 * @return area 	value of length * width
	 */
	public double getRecArea(){
		
		return length * width;
	}
}
