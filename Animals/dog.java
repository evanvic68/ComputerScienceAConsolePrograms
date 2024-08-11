
/**
 * This is the first animal sub class for the animal super class.
 *
 * @author Evan Vicidomini
 * @version 12/7/18
 */
public class dog extends animal
{
    private String fc; //Defined as the fur color.
    private double s; //Defined as the size.
    private String b; //Defined as a barking sound. It is a trait different from the other animals.
    private String f; //Described as a different fact about dogs.
    
    /**
     * This constructor sets the values of the animal class.
     * 
     * @param mammal  Defines the dog as a mammal.
     * @param vertebrate  Defines the dog as a vertebrate.
     * @param pet  Defines the dog as a pet.
     * @param furColor  Defines the fur color of a dog.
     * @param size  Defines the size of a dog in a double value;
     * @param bark  The sound a dog makes.
     */
    public dog(String mammal, String vertebrate, String pet, String furColor, double size, String bark)
    {
        super(mammal, vertebrate, pet);
        furColor = fc;
        size = s;
        bark = b;
    }
    
    /**
     * This method gets the color of the animal's fur.
     * 
     * @return fc  The color of the dog's fur.
     */
    public String getFurColor()
    {
        return fc;
    }
    
    /**
     * This gets the size of a dog. 
     * 
     * @return s  The size of an average dog.
     */
    public double getSize()
    {
        return s;
    }
    
    /**
     * This gets the sound a dog makes, which is a bark.
     * 
     * @return b  The bark sound.
     */
    public String getBarkSound()
    {
        return b;
    }
    
    /**
     * This is the toString method for the dog.
     * 
     * @return str  The toString for the dog.
     */
    public String toString()
    {
        String str = super.toString() + "\nFur Color: " + fc + "\nSize: " + s + "\nSound: " + b;
        
        return str;
    }
    
    /**
     * This is a void method that sets the values. It overrides the method in the super class.
     */
    public void getCharacteristics()
    {
        m = "mammal";
        v = "vertebrate";
        p = "yes";
        fc = "varies";
        s = 1;
        b = "bark";
    }
}
