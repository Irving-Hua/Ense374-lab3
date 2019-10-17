//this class is used to test SavingAccount class
package lab1_assignment;

public class Bank {
   
	public static void main(String[] args) {
		
		CheckingAccount checking = new CheckingAccount();
		
		checking.setSavingBalance(1000);
		//b.deposit(b.getSavingBalance(),1000);
		
		System.out.println(checking.deposit(1000));
		System.out.println(checking.withdraw(1000));
		
		
		
	
		
			
	}
	
}
