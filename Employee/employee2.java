
/**
 * This is the driver for the team leader class. It is a sub class of the employee super class.
 *
 * @author Evan Vicidomini 
 * @version 12/3/18
 */
public class employee2
{
    public static void main(String[] args)
    {
        //Define the first shiftSupervisor.
        shiftSupervisor s1 = new shiftSupervisor("Bob", "123-A", "10/10/2018", 0, 3600);
        
        //Define the instance fields and call the get methods.
        String n = s1.getName();
        String i = s1.getId();
        String d = s1.getDate();
        double b = s1.getBonus();
        int ap = s1.getAnnualProduction();
        
        //Call the method bonusConf to determine a bonus.
        b = s1.bonusConf();
        
        //Print the information to the user.
        System.out.println("Name: " + n);
        System.out.println("Id number: " + i);
        System.out.println("Date of hire: " + d);
        System.out.println("Hours worked, or annual production: " + ap + " hours.");
        System.out.println("Bonus: " + b + "\r");
        
        //Define the second shiftSupervisor.
        shiftSupervisor s2 = new shiftSupervisor("Tim", "893-B", "9/4/2018", 0, 0);
        
        //Define the instance fields and call the get methods.
        String n2 = s2.getName();
        String i2 = s2.getId();
        String d2 = s2.getDate();
        double b2 = s2.getBonus();
        int ap2 = s2.getAnnualProduction();
        
        //Call the method bonusConf to determine a bonus.
        b2 = s2.bonusConf();
        
        //Print the information to the user.
        System.out.println("Name: " + n2);
        System.out.println("Id number: " + i2);
        System.out.println("Date of hire: " + d2);
        System.out.println("Hours worked, or annual production: " + ap2 + " hours.");
        System.out.println("Bonus: " + b2 + " " + n2 + " is not a shift supervisor.\r");
        
        //Define the third shiftSupervisor.
        shiftSupervisor s3 = new shiftSupervisor("Josh", "990-C", "8/9/2018", 0, 3000);
        
        //Define the instance fields and call the get methods.
        String n3 = s3.getName();
        String i3= s3.getId();
        String d3 = s3.getDate();
        double b3 = s3.getBonus();
        int ap3 = s3.getAnnualProduction();
        
        //Call the method bonusConf to determine a bonus.
        b3 = s3.bonusConf();
        
        //Print the information to the user.
        System.out.println("Name: " + n3);
        System.out.println("Id number: " + i3);
        System.out.println("Date of hire: " + d3);
        System.out.println("Hours worked, or annual production: " + ap3 + " hours.");
        System.out.println("Bonus: " + b3);
    }
}
