package logicalQuestions;

import java.util.Scanner;

public class Segregate0Left1Right {

	public static void main(String[] args) {
		// Segregate 0’s on leftside and 1’s on rightside 
		//in the given array
		Scanner s=new Scanner (System.in);
		System.out.println("Range");
		int n=s.nextInt();
		System.out.println("Numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int count = 0; // counts the no of zeros in arr 
	      
        for (int i = 0; i < n; i++) { 
            if (arr[i] == 0) 
                count++; 
        } 
  
        // loop fills the arr with 0 until count 
        for (int i = 0; i < count; i++)
        {
            arr[i] = 0; 
        }
        // loop fills remaining arr space with 1 
        for (int i = count; i < n; i++)
        {
            arr[i] = 1; 
        } 
      
    // function to print segregated array 
      System.out.println("Array after segregation is "); 
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");     
        } 
      
	}

}
