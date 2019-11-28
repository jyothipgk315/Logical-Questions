
package logicalQuestions;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {
		// sum of prime numbers in a range
Scanner s=new Scanner (System.in);
System.out.println("enter the range :");
int range=s.nextInt();

int sum=0;
int i;
	for(int n=2;n<=range;n++)
	{
		int f=0;
	for(i=2;i<n/2;i++)
	{
		if(n%i==0)
		{
			f=1;
			break;
		}
	}


	if(f==0)
	{
		sum=sum+n;
	}
	}
System.out.println(sum);
	}

}
