package logicalQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class GcdArry {

	public static void main(String[] args) {
		// GCD of the array elements
		Scanner s=new Scanner(System.in);
		int siz =s.nextInt();
		
		int []a=new int[siz];
		
		for(int i=0;i<siz;i++)
		{
			a[i]=s.nextInt();
		}
		
		
	      Arrays.sort(a);
	      int small=a[0];
	     int i=1;
	      while(i<a.length)
	      {
	         if(a[i]%small==0)
	         {
	            i++;
	         } else {
	            small = a[i]%small;
	            i++;
	         }
	      }
	      System.out.println("GCD is "+small);
	    
	}

}
