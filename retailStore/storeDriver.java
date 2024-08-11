
/**
 * This is the driver for the movie and the music super classes.
 *
 * @author Evan Vicidomini
 * @version 1/16/19
 */
public class storeDriver
{
    public static void main(String[] args){
        //Get the objects.
        Movie mo1 = new Movie(8.99, 2.5, "Batman");
        Music mu1 = new Music(12.99, "Imagine Dragons", "Evolve");
        
        //Print the information to the user.
        System.out.println(mo1);
        System.out.println(mu1);
    }
}
