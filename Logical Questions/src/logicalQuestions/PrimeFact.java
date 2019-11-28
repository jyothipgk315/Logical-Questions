package logicalQuestions;

import java.util.Scanner;

public class PrimeFact {

	public static void main(String[] args) {
		// Prime factorization of the given number
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		
		
		for(int i=2;i<=n;i++)
		{
		while(n%i==0)
			{
			System.out.println(i);
			n=n/i;
			}
			
		}
		if(n<1)
		{
			System.out.println(n);
		}
		
	}

}
