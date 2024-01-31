package Jan_Pac1;
import java.util.Scanner;

import Jan_Pac1.lab_3;

public class lab_3main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
lab_3 lb=new lab_3();
lb.setFname("Rahul");
System.out.println(lb.getFname());
lb.setLname("Singh");
System.out.println(lb.getLname());
lb.setgender('M');
System.out.println(lb.getGender());

Scanner sc=new Scanner(System.in);
System.out.println("Enter Phone Number:");
String num=sc.next();

	}

}
