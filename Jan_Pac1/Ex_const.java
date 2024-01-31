package Jan_Pac1;

public class Ex_const {
	int mathmarks;
	int scimarks;
	int engmarks;
	
	Ex_const(int math,int sci,int eng)
	{
		this.mathmarks=math;
		this.scimarks=sci;
		this.engmarks=eng;
	}
	public void total()
	{
		int totalmarks;
		totalmarks=mathmarks+scimarks+engmarks;
		System.out.println("Total marks is:"+totalmarks);
	}
}
