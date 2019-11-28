package logicalQuestions;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// Perfect number
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the number :");
		int n=s.nextInt();
		int a=n;
		int j=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				j=j+i;
			}
			
		}
		if(a==j)
		{
			System.out.println("Perfect number");
		}
		else 
		{
			System.out.println("Not A Perfect Number");
		}

	}

}
