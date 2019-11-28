package logicalQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class LcmArry {
	public static void main(String[] args) {
		// LCM of  numbers in the array
		Scanner s=new Scanner(System.in);
		int min=0, max=0, x, lcm = 0;
		System.out.println("enter the size :");
		int size=s.nextInt();
		
		int myArray[]=new int[size];
		
		int d=myArray.length;
		for(int i=0;i<size;i++)
		{
			myArray[i]=s.nextInt();
		}
		
	      
		for(int i = 0; i<myArray.length; i++) 
		{
	         for(int j = i+1; j<myArray.length ; j++) 
	         {
	            if(myArray[i] > myArray[j]) 
	            {
	               min = myArray[j];
	               max = myArray[i];
	            } 
	            else 
	            {
	               min = myArray[i];
	               max = myArray[j];
	            }
	         }
        }
		System.out.println(min);
		System.out.println(max);
	            for(int k =0; k<myArray.length; k++) 
	            {
	               x = k * max;
	               
	               if(x % min == 0) 
	               {
	                  lcm = x ;
	               }
	        
	      }
	      System.out.println("LCM  : " + lcm);
}
}
