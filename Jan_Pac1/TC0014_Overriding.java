package Jan_Pac1;

	
	class SwipeMachine{
		void readCard() {
			System.out.println("To read the Normal Cards");
			
		}
	}
	class ChipCardMachine extends SwipeMachine{
		@Override
		void readCard() {
			super.readCard();
			System.out.println("To read the Chip based cards");
			
		}
	}
	public class TC0014_Overriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//SwipeMachine normal=new SwipeMachine();
	//normal.readCard();
	//normal=new ChipCardMachine();
	//normal.readCard();
    // SwipeMachine obj1=new SwipeMachine();
     //obj1.readCard();
     
     //ChipCardMachine obj2=new ChipCardMachine();
     //obj2=readCard();
}
}