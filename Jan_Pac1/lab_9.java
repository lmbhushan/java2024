package Jan_Pac1;
import java.util.Scanner;
public class lab_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
	    String str1=sc.nextLine();
	    System.out.println("The Concatination of two strings is:");
	    String str2=str1;
		System.out.println(str1+str2);
		
		System.out.println("Replace the odd postion with #");
        
	    for(int i=0;i<str1.length();i++) {
		if(i%2!=0)
		{
			System.out.print('#');
		}
		else
		{
			System.out.print(str1.charAt(i));
		}
	
	}
	    
	    System.out.println();
		System.out.println("Remove the Duplicate character");
		String newstr=new String();
		int length=str1.length();
		for(int i=0;i<length;i++)
		{
		  char charAtPosition=str1.charAt(i);	
		  if(newstr.indexOf(charAtPosition)<0)
		  {
			  newstr+=charAtPosition;
		  }
		  
		}
		System.out.println("After Duplicate word remove:"+newstr);
		
		System.out.println();
		System.out.println("Change odd characters to Uppercase");
		for(int i=0;i<str1.length();i++) {
			char ch=str1.charAt(i);
		if(i%2!=0)
		{
			System.out.print(ch);
		}
		else
		{
			System.out.print(Character.toUpperCase(ch));
		}
	
	}
}
}