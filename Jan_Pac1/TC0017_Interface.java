package Jan_Pac1;


public class TC0017_Interface {

	public interface simplecalc
	{
		int add(int a,int b);
		
	}
	class calc implements simplecalc
	{
		public int add(int a,int b)
		{
			return a+b;
		}
		

	}

	
}
