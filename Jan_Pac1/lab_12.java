package Jan_Pac1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class lab_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First date in yyyy-mm-dd");
		String input1 = sc.next();
		
		LocalDate date1 = LocalDate.parse(input1);
		System.out.println(date1);
		
		System.out.println("Enter your Second date in yyyy-mm-dd");
		String input2 = sc.next();
		
		LocalDate date2 = LocalDate.parse(input2);
		System.out.println(date1);
		sc.close();
		
		Period diff = Period.between(date1, date2);
		
		System.out.println("Years: "+diff.getYears()+" Months : "+diff.getMonths()+" Days : "+diff.getDays());
	}
}

