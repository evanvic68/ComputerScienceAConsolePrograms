import java.util.Scanner;

/**
 * This runs the savingsAccount object
 *
 * @author Evan Vicidomini
 * @version 9/20
 */
public class SavingsAccountDriver
{
    public static void main(String[] args)
    {
        //Define the first savings account
        SavingsAccount sa = new SavingsAccount();
        
        //Get the interest rate, balance, deposit, and withdrawal (and Scanner)
        double totalBalance = sa.getBalance();
        double interestRate = sa.getInterestRate();
        double[] deposit = sa.getDeposit();
        double[] withdrawal = sa.getWithdrawals();
        Scanner kb = new Scanner(System.in);
        
        //Send the message to the user
        System.out.println("What is the interest rate? " + interestRate);
        interestRate = kb.nextDouble();
        
        //Create a loop for the interestRate
        while(interestRate < 0 || interestRate > 0.5)
        {
            if(interestRate < 0)
            {
                System.out.println("This is to low");
                interestRate = kb.nextDouble();
            }
            else if(interestRate > 0.5)
            {
                System.out.println("This value seems too unlikely");
                interestRate = kb.nextDouble();
            }
        }
        
        //Add in the interest
        totalBalance += (totalBalance * interestRate);
        
        //Print out the deposit
        System.out.print("Here is the deposits for the bank account");
        System.out.print(" " + deposit[0] + "\r");
        System.out.println(deposit[1]);
        System.out.println(deposit[2]);
        System.out.println(deposit[3]);
        System.out.println(deposit[4] + "\r");
        
        //Print out the deposit
        System.out.print("Here is the deposits for the bank account \r");
        System.out.print(" " + withdrawal[0] + "\r");
        System.out.println(withdrawal[1]);
        System.out.println(withdrawal[2]);
        System.out.println(withdrawal[3]);
        System.out.println(withdrawal[4]);
        System.out.println(withdrawal[4]);
        System.out.println(withdrawal[5]);
        System.out.println(withdrawal[6]);
        
        //Add deposit to the total balance
        totalBalance += deposit[0];
        totalBalance += deposit[1];
        totalBalance += deposit[2];
        totalBalance += deposit[3];
        totalBalance += deposit[4];
        
        //Subtract withdrawal from totalBalance
        totalBalance -= withdrawal[0];
        totalBalance -= withdrawal[1];
        totalBalance -= withdrawal[2];
        totalBalance -= withdrawal[3];
        totalBalance -= withdrawal[4];
        totalBalance -= withdrawal[5];
        totalBalance -= withdrawal[6];
        
        //Print the totalBalance to the user
        System.out.println("Here is the total balance");
        System.out.println(totalBalance);
    }
}
