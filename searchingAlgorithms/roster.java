
/**
 * This program demostrates sequential search for an array of data.
 *
 * @author Evan Vicidomini
 * @version 3/13/19
 */
public class roster
{
    public static String[] roster;
    
    /**
     * This is the set method for the roster for the programming club.
     * 
     * @param r  The value roster is set to r.
     */
    public roster(String[] r)
    {
        roster = r;
    }
    
    /**
     * This method returns true if the names match
     * 
     * @param userString  The name selected for the program to scan.
     * @return isTrue  The boolean that determines if the names match.
     */
    public static boolean trueName(String userString)
    {
        boolean isTrue = false;
        int nameCount = 0;
        
        for(int i = 0; i < roster.length; i++)
        {
           if(roster[i].equals(userString))
           {
               nameCount += 1;
           }
           else
           {
               nameCount += 0;
           }
        }
       
        if(nameCount == 1)
        {
            isTrue = true;
        }
        else if(nameCount == 0)
        {
            isTrue = false;
        }
        
        return isTrue;
    }
    
    /**
     * This is the toString method for the program.
     * 
     * @return str  The toString for the program.
     */
    public String toString()
    {
        String str = "Names: ";
        
        for(int i = 0; i < roster.length; i++)
        {
            str += roster[i] + " ";
        }
        
        return str;
    }
}
