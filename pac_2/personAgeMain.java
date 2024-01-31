package pac_2;


import java.util.Scanner;

class AgeException extends Exception{
	private int age;
	
	AgeException(int a){
		age = a;
	}
	public String toString() {
		return age +" is an invalid age";
	}
}
 class Person {
	 public String name;
	  public int age;
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2_1 [name=" + name + ", age=" + age + "]";
	}
	
	void getempdetails() throws AgeException {

		if(age<15) {
			throw new AgeException(age);
		}
		else {
			System.out.println("Name: "+name+ " Age:" +age);
		}
	
	}
}
public class personAgeMain {

	public static void main(String[] args) {
	
		 try {
			 Person1 p1 = new Person1("Kaushik", 10);
			   p1.getempdetails();
		   }
		 catch(AgeException e)
		   {
			   System.out.println(e); 
		   }
	}
}
