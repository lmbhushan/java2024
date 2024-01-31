package pac_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC001_Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st1="Welcome";
		String pattern="Welcome";
		boolean patternmatch=Pattern.matches(st1, pattern);
        
		System.out.println("Matching:"+patternmatch);
		
		String input="Shop,Mop,Hopping,Chopping";
		Pattern p1=Pattern.compile("ping");
		Matcher m1=p1.matcher(input);
		System.out.println(m1.matches());
		while(m1.find())
		{
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		String n1="1234567890";
		String Aadhar="1234 1234 1234";
		String email="rahul@gmail.com";
		String s1="Welcome to Amazon 12345";
		Pattern p2=Pattern.compile("^[A-Z].*[0-9]$");
		//Pattern p3=Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
		Pattern p3=Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		//Pattern emailpattern=Pattern.compile("^(.+)@(\\S+)$");
		//Pattern emailpattern=Pattern.compile("^(.+)@(\\S+).com");
		Pattern emailpattern=Pattern.compile("^(.+)@(\\S).*(.com)$");
		Pattern Aadharpattern=Pattern.compile("^[0-9][0-9][-0-9][0-9]\\s[0-9][0-9][-0-9][0-9]\\s[0-9][0-9][-0-9][0-9]");


		Matcher m2=p2.matcher(s1);
		Matcher m3=p3.matcher(n1);
		Matcher Aadhar_m5=Aadharpattern.matcher(Aadhar);
		Matcher email_m4=emailpattern.matcher(email);
		if(m2.find())
		{
			System.out.println("pattern matched");
		}
		else
		{
			System.out.println("Pattern Not matched ");
		}
		
		if(m3.find())
		{
			System.out.println("PhoneNumber Pattern Matched");
		}
		else
		{
			System.out.println("PhoneNumber Pattern Not Matched ");
		}
		if(email_m4.find())
		{
			System.out.println("Email Pattern Matched");
		}
		else
		{
			System.out.println("Email Pattern Not Matched ");
		}
		if(Aadhar_m5.find())
		{
			System.out.println("Aadhar Pattern Matched");
		}
		else
		{
			System.out.println("Aadhar Pattern Not Matched ");
		}
	}

}
