package pac_2;

import javax.naming.InvalidNameException;

class Invalid_Name extends Exception{

	public Invalid_Name(String message) {
		super (message);
	}
}
 class Employee
{
	private String FirstName;
	private String LastName;
	
public Employee(String FirstName,String LastName) throws InvalidNameException
{
	validateName(FirstName,"First Name");
	validateName(LastName,"Last Name");
	
}
private void validateName(String Name,String fieldname) throws InvalidNameException
{
	if(Name.trim().isEmpty()) {
		 throw new InvalidNameException(fieldname+"cannot be blank");
	}
}
}
 public class Name_exception{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try
     {
    	 Employee employee=new Employee("","Walter");
     }
     catch(InvalidNameException e)
    	 {
    		System.out.println("Error:"+e.getMessage());
    	 }
      }
	}


