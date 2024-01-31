package Jan_Pac1;

interface simplecal
{
	int add(int a,int b);
}
public class TC0018_Interface implements simplecal
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC0018_Interface c=new TC0018_Interface();
		System.out.println(c.add(10,10));

	}
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	

}
