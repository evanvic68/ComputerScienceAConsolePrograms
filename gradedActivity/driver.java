
/**
 * This is the driver for the GradedActivity class.
 *
 * @author Evan Vicidomini
 * @version 11/17/18
 */
public class driver extends GradedActivity
{
    public static void main(String[] args)
    {
        //Define the gradedactivity object and store a value.
        GradedActivity ga = new GradedActivity();
        ga.setScore(85);
        
        //Test the GradedActivity
        System.out.println("Letter Grade: " + ga.getGrade());
    }
}
