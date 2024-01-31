package pac_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TC005_junitfile {
	@Test
	public void test()
	{
	 
		
   Person1 p=new Person1("Rahul","Sngh");
  // System.out.println(p.getFirstName());
  // System.out.println(p.getLastName());
   System.out.println(p.getfullname());
   assertEquals("Rahul Singh",p.getfullname());
   assertEquals(5,5);
	}

}
