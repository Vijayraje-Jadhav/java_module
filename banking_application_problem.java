package Assignment_on_java;
import java.util.*;
import java.util.Scanner;

/*
	Create a simple banking application that manages different types of bank accounts. Your program should include the following components:

A class to represent a general bank account that includes common attributes such as account number, account holder's name, and a method to display account details.

Two specific types of accounts: one for savings and another for current accounts. The savings account should have features like interest calculation, while the current account might support overdraft facilities. Implement the unique features as methods within each account class.

Define a set of methods that outline essential operations such as depositing money, withdrawing money, and checking the account balance. Each account type should implement these methods in a way that reflects its specific behavior.

Create an array to store multiple account objects. Your main method should instantiate different account types, add element and demonstrate their functionalities by calling the methods you defined for depositing, withdrawing, and displaying account details.
 */

abstract class bank_account {
	int account_number;
	String account_name;
	int account_balance;
	int interest_percentage;
	int money_withdraw_amount;
	int money_deposite_ammount;
	
	
	
	Scanner sc = new Scanner(System.in);
	
	public void display() {
		System.out.println("account number" + this.account_number + " Account name " + this.account_name );
	}
	
	public void withdraw_amount(int money_withdraw_amount) {
			
		
		 this.account_balance =  this.account_balance - money_withdraw_amount;
		 System.out.println("Your  Final accont balance after withdraw  is   " +this.account_balance);
	}
	
	public void deposite_money(int money_deposite_ammount) {
		//money_deposite_ammount = this.money_deposite_ammount;
		 
		System.out.println("please enter the deposite amount: ");
		
		this.account_balance =  this.account_balance + money_deposite_ammount;
		System.out.println("Your Final accont balance after deposite  is " +this.account_balance);
	}
	
}

class savings_account extends bank_account{
	
	int overdraft_amount;
	
	
	public void interest_calculator(int interest_percentage) {
		this.account_balance = this.account_balance +(   this.account_balance * this.interest_percentage /100);
		System.out.println("the calculated amount with the interest is " +this.account_balance);
	}
	
	public void overdraft(int overdraft_amount) {
		
		
	}
	
	
}

class current_acount extends savings_account{
	
}











public class banking_application_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//savings_account s1= new savings_account();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		savings_account[] vijaya = new savings_account[2] ; //we are declaring array here to be available for everywhere
		
		
		
do {
		System.out.println("***************** account operations ****************");
		System.out.println("Press 1 to add the account");
		System.out.println("Press 2 to display account");
		System.out.println("Press 3 to deposite");
		System.out.println("Press 4 to withdraw ");
		System.out.println("Press 5 to calculate interst ");
		System.out.println("Press 6 to exit");
		
		System.out.println("*****************************************************");
		System.out.println(" enter your choice");
		
		
		choice = sc.nextInt();
		
		switch (choice) {
		
		case 1:
			try {
			
				boolean flag = false;
				
				for (int i =0; i<vijaya.length; i++) {
					if (vijaya[i]==null) {
						
						flag = true;
						
						vijaya[i] = new savings_account(); //instance created
						
						System.out.println("Enter account number :");
						vijaya[i].account_number = sc.nextInt();
						sc.nextLine();
						
						System.out.println("Enter your name :");
						vijaya[i].account_name = sc.nextLine();
						
						System.out.println("Enter account_balance :");
						vijaya[i].account_balance = sc.nextInt();
					
						
						System.out.println(" Record added successfully "  );
						break;
					}
				}
				if (flag==false) {
					System.out.println(" input error"  );
				}
			}
			catch(InputMismatchException e) {
				System.out.println(" input is invalid exception " + e.getMessage());
			}
			catch (Exception e) {
				System.out.println(" input is invalid exception " + e.getMessage());
				 e.printStackTrace();
			}
			
				
		break;
		
		case 2:
			for (int i=0; i<vijaya.length; i++) {
				if (vijaya[i] != null) {
					System.out.println( "Account number: "+ vijaya[i].account_number+ "  Acccount Name: " +vijaya[i].account_name );
					
				}
			}
			
		break;
		
		case 3:
			try {
				
				boolean flag1 = false;
				
				for (int i =0; i<vijaya.length; i++) {
					if (vijaya[i]!=null) {
						
						flag1 = true;
						
						System.out.println(" enter the deposite value: ");
						vijaya[i].money_deposite_ammount = sc.nextInt();
						
						vijaya[i].deposite_money(vijaya[i].money_deposite_ammount );
						
						
						
						break;
					}
				}
				
				if (flag1==false) {
					System.out.println(" input error"  );
				}
				}
				catch(InputMismatchException e) {
					System.out.println(" input is invalid exception " + e.getMessage());
				}
				catch (Exception e) {
					System.out.println(" input is invalid exception " + e.getMessage());
				}
			
				
		break; 
		
		case 4:
				try {
				
				boolean flag2 = false;
				
				for (int i =0; i<vijaya.length; i++) {
					if (vijaya[i]!=null) {
						
						flag2 = true;
						
						System.out.println(" enter the withdraw value: ");
						vijaya[i].money_withdraw_amount = sc.nextInt();
						
						vijaya[i].withdraw_amount(vijaya[i].money_withdraw_amount );
						
						
						
						break;
					}
				}
				
				if (flag2==false) {
					System.out.println(" input error"  );
				}
				}
				catch(InputMismatchException e) {
					System.out.println(" input is invalid exception " + e.getMessage());
				}
				catch (Exception e) {
					System.out.println(" input is invalid exception " + e.getMessage());
				}
			
		break;
		
		case 5:
			try {
				
				boolean flag3 = false;
				
					for (int i =0; i<vijaya.length; i++) {
						if (vijaya[i]!=null) {
						
							flag3 = true;
							
							
							System.out.println("Enter interest percentage :");
							vijaya[i].interest_percentage = sc.nextInt();
							
							vijaya[i].interest_calculator(vijaya[i].interest_percentage);
							
							
							
							break;
						}
					}
					
					if (flag3==false) {
						System.out.println(" input error"  );
					}
				}
				catch(InputMismatchException e) {
					System.out.println(" input is invalid exception " + e.getMessage());
				}
				catch (Exception e) {
					System.out.println(" input is invalid exception " + e.getMessage());
				}
				
		break;
		
		case 6:
			System.out.println(" Thank you for visiting the site ");
			
		break;
		
	}

}while(choice!=6);

	}
	
}



