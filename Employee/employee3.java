
/**
 * This driver runs the sub class teamLeader of the super classes productionWorker and employee.
 *
 * @author Evan Vicidomini
 * @version 12/5/18
 */
public class employee3
{
    public static void main(String[] args)
    {
        //Define the first shiftSupervisor.
        teamLeader t1 = new teamLeader("Bob", "123-A", "10/10/2018", 1, 8.50, 0.0, 21, 0);
        
        //Define the instance fields and call the get methods.
        String n = t1.getName();
        String i = t1.getId();
        String d = t1.getDate();
        int s = t1.getShift();
        double r = t1.getRate(); 
        double fb = t1.getFixedBonus();
        int wh = t1.getWorkerHours();
        int mh = t1.getMinimumHours();
        
        //Call the bonusConf method to determine the bonus given.
        fb = t1.bonusConf();
        
        //Print the information to the user.
        System.out.println("Worker 1: ");
        System.out.println("Name: " + n);
        System.out.println("Id: " + i);
        System.out.println("Date of Hire: " + d);
        System.out.println("Shift: " + s);
        System.out.println("Hourly Rate: " + r);
        System.out.println("Hours worker: " + wh);
        System.out.println("Monthly bonus: " + fb + "\r");
        
        //Define the second shiftSupervisor.
        teamLeader t2 = new teamLeader("Tim", "893-B", "9/4/2018", 2, 9.00, 0.0, 19, 0);
        
        //Define the instance fields and call the get methods.
        String n2 = t2.getName();
        String i2 = t2.getId();
        String d2 = t2.getDate();
        int s2 = t2.getShift();
        double r2 = t2.getRate(); 
        double fb2 = t2.getFixedBonus();
        int wh2 = t2.getWorkerHours();
        int mh2 = t2.getMinimumHours();
        
        //Call the bonusConf method to determine the bonus given.
        fb2 = t2.bonusConf();
        
        //Print the information to the user.
        System.out.println("Worker 2: ");
        System.out.println("Name: " + n2);
        System.out.println("Id: " + i2);
        System.out.println("Date of Hire: " + d2);
        System.out.println("Shift: " + s2);
        System.out.println("Hourly Rate: " + r2);
        System.out.println("Hours worker: " + wh2);
        System.out.println("Monthly bonus: " + fb2 + "\r");
        
        //Define the third shiftSupervisor.
        teamLeader t3 = new teamLeader("Josh", "990-C", "8/9/2018", 1, 9.50, 0.0, 30, 0);
        
        //Define the instance fields and call the get methods.
        String n3 = t3.getName();
        String i3 = t3.getId();
        String d3 = t3.getDate();
        int s3 = t3.getShift();
        double r3 = t3.getRate(); 
        double fb3 = t3.getFixedBonus();
        int wh3 = t3.getWorkerHours();
        int mh3 = t3.getMinimumHours();
        
        //Call the bonusConf method to determine the bonus given.
        fb3 = t3.bonusConf();
        
        //Print the information to the user.
        System.out.println("Worker 3: ");
        System.out.println("Name: " + n3);
        System.out.println("Id: " + i3);
        System.out.println("Date of Hire: " + d3);
        System.out.println("Shift: " + s3);
        System.out.println("Hourly Rate: " + r3);
        System.out.println("Hours worker: " + wh3);
        System.out.println("Monthly bonus: " + fb3);
    }
}
