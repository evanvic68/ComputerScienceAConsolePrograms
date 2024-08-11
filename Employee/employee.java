
/**
 * This class is the super class. It creates an employee object that run throughout several sub classes.
 * The instance fields for the super class are defined as the name, id number, and the date of hire.
 *
 * @author Evan Vicidomini
 * @version 11/21/18
 */
public class employee
{
    //Define instance fields important to the program.
    public String n; //Instance field defined as name.
    public String i; //Instance field defined as id.
    public String d; //Instance filed defined as final date;
    
    /**
     * This is the default constructor for the employee class. Employee is the parent
     * class for all different types of employees.
     */
    public employee()
    {
        n = "";
        i = "";
        d = "";
    }
    
    /**
     * This is the second consructor for the employee object. This substitues for set methods.
     * 
     * @param name  The name of the employee.
     * @param id  The id of the employee.
     * @param date  The starting date at the job of the employee.
     */
    public employee(String name, String id, String date)
    {
        n = name;
        i = id;
        d = date;
    }
    
    /**
     * This get method gets the name of the employee. First instance field of the super class.
     * 
     * @return n  The name of the employee.
     */
    public String getName()
    {
        return n;
    }
    
    /**
     * This get method gets the id number of the employee. Second instance field of the super class.
     * 
     * @return i  The id number of the employee.
     */
    public String getId()
    {
        return i;
    }
    
    /**
     * This get method gets the date of hire for the employee. Third instance field of the super class.
     * 
     * @return d  The date of the employee.
     */
    public String getDate()
    {
        return d;
    }
}
