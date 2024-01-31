package pac_2;

import java.util.Arrays;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String Products[]= {"pen","pencil","book","scale"};
       System.out.println("String before Sorting");
       
      for(String s:Products)
      {
    	  System.out.println(s);
      }
       System.out.println("String After sorting");
       Arrays.sort(Products);
       for(String s:Products)
       {
    	   System.out.println(s);
       }
       
	}

}
