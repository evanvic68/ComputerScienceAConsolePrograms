
/**
 * This is a sub class of the super classes productionWorker and employee. It uses the super class's 
 * instance fields, and defines the fixed monthly bonus, worker's hours, and minimum hours needed.
 *
 * @author Evan Vicidomini
 * @version 12/4/18
 */
public class teamLeader extends productionWorker
{
    public double fb; //Defined as the fixed monthly bonus.
    public int wh; //Defined as the worker hours.
    public int mh = 20; //Defined as the minimum hours to become a team leader.
    
    /**
     * This is the first constructor for the teamLeader. Method calls the super class for the methods.
     * Replaces the set methods.
     * 
     * @param name  The name of the employee.
     * @param id  The id of the employee.
     * @param date  The starting date at the job of the employee.
     * @param shift  The different shifts of the worker. Could be day or night.
     * @param rate  The hourly rate recieved by a worker.
     * @param fixedBonus  The fixed bonus earned per month for the team leader.
     */
    public teamLeader(String name, String id, String date, int shift, double rate, double fixedBonus, int workerHours
    ,int minimumHours)
    {
        super(name, id, date, shift, rate);
        fb = fixedBonus;
        wh = workerHours;
        mh = minimumHours;
    }
    
    /**
     * This method uses conditionals to determine a worker's bonus or not.
     * 
     * @param wh  The worker's training hours.
     * @param mh  The worker's minimum required hours to be a team leader.
     */
    public double bonusConf()
    {
        mh += 20;
        
        if(wh >= mh)
        {
            fb += 350;
        }
        else 
        {
            fb = 0;
        }
        
        return fb;
    }
    
    /**
     * This get method gets the fixed monthly bonus for the teamLeader.
     * 
     * @return fb  The fixed monthly bonus of the worker.
     */
    public double getFixedBonus()
    {
        return fb;
    }
    
    /**
     * This get method gets the worker's total training hours for becoming a team leader.
     * 
     * @return wh  The worker's training hours.
     */
    public int getWorkerHours()
    {
        return wh;
    }
    
    /**
     * This get method gets the worker's minimum training hours needed for becoming a team leader.
     * 
     * @return mh  The minimum amount of training hours needed.
     */
    public int getMinimumHours()
    {
        return mh;
    }
}
