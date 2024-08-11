
/**
 * This program demostrates the savingsAccount object
 *
 * @author Evan Vicidomini
 * @version 9/20
 */
public class SavingsAccount
{
    //Define the global variables
    public double totalBalance;
    public double interestRate;
    public double[] deposit = new double[5];
    public double[] withdrawal = new double[7];
    
    /**
     * Constructor for objects of class SavingsAccount
     */
    public SavingsAccount()
    {
        totalBalance = 0;
        interestRate = 0;
        deposit[0] = 0;
        deposit[1] = 0;
        deposit[2] = 0;
        deposit[3] = 0;
        deposit[4] = 0;
        withdrawal[0] = 0;
        withdrawal[1] = 0;
        withdrawal[2] = 0;
        withdrawal[3] = 0;
        withdrawal[4] = 0;
        withdrawal[5] = 0;
        withdrawal[6] = 0;
    }

    /**
     * Constructor for the set methods
     */
    public SavingsAccount(double balance, double interest, double[] depos, double[] withd)
    {
        totalBalance = balance;
        interestRate = interest;
        deposit = depos;
        withdrawal = withd;
    }
    /**
     * This gets the total balance of the bank account
     *
     * @return totalBalance   the balance of the savings account
     */
    public double getBalance()
    {
        totalBalance = 500;
        return totalBalance;
    }
    
    /**
     * This gets the interest rate 
     *
     * @return deposit   the deposit of money in the account
     */
    public double getInterestRate()
    {
        return interestRate;
    }
    
    /**
     * This gets the deposit from the savings account
     *
     * @return deposit   the deposit of money in the account
     */
    public double[] getDeposit()
    {
        deposit[0] = 100.00;
        deposit[1] = 124.00;
        deposit[2] = 78.92;
        deposit[3] = 37.55;
        deposit[4] = 83.47;
        
        return deposit;
    }
    
    /**
     * This gets the withdrawals from the savings account
     *
     * @return    the sum of x and y
     */
    public double[] getWithdrawals()
    {
        withdrawal[0] = 29.88;
        withdrawal[1] = 110.00;
        withdrawal[2] = 27.52;
        withdrawal[3] = 50.00;
        withdrawal[4] = 12.90;
        withdrawal[5] = 15.20;
        withdrawal[6] = 11.09;
        
        return withdrawal;
    }
}
