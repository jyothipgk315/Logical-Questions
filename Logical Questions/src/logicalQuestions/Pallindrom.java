package logicalQuestions;

import java.util.Scanner;

public class Pallindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a=n;
		int rev=0;
		while(n!=0)
		{
			int d=n%10;
			rev=(rev*10)+d;
			n=n/10;
		}
if(rev==a)
	
{
	System.out.println("pallindrom");
}
else
{
	System.out.println("not pallindrom");
}
	}

}
