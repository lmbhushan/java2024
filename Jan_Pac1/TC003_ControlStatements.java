package Jan_Pac1;

public class TC003_ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        int m=-1;
        while(n>0)
        {
        	System.out.println("The value of n is:"+n);
        	n--;
        }
        do
        {
        	System.out.println("The value is m is:"+m);
        	m--;
        }while(m>0);
		
		
		for(int i=0;i<=4;i++)
           {
        	   switch(i)
        	   {
        	   case 0:
        		   System.out.println("i is zero");
        		   break;
        	   case 1:
        		   System.out.println("i value is One");
        	       break;
        	   case 2:
        		   System.out.println("i value is Two");
        		   break;
        	   case 3:
        		   System.out.println("i value is Three");
        		   break;
        	   default:
        		   System.out.println("i value is greater than Three");
        	   }
           }
	}

}
