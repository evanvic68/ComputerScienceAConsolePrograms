
/**
 * This class is a sub class for an employee called the production worker. It is the first type of 
 * employee, which extends the employee super class.
 *
 * @author Evan Vicidomini
 * @version 11/27/18
 */
public class productionWorker extends employee
{
    public int s; //First instance field defined as the shift.
    public double r; //Second instance field defined as the hourly rate.
        
    /**
     * This is the first constructor for the production worker. It takes the place of set methods, and
     * calls the super class for the employee object instance fields, and sets the local variables.
     * 
     * @param name  The name of the employee. Called from the super class.
     * @param id  The id number of the employee. Called from the super class.
     * @param date  The starting date at the job of the employee. Called from the super class.
     * @param shift  The different shifts of the worker. This is a sub class instance field.
     * @param rate  The hourly rate recieved by a worker. This is a sub class instance field.
     */
    public productionWorker(String name, String id, String date, int shift, double rate)
    {
        super(name, id, date);
        s = shift;
        r = rate;
    }
    
    /**
     * This gets the shift of the production workers.
     * 
     * @return s  The shift of the worker.
     */
    public int getShift()
    {
        return s;
    }
    
    /**
     * This gets the hourly rate of the production workers.
     * 
     * @return r  The hourly rate recieved by the production workers.
     */
    public double getRate()
    {
        return r;
    }
}
