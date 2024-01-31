package Jan_Pac1;

public class TC002_variables {
	private double dblwdth;
	private double dblheight;
	private double dbldepth;
	private static int boxid;
	
	
	public double volume()
	{
		dblwdth=10;
		dblheight=10;
		dbldepth=10;
		
		double deltemp;
		deltemp =dblwdth*dblheight*dbldepth;
		return deltemp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC002_variables obj=new TC002_variables();
        System.out.println(obj.volume());
	}

}
