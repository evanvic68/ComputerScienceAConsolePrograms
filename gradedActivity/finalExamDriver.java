
/**
 * This runs the finalExam object.
 *
 * @author Evan Vicidomini
 * @version 11/12/18
 */
public class finalExamDriver
{
    public static void main(String[] args)
    {
        //Get the final exam object
        finalExam fe = new finalExam(25, 5);
        
        //Print the answers out
        System.out.println("Questions count for: " + fe.getPointsEach());
        System.out.println("Score: "+ fe.getScore());
        System.out.println("Letter: " + fe.getGrade());
    }
}
