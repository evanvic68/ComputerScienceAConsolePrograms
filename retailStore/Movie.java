
/**
 * This is the movie super class, which is sold in a retail store.
 *
 * @author Evan Vicidomini
 * @version 1/15/19
 */
public class Movie implements retailPrice
{
    public double retailPrice;
    public double runTime;;
    public String title;
    
    /**
     * This is the constructor that takes place of the set methods.
     * 
     * @param rp  The retail price of the movie.
     * @param rt  The runtime of the movie.
     * @param t  The title of the movie.
     */
    public Movie(double rp, double rt, String t){
        retailPrice = rp;
        runTime = rt;
        title = t;
    }
    
    /**
     * This gets the title of the movie
     * 
     * @return title  The title of the movie.
     */
    public String getTitle(){
        return title;
    }
    
    /**
     * This gets the runtime of the movie.
     * 
     * @return runTime  The length or runtime of the movie.
     */
    public double getRunTime(){
        return runTime;
    }
    
    /**
     * This gets the retailPrice of the movie.
     * 
     * @return retailPrice  The price of the movie.
     */
    public double getPrice(){
        return retailPrice;
    }
    
    /**
     * This is the toString method for displaying the information to the user.
     * 
     * @return str  The toString of the music class.
     */
    public String toString(){
        String str;
        
        return str = "Movie Category: \r" + "Title: " + title + "\r" + 
        "Runtime: " + runTime + "\r" + "Retail Price: $" + retailPrice + "\r";
    }
}
