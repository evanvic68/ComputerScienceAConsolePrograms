
/**
 * A class that holds specific information from the final exam.
 *
 * @author Evan Vicidomini
 * @version 11/12/18
 */
public class finalExam extends GradedActivity 
{
    //Set the default instance fields for the program
    public int numQuestions;
    public int numMissed;
    public double pointsEach;
    
    /**
     * Set constructor for the finalExam.
     */
    public finalExam(int questions, int missed)
    {
        //Set the values equal.
        numQuestions = questions;
        numMissed = missed;
        
        //Calculate the score
        pointsEach = 100.0/numQuestions;
        double numericScore = 100 - (pointsEach * numMissed);
        
        setScore(numericScore);
    }
    
    /**
     * This gets the points values each.
     * 
     * @return pointsEach  The value of the points each of the assignments.
     */
    public double getPointsEach()
    {
        return pointsEach;
    }
    
    /**
     * This gets the amount of missed questions.
     * 
     * @return numMissed  The questions missed.
     */
    public int getNumMissed()
    {
        return numMissed;
    }
    
    /**
     * This gets the number of questions found on the assignment.
     * 
     * @return numQuestions  The number of questions.
     */
    public int getNumQuest()
    {
        return numQuestions;
    }
}
