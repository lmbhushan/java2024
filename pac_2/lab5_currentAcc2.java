package pac_2;

public class lab5_currentAcc2 extends lab5_account2{

	final double limit;
	public lab5_currentAcc2(String accholder, double initialval) {
		super(accholder, initialval);
		this.limit=1000;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void withdraw(double amt ) {
		if(limit<amt) {
			balance-=amt;
			System.out.println("Amount withdraw now your balance is: "+balance);
		}
		else
			System.out.println("You exceed the limit");
	}
}
