package Jan_Pac1;

import java.util.UUID;

public class Account
{
	 private String accNum;
	 private double balance;
	 private String person ;
	 
	 public Account(String accountholdername,double initialbal)
	 {
		 this.accNum=UUID.randomUUID().toString();
		 this.person=accountholdername;
		 this.balance=initialbal;
	 }
	 

public void deposite(double amount)
{
	balance+=amount;
	System.out.println(amount+"is deposited to your accountnumber"+accNum);
}
public void withdraw(double amount)
{
	if(balance>amount)
	{
	System.out.println(amount+ "is withdrawn from your account" );
	}
	else
	{
		System.out.println("Insufficent Balance");	
	}
	
}
public void displaybalance()
{
	System.out.println("Accountholder:"+accNum);
	System.out.println("AccountHoldername:"+person);
	System.out.println("balance:"+balance);
}
}

