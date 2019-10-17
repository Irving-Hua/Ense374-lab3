package lab1_assignment;

public class CheckingAccount  extends SavingTool{
	public double deposit (double deposit)
	{
		
		System.out.println("your balance is: ");
		double balance = getSavingBalance();
		setSavingBalance(balance + deposit);
		return balance+deposit;
}
	public double withdraw(double withdraw)
	{
		double balance = getSavingBalance();
		if (balance < withdraw)
		{
			System.out.println("not engouht banlance to withdraw");	
			return balance;
		}
		else
		{
			System.out.println("your balance is: ");
			setSavingBalance(balance -withdraw);
		    return balance - withdraw;
		}
	}

}
