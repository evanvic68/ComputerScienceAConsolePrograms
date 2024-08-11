
/**
 * This is the super class for music, which is sold in the retail store.
 *
 * @author Evan Vicidomini
 * @version 1/15/19
 */
public class Music implements retailPrice
{
    public double retailPrice;
    public String artistName;
    public String title;
    
    /**
     * This is the constructor that takes place of the set methods.
     * 
     * @param rp  The retail price of the movie.
     * @param rt  The runtime of the movie.
     * @param t  The title of the movie.
     */
    public Music(double rp, String an, String t){
        retailPrice = rp;
        artistName = an;
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
     * This gets the artist name of the record.
     * 
     * @return artistName  The name of the artist.
     */
    public String getArtistName(){
        return artistName;
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
        
        return str = "Music Category: \r" + "Title: " + title + "\r" + 
        "Artist: " + artistName + "\r" + "Retail Price: $" + retailPrice;
    }
}
