package pac_2;
public class lab5_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 lab5_savingAcc2 sav1 = new  lab5_savingAcc2("Rahul", 4000);
		lab5_currentAcc2 cur1 = new lab5_currentAcc2("Karan", 3000);
		
		sav1.display();
		cur1.display();
		
		sav1.withdraw(2000);
		cur1.withdraw(1000);
	}

}
