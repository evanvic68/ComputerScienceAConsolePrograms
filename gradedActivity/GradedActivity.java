
/**
 * This gets the graded assignment for an essay.
 *
 * @author Evan Vicidomini
 * @version 11/12/18
 */
public class GradedActivity
{
    //Define the instance field score for any grade score.
    public double score;
    
    /**
     * This sets the value of score.
     * 
     * @param s  The score of the graded activity.
     */
    public void setScore(double s)
    {
        score = s;
    }
    
    /**
     * This gets the score of the graded activity.
     * 
     * @return score  The score on the graded activity.
     */
    public double getScore()
    {
        return score;
    }
    
    /**
     * This gets the letter grade for score.
     * 
     * @return letterGrade  The grade given for the score.
     */
    public char getGrade()
    {
        char letterGrade; //Used the character data type
        
        if(score>=90)
        {
            letterGrade='A'; 
        }
        else if(score>=80)
        {
            letterGrade='B';
        }
        else if(score>=70)
        {
            letterGrade='C';
        }
        else if(score>=65)
        {
            letterGrade='D';
        }
        else
        {
            letterGrade='F';
        }
        
        return letterGrade;
    }
}
