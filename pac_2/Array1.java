package pac_2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[];
     arr=new int[2];
     arr[0]=4;
     arr[1]=5;
     System.out.println(arr[0]);
     System.out.println(arr[1]);
     System.out.println(arr.length);
     int arr1[]= {500,100,60,300,700};
     Arrays.sort(arr1);
     for(int i:arr1)
     {
    	 System.out.println("foreach"+i);
     }
     for(int i=0;i<arr1.length;i++)
     {
    	 System.out.println("for loop" +arr1[i]);
     }
     System.out.println(arr1.length);
     System.out.println(arr1[0]);
     
    // int twodim[][]=new int[2][2];
    // System.out.println("Two dim length:"+twodim.length);
 
     String twodim[][]=new String[2][2];     
     twodim[0][0]="Apple";
     twodim[0][1]="Apple1";
     twodim[1][0]="Apple";
     twodim[1][1]="Apple1";
     System.out.println(twodim[0][1]);
	}

}
