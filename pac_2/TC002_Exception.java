package pac_2;

public class TC002_Exception {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
  try{	
     String str=null;
     str.equals("hello");
	}
  catch(Exception e)
  {
	  System.out.println("Exception is:"+e);
  }
  finally
  {
	  System.out.println("Hello");
  }
  Thread.sleep(300);
  System.out.println("Welcome");
	}
}
