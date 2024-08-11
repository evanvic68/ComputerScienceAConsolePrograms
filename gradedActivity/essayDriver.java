import java.util.Scanner;
/**
 * This runs the essay object.
 *
 * @author Evan Vicidomini
 * @version 11/14/18
 */
public class essayDriver
{
    public static void main(String[] args)
    {
        //Define the main values for the program.
        double g;
        double s;
        double l;
        double c;
        String n;
    
        //Define ui, or the user input and the scanner.
        int ui = 0;
        Scanner kb = new Scanner(System.in);

        //Print the first statement.
        System.out.println("Welcome. Type 1 to calculate essay grade and 2 to exit program.");
        ui = kb.nextInt();
        
        //Get the user inputs for the different scores.
        while(ui != 2)
        {
            //Get the name of the user.
            System.out.println("Give your name.");
            n = kb.next();
            
            //Create conditionals for the points.
            if(ui == 1)
            {
                //Get the grammar points.
                System.out.println("Give the value for grammar: 0-30 points.");
                g = kb.nextDouble();
                
                //Loop for valid answer.
                while(g < 0 || g > 30)
                {
                    System.out.println("This is not a valid number. Please type between 0 or 30");
                    g = kb.nextDouble();
                }
                
                //Get the spelling points
                System.out.println("Give the value for spelling: 0-20 points.");
                s = kb.nextDouble();
                
                //Loop for valid answer.
                while(s < 0 || s > 20)
                {
                    System.out.println("This is not a valid number. Please type between 0 or 20");
                    s = kb.nextDouble();
                }
                
                //Get the length points
                System.out.println("Give the value for correct length: 0-20 points.");
                l = kb.nextDouble();
                
                //Loop for the valid answer.
                while(l < 0 || l > 20)
                {
                    System.out.println("This is not a valid number. Please type between 0 or 20");
                    l = kb.nextDouble();
                }
                
                //Get the content points.
                System.out.println("Give the value for content: 0-30 points.");
                c = kb.nextDouble();
                
                //Loop for the valid answer.
                while(c < 0 || c > 30)
                {
                    System.out.println("This is not a valid number. Please type between 0 or 30");
                    c = kb.nextDouble();
                }
                
                //Get the essay object and the values for it.
                essay e1 = new essay(g, s, l, c, n);
                g = e1.getGrammarScore();
                s = e1.getSpellingScore();
                l = e1.getLengthScore();
                c = e1.getContentScore();
                n = e1.getName();
        
                //Define the total score.
                double score = e1.getScore();
                
                //Print the results to the user.
                System.out.println("Here are the results: ");
                System.out.println("Your name: " + n);
                System.out.println("Grammar: " + g +" out of 30");
                System.out.println("Spelling: " + s +" out of 20");
                System.out.println("Correct Length: " + l + " out of 20");
                System.out.println("Content: " + c +" out of 30");
                System.out.println("Total Score: " + score +" out of 100");
                System.out.println("Letter Grade: " + e1.getGrade());
                
                //Begin to loop program to see if the user wants to go again.
                System.out.println("Please type 1 to go again or 2 to end the program.");
                ui = kb.nextInt();
            }
            else if(ui == 2)
            {
                //Exit the program if user types 2.
                System.out.println("OK. Bye.");
                System.exit(0);
            }
            else
            {
                //Have the user enter a valid number if not 1 or 2.
                System.out.println("This is not a 1 or 0. Type one to calculate grade and 2 to end the program");
                ui = kb.nextInt();
            }
        }
    }
}
