
/**
 * This class is another sub class extention to the super class employee called shiftSupervisor. The instance
 * fields defined as the bonus and the annual production, or the hours worked in the year.
 *
 * @author Evan Vicidomini
 * @version 11/30/18
 */
public class shiftSupervisor extends employee
{
   public double b; //First instance field defined as the bonus.
   public int ap; //Second instance field defined as the annual production.
   
   /**
    * This is the only constructor for the shiftSupervisor sub class. It calls the super class instance fields, and
    * sets the bonus and annualProduction fields. Takes place of set methods.
    * 
    * @param bonus  The bonus money earned for a certain amount of hours.
    * @param annualProdcution  The amount of hours of production worked.
    */
   public shiftSupervisor(String name, String id, String date, double bonus, int annualProduction)
   {
       super(name, id, date);
       b = bonus;
       ap = annualProduction;
   }
   
   /**
    * This method determines the bonus a worker can get for a certain amount of hours, or annual production using 
    * conditional statements.
    * 
    * @return b  The bonus calculated if annual production hours is greater than 3500.
    */
   public double bonusConf()
   {
       if(ap >= 3500)
       {
           b += 1000;
       }
       else
       {
           b = 0;
       }
       
       return b;
   }
   
   /**
    * This gets the bonus earned for working a certain amount of hours.
    * 
    * @return b  The bonus for working the expected hours.
    */
   public double getBonus()
   {
       return b;
   }
   
   /**
    * This gets the hours of annual production for the year.
    * 
    * @return ap  The hours of annual prodcution.
    */
   public int getAnnualProduction()
   {
       return ap;
   }
}
