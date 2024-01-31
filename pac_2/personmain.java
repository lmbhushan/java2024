package pac_2;

import org.junit.Test;

public class personmain {

@Test
	public void test() {
		Person2 p=new Person2();
	     p.setFirstName("Rahul");
	     p.setLastname("Singh");
	     p.setGender("M");
	     p.setAge(22);
	     
	     System.out.println("FirstName:"+p.firstName);
	     System.out.println("LastName:"+p.lastname);
	     System.out.println("Gender:"+p.gender);
	     System.out.println("Age:"+p.Age);
	    
}
}
