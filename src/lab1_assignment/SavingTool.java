

package lab1_assignment;


public class SavingTool {

	private static double annualInterestRate;
	private double savingBalance;
 	public double monthlyInterest()
	{
		return getAnnualInterestRate()/12;
	}
 	public double biweeklyInterest() {
 		
 		return getAnnualInterestRate()/26;
 	}
	public double monthlyBalance()
	{	
		return getSavingBalance() * (1+ monthlyInterest());	
	}

	public  static double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingTool.annualInterestRate = annualInterestRate;
	}
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}	
	public double monthlyCompound()
	{
		double monthlyCompound = getSavingBalance()* Math.pow(1+monthlyInterest(),12);
		
		return monthlyCompound;
	}
	public double biweeklyCompound()
	{
		double monthlyCompound = getSavingBalance()* Math.pow(1+biweeklyInterest(),26);
		
		return monthlyCompound;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingTool saver1 = new SavingTool();
		SavingTool saver2 = new SavingTool();
		//annual interest is 0.04
		SavingTool.setAnnualInterestRate(0.04);
		saver1.setSavingBalance(2000.00);
		saver2.setSavingBalance(3000.00);
		
		//1
		System.out.println(saver1.monthlyInterest());
		
		double balance1 = saver1.getSavingBalance()* Math.pow(1+saver1.monthlyInterest(),12);
		
		System.out.println(balance1);
		//2
		
		
		System.out.println(saver2.monthlyInterest());
		
		double balance2 = saver2.getSavingBalance()* Math.pow(1+saver2.monthlyInterest(),12);
		
		
		System.out.println(balance2);
		
		
		//set annual interest to 0.05
		SavingTool.setAnnualInterestRate(0.05);
		
System.out.println(saver1.monthlyInterest());
		
		double balance3 = saver1.getSavingBalance()* Math.pow(1+saver1.monthlyInterest(),12);
		
		System.out.println(balance3);
		//2
		
		
		System.out.println(saver2.monthlyInterest());
		
		double balance4 = saver2.getSavingBalance()* Math.pow(1+saver2.monthlyInterest(),12);
		
		
		System.out.println(balance4);
		
		//System.out.println(SavingAccount.getAnnualInterestRate());
	}
	



}


