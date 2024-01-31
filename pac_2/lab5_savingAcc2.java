package pac_2;

public class lab5_savingAcc2 extends lab5_account2 {

final double minbalance;
	
	
	public lab5_savingAcc2(String accholder, double initialval) {
		super(accholder, initialval);
		this.minbalance = 2000;
	}

	@Override
	public void withdraw(double withdraw) {
		if(balance>=minbalance) {
			balance-=withdraw;
			System.out.println("Your balance is : "+ balance);
		}else
			System.out.println("Minimum Balance insufficient");
	}
}
