package logicalQuestions;

import java.util.Scanner;

public class FibRev {

	public static void main(String[] args) {
		// Reverse order of fibonacci series
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range :");
		int n=s.nextInt();
		 int a[] = new int[n]; 
	      
	        // assigning first and second elements 
	        a[0] = 0; 
	        a[1] = 1; 
	      
	        for (int i = 2; i < n; i++) 
	        { 
	      
	            // storing sum in the preceding location 
	             
	            a[i] = a[i - 2] + a[i - 1]; 
	        } 
	      
	        for (int i = n - 1; i >= 0; i--)  
	        { 
	      
	            // printing array in  reverse order 
	            
	            System.out.print(a[i] +" "); 
	        } 
	    } 
	}


