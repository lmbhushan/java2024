package pac_2;

import org.junit.Test;

public class Person1 {

	private String firstname;
	private String lastname;
	public Person1(String fname,String lname)
	{
		if(fname==null&&lname==null){
			throw new IllegalArgumentException("Both names acannot be null");
		}
		this.firstname=fname;
		this.lastname=lname;
	}
	public Person1(String fname, int i) {
		// TODO Auto-generated constructor stub
	}
	public String getfullname()
	{
		String first=(this.firstname !=null)?this.firstname:"?";
		String last=(this.lastname !=null)?this.lastname:"?";
		return first+" "+last;
	}
	public String getFirstName()
	{
		return this.firstname;
	}
	public String getLastName()
	{
		return this.lastname;
	}
	public void getempdetails() {
		// TODO Auto-generated method stub
		
	}
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
//	@Test
//	public void test()
//	{
//	 
//		
//   Person1 p=new Person1("Rahul","Singh");
//   System.out.println(p.getFirstName());
//   System.out.println(p.getLastName());
//   System.out.println(p.getfullname());
//	}

}
