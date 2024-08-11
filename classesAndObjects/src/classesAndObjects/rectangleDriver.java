package classesAndObjects;
/*
 * Test the methods from the Rectangle Class
 * 
 * @Evan Vicidomini
 * @September 5, 2018
 */
public class rectangleDriver {
	public static void main(String[] args){
		classesAndObjects = new Rectangle();
		rec.getRecArea();
		
		System.out.print("The inital area is:" + rec.getRecArea());
		rec.setLength(2.5);
		rec.setWidth(3.5);
		System.out.println("Length: " + rec.getLength());
		System.out.println("Width: " + rec.getWidth());
		System.out.println("Area: " + rec.getArea());
	}
}
