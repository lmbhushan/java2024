package Jan_Pac1;

public class lab_3 {

lab_3(String fname,String lname,char gender,String phone){
	super();
    this.fname=fname;
    this.lname=lname;
	this.gender=gender;
	this.phone=phone;
}
lab_3(){
	super();
}
private String fname;
private String lname;
private char gender;
private String phone;
	
public String getFname() {
	return fname;

}
	public void setFname(String fname) {
		this.fname=fname;
	}	
 
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public char getGender() {
		return gender;
	}
	public void setgender(char gender) {
		this.gender=gender;
	}
	public String getphone() {
		return phone;
	}
	public void setphone(String phone) {
		this.phone=phone;
	}
	public void print() {
               System.out.println("First Name:"+fname+"Last name:"+lname+"Gender:"+gender);		
	}
	
	}

	


