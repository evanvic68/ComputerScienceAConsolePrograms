import java.util.Random;
import java.util.Scanner;
/**
 * This program runs the coin object
 *
 * @author Evan Vicidomini
 * @version 9/24
 */
public class coinTossDriver
{
    public static void main(String[] args)
    {
        //Define the variables that the program runs on
        Random rn = new Random();
        coinToss ct = new coinToss();
        int computerInput = ct.getCInput();
        int userInput = ct.getUInput();
        Scanner kb = new Scanner(System.in);
        
        //Define computer input with a random number
        computerInput = rn.nextInt(1);
        
        //Print message to the user
        System.out.println("What do you choose? 0 for heads or 1 for tails \r");
        System.out.println("Please type -1 to exit the program");
        userInput = kb.nextInt();
       
        //Create the game
        while(userInput != -1)
        {
            //Validate the userInput
            while(userInput < -1 || userInput > 1)
            {
                if(userInput < -1)
                {
                    System.out.println("This value is too low");
                    userInput = kb.nextInt();
                }
                else if(userInput > 1)
                {
                    System.out.println("This value is too high");
                    userInput = kb.nextInt();
                }
                else if(userInput == -1)
                {
                    System.out.println("Goodbye");
                    System.exit(0);
                }
            }
            //Compare the values of the userInput and the computerInput
            if(userInput == computerInput)
            {
                System.out.println("You win.");
                System.out.println("Computer value: " + computerInput);
                System.out.println("User value: " + userInput);
            }
            else if(userInput < computerInput || userInput > computerInput)
            {
                System.out.println("You lose");
                System.out.println("Computer value: " + computerInput);
                System.out.println("User value: " + userInput);
            }
            //Ask user if they want to play again
            System.out.println("Thanks for playing. Please type 0 or 1 for heads or tails");
            System.out.println("or type -1 to exit the program");
            userInput = kb.nextInt();
            
            //Change the random number
            computerInput = rn.nextInt(2);
            
            //Compare the value of userInput
            if(userInput == -1)
            {
                System.exit(0);
            }
        }
    }
}

