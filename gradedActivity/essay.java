
/**
 * This defines the essay object as a child of the graded activity.
 *
 * @author Evan Vicidomini
 * @version 11/13/18
 */
public class essay extends GradedActivity
{
    //Define the instance fields of grammar, spelling, length, and content scores on an essay.
    public double g;
    public double s;
    public double l;
    public double c;
    public double ts;
    public String n;
    
    /**
     * This sets the values of g, s, l, and c.
     * 
     * @param grammarScore  Sets g as the grammar score;
     * @param spellingScore  Sets s as the spelling score;
     * @param lengthScore  Sets l as the length score;
     * @param contentScore  Sets c as the content score;
     * @param name  Sets n as the name of the person;
     */
    public essay(double grammarScore, double spellingScore, double lengthScore, double contentScore, String name)
    {
        g = grammarScore;
        s = spellingScore;
        l = lengthScore;
        c = contentScore;
        n = name;
        
        double ts = g + s + l + c;
        
        setScore(ts);
    }
    
    /**
     * This method gets the name of the user
     * 
     * @return n  The name of the user.
     */
    public String getName()
    {
        return n;
    }
    
    /**
     * This method gets the value of the grammar score.
     * 
     * @return g  The grammer score on the essay.
     */
    public double getGrammarScore()
    {
        return g;
    }
    
    /**
     * This method gets the value of the spelling score.
     * 
     * @return s  The spellng score on the essay.
     */
    public double getSpellingScore()
    {
        return s;
    }
    
    /**
     * This method gets the value of the length score.
     * 
     * @return l  The length score on the essay.
     */
    public double getLengthScore()
    {
        return l;
    }
    
    /**
     * This method gets the value of the content score.
     * 
     * @return c  The content score on the essay.
     */
    public double getContentScore()
    {
        return c;
    }
}
