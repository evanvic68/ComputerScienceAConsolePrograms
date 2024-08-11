
/**
 * This program creates a coin toss
 *
 * @author Evan Vicidomini
 * @version 9/25
 */
public class coinToss
{
    public int computerInput;
    public int userInput;
    
    /**
     * Constructor for objects of class coinToss
     */
    public coinToss()
    {
        userInput = 0;
    }
    
    /**
     * Contructor for the set methods
     */
    public coinToss(int userP[], int userI)
    {
        userInput = userI;
    }
    
    /**
     * Gets the amount of coin tosses the user wants to do
     *
     * @return coinTosses   The amount of times to toss the coin
     */
    public int getCInput()
    {
        return computerInput;
    }
    
    /**
     * Gets the user's input, or their first choice of coin toss
     *
     * @return userInput   The user's choice for coin side
     */
    public int getUInput()
    {
        return userInput;
    }
}
