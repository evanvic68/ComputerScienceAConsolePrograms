
/**
 * This is the animal super class. It is the abstract class for the different animals.
 *
 * @author Evan Vicidomini
 * @version 12/6/18
 */
public abstract class animal
{
    public String m; //Defined as a mammal.
    public String v; //Defined as vertebrate
    public String p; //Defined as if it is a pet or not.
    
    /**
     * This is the main constructor for the class.
     */
    public animal()
    {
        m = "";
        v = "";
        p = "";
    }
    
    /**
     * This is the second class for the animal object. Replaces the set methods.
     * 
     * @param size  The size of the animal.
     * @param color  The color of the animal.
     * @param vertebrate  Does the animal have a backbone or not?
     */
    public animal(String mammal, String vertebrate, String pet)
    {
        m = mammal;
        v = vertebrate;
        p = pet;
    }
    
    /**
     * This is the toString method created for the abstract class animal.
     * 
     * @return a1  The only animal String returned to the driver.
     */
    public String toString()
    {
        String a1; //a1 is defined as the first animal toString, or the only toString method used.
        
        a1 = "mammal: " + m + "\nVertebrate: " + v + "\nPet: " + p;
        
        return a1;
    }
    
    public abstract void getCharacteristics();
}
