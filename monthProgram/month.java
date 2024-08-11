
/**
 * This program creates a month object, and is manipulated with constructors, 
 * equals, toString, and get methods
 *
 * @author Evan Vicidomini
 * @version 10/3
 */
public class month
{
    //Declare the instances for the month object
    public int monthNumber;
    public String monthName;
    
    /**
     * First Constructor for the month object; is the default constructor
     */
    public month()
    {
        monthNumber = 1;
    }
    
    /**
     * Second Constructor for the month object, and is for set methods
     * 
     * @param monthName   Sets the value for the month number
     */
    public month(String monName)
    {
        monthName = monName;
        switch(monthName)
        {
            case "January":
                monthNumber = 1;
                break;
            case "February":
                monthNumber = 2;
                break;
            case "March":
                monthNumber = 3;
                break;
            case "April":
                monthNumber = 4;
                break;
            case "May":
                monthNumber = 5;
                break;
            case "June":
                monthNumber = 6;
                break;
            case "July":
                monthNumber = 7;
                break;
            case "August":
                monthNumber = 8;
                break;
            case "September":
                monthNumber = 9;
                break;
            case "October":
                monthNumber = 10;
                break;
            case "November":
                monthNumber = 11;
                break;
            case "December":
                monthNumber = 12;
                break;
        }
    }
   
    /**
     * Third Constructor for the month object, and uses conditional statements
     * to give the value of the month number
     * 
     * @param monthNumber   Sets the month name
     */
    public month(int monNumber)
    {
        monthNumber = monNumber;
        switch(monthNumber)
        {
            case 1: 
                monthName = "January";
                break;
            case 2: 
                monthName = "February";
                break;
            case 3: 
                monthName = "March";
                break;
            case 4: 
                monthName = "April";
                break;
            case 5: 
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7: 
                monthName = "July";
                break;
            case 8: 
                monthName = "August";
                break;
            case 9: 
                monthName = "September";
                break;
            case 10: 
                monthName = "October";
                break;
            case 11: 
                monthName = "November";
                break;
            case 12: 
                monthName = "December";
                break;
        }
    }
    
    /**
     * Fourth Constructor for the month object, and it creates a copy using a copy 
     * constructor method
     *
     * @param monthCopy  Creates the copy of a month
     */
    public month (month monthCopy)
    {
        monthNumber = monthCopy.monthNumber; 
        monthName = monthCopy.monthName;
    }
    
    /**
     * This get method gets the number of the month
     * 
     * @return monthNumber    The number of the month 
     */
    public int getMonthNumber()
    {
        return monthNumber;
    }
    
    /**
     * This get method gets the name of the month depending on number
     * 
     * @return monthName    The name of the month
     */
    public String getMonthName()
    {
        return monthName;
    }
    
     /**
     * This toString method creates the statement printed in the driver to 
     * display information
     * 
     * @return monthStatement    The String representing data
     */
    public String toString()
    {
        String str = ("Month Name: " + monthName + "\nMonthNumber: " + monthNumber + "\n");
        
        return str;
    }
    
     /**
     * This method gets the name of the month depending on number
     * 
     * @return monthName    The name of the month
     */
    public boolean equals(month m2)
    {
        boolean comparedMonth;
        
        if(this.monthNumber == (m2.monthNumber) && this.monthName.equals(m2.monthName))
        {
            comparedMonth = true;
        }
        else
        {
            comparedMonth = false;
        }
        
        return comparedMonth;
    }
    
     /**
     * This method gets a value for greater than for the month instances
     * 
     * @return greaterThan    The month that is greater in number
     */
    public boolean greaterThan(month m2)
    {
        boolean greaterThan;
        
        if(this.monthNumber > m2.monthNumber)
        {
           greaterThan = true; 
        }
        else
        {
            greaterThan = false;
        }
        
        return greaterThan;
    }
    
     /**
     * This method gets the month less than 
     * 
     * @return lessThan    The less than value
     */
    public boolean lessThan(month m2)
    {
        boolean lessThan;
        
        if(this.monthNumber < m2.monthNumber)
        {
            lessThan = true;
        }
        else
        {
            lessThan = false;
        }
        
        return lessThan;
    }
}
