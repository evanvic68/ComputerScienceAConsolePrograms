import java.util.Scanner;
/**
 * This program runs the animal abstract class and the animal subclasses together.
 *
 * @author Evan Vicidomini
 * @version 12/17/18
 */
public class animalDriver
{
    public static void main(String[] args)
    {
        //Define the instances for the animals.
        String m;
        String v;
        String p;
        String fc;
        double s;
        String b;
        String me;
        String fa;
        String c;
        String sz;
        //Define the animals.
        dog d1 = new dog("mammal", "vertebrate", "pet", "varies", 2, "bark");
        cat c1 = new cat("mammal", "vertebrate", "pet", "varies", 2, "meow");
        pig p1 = new pig("mammal", "vertebrate", "pet", "Yes", "varies", "varies");
     
        //Define the user input and the scanner.
        String ui = "";
        Scanner kb = new Scanner(System.in);
        
        //Create the introduction statements for the user.
        System.out.println("Welcome to the pet store. View the information about the animals.");
        System.out.println("Currently we have: dogs, cats, or pigs.");
        System.out.println("Type dog, cat, or pig to view the information.");
        ui = kb.next();
        
        //Create looped program for the user.
        while(!ui.equals("goodbye"))
        {
           if(ui.equals("dog") || ui.equals("Dog"))
           {
               System.out.println("Here is the information about the dog");
               
               if(d1 instanceof animal)
               {
                   System.out.println(d1);
               }
               
               System.out.println("Type dog, cat, or pig to see their information");
               System.out.println("Type goodbye to exit");
               ui = kb.next();
               
           }
           else if(ui.equals("cat") || ui.equals("Cat"))
           {
               System.out.println("Here is the information about the cat.");
               
               if(c1 instanceof animal)
               {
                   System.out.println(c1);
               }
               
               System.out.println("Type dog, cat or, pig to see their information");
               System.out.println("Type goodbye to exit");
               ui = kb.next();
               
           }
           else if(ui.equals("pig") || ui.equals("Pig"))
           {
               System.out.println("Here is the information about the pig");
               
                if(c1 instanceof animal)
               {
                   System.out.println(p1);
               }
               
               System.out.println("Type dog, cat or, pig to see their information");
               System.out.println("Type goodbye to exit");
               ui = kb.next();
               
           }
           else if(ui.equals("goodbye") || ui.equals("Goodbye"))
           {
               System.out.println("Bye!");
               System.exit(0);
           }
           else
           {
               System.out.println("This is an invalid response.");
               ui = kb.next();
           }
        }
    }
}
