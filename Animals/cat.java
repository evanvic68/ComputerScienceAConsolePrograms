
/**
 * This is the second subclass for an animal. Creates a cat object.
 *
 * @author Evan Vicidomini
 * @version 12/7/18
 */
public class cat extends animal
{
    private String fc;  //Defined as the fur color.
    private double s; //Defined as the size.
    private String me; //Defined as a meow sound. It is a trait different from the other animals.
   
    /**
     * This is the constructor that replaces the set methods for the cat class.
     * 
     * @param mammal  Defines the dog as a mammal.
     * @param vertebrate  Defines the dog as a vertebrate.
     * @param pet  Defines the dog as a pet.
     * @param furColor  Defines the fur color of a dog.
     * @param size  Defines the size of a dog in a double value;
     * @param meow  The sound a cat makes.
     */
    public cat(String mammal, String vertebrate, String pet, String furColor, double size, String meowSound)
    {
        super(mammal, vertebrate, pet);
        fc = furColor;
        s = size;
        me = meowSound;
    }
    
    /**
     * This gets the fur color of the cat.
     * 
     * @return fc  The color of the cat's fur.
     */
    public String getFurColor()
    {
        return fc;
    }
    
    /**
     * This gets the size of the cat.
     * 
     * @return s  The size of the cat.
     */
    public double getSize()
    {
        return s;
    }
    
    /**
     * This gets the meow sound of a cat.
     * 
     * @return meow  The sound a cat makes.
     */
    public String meowSound()
    {
        return me;
    }
    
    /**
     * This is the toString method for the cat.
     * 
     * @return str  The toString for the cat.
     */
    public String toString()
    {
        String str = super.toString() + "\nFur Color: " + fc + "\nSize: " + s + "\nSound: " + me;
        
        return str;
    }
    
    /**
     * This void method sets the characteristics of the cat. Overrides the method in the super.
     */
    public void getCharacteristics()
    {
        m = "mammal";
        v = "vertebrate";
        p = "pet";
        fc = "varies";
        s = 1;
        me = "meow";
    }
}
