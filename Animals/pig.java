
/**
 * This is the pig subclass of the abstract superclass animal.
 *
 * @author Evan Vicidomini
 * @version (a version number or a date)
 */
public class pig extends animal
{
    private String fa; //Defines pig as a farm animal. Different trait from others.
    private String c; //Defined as the color of the animal.'
    private String sz; //Defined as the sound a pig makes.
    
    /**
     * This is the constructor for the set methods of the pig class.
     * 
     * @param mammal  Defines the dog as a mammal.
     * @param vertebrate  Defines the dog as a vertebrate.
     * @param pet  Defines the dog as a pet.
     * @param farmAnimal  Defines the pig as a farm animal.
     * @param color  Defines the size of a pig in a double value;
     * @param sound  The sound a pig makes.
     */
    public pig(String mammal, String vertebrate, String pet, String farmAnimal, String color, String sound)
    {
        super(mammal, vertebrate, pet);
        fa = farmAnimal;
        c = color;
        sz = sound;
    }
    
    /**
     * This is the get method for the farm animal.
     * 
     * @return fa  Tells that the pig is a farm animal.
     */
    public String getFarmAnimal()
    {
        return fa;
    }
    
    /**
     * This gets the color of the pig
     * 
     * @return c  The color of the pig.
     */
    public String getColor()
    {
        return c;
    }
    
    /**
     * This gets the squeal sound a pig makes.
     * 
     * @return sz  The sound of the pig.
     */
    public String getSound()
    {
        return sz;
    }
    
    /**
     * This is the toString method for the cat.
     * 
     * @return str  The toString for the cat.
     */
    public String toString()
    {
        String str = super.toString() + "\nFarm Animal?: " + fa + "\nColor: " + c + "\nSound: " + sz;
        
        return str;
    }
    
    /**
     * This is the void method for setting the values. Overrides the method in the super class.
     */
    public void getCharacteristics()
    {
        m = "mammal";
        v = "vertebrate";
        p = "pet";
        fa = "farm animal";
        c = "varies";
        sz = "squeal or oink";
    }
}
