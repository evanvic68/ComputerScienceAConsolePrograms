
/**
 * This is the program for the sequential sort.
 *
 * @author Evan Vicidomini
 * @version 3/13/19
 */
public class roster
{
    public static String[] roster;
    public static boolean isTrue;
    
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
     * @param selectedName  The name selected for the program to scan.
     * @return isTrue  The boolean that determines if the names match.
     */
    public static boolean trueName(String selectedName)
    {
        for(int i = 0; i < roster.length; i++)
        {
           if(roster[i].equals(selectedName))
           {
               return isTrue = true;
           }
           else
           {
               return isTrue = false;
           }
        }
        
        return isTrue = false;
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
    
    /**
     * This get the value of the boolean determining if the name is in
     * the roster.
     * 
     * @return isTrue  The boolean stating if the name is in the roster.
     */
    public boolean getIsTrue()
    {
        return isTrue;
    }
    
    /**
     * This is the get method for the Roster.
     * 
     * @return roster  The roster for the programming club.
     */
    public String[] getRoster()
    {
        return roster;
    }
}
