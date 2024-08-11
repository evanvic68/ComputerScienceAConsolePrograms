
/**
 * This class is the driver for the super class, employee and the sub class, prodctionWorker, and run them together.
 * The productionWorker sub class extends the employee super class.
 *
 * @author Evan Vicidomini
 * @version 11/28/18
 */
public class employee1
{
    public static void main(String[] args)
    {
        //Define the first production worker.
        productionWorker p1 = new productionWorker("Bob", "123-A", "10/10/2018", 1, 8.50);
        
        //Define the instance fields and call the get methods.
        String n = p1.getName();
        String i = p1.getId();
        String d = p1.getDate();
        int s = p1.getShift();
        double r = p1.getRate(); 
        
        //Print the information to the user.
        System.out.println("Worker 1: ");
        System.out.println("Name: " + n);
        System.out.println("Id: " + i);
        System.out.println("Date of Hire: " + d);
        System.out.println("Shift: " + s);
        System.out.println("Hourly Rate: " + r + "\r");
        
        //Define the second production worker.
        productionWorker p2 = new productionWorker("Tim", "893-B", "9/4/2018", 2, 9.00);
        
        //Define the instance fields and call the get methods.
        String n2 = p2.getName();
        String i2 = p2.getId();
        String d2 = p2.getDate();
        int s2 = p2.getShift();
        double r2 = p2.getRate(); 
        
        //Print the information to the user.
        System.out.println("Worker 2:  ");
        System.out.println("Name: " + n2);
        System.out.println("Id: " + i2);
        System.out.println("Date of Hire: " + d2);
        System.out.println("Shift: " + s2);
        System.out.println("Hourly Rate: " + r2 + "\r");
        
        //Define the third production worker.
        productionWorker p3 = new productionWorker("Josh", "990-C", "8/9/2018", 1, 9.50);
        
        //Define the instance fields and call the get methods.
        String n3 = p3.getName();
        String i3 = p3.getId();
        String d3 = p3.getDate();
        int s3 = p3.getShift();
        double r3 = p3.getRate(); 
        
        //Print the information to the user.
        System.out.println("Worker 3:  ");
        System.out.println("Name: " + n3);
        System.out.println("Id: " + i3);
        System.out.println("Date of Hire: " + d3);
        System.out.println("Shift: " + s3);
        System.out.println("Hourly Rate: " + r3);
    }
}
