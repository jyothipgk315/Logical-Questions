package logicalQuestions;

import java.util.Scanner;

public class FibUPn {

	public static void main(String[] args) {
		// fibnocci upto n
		Scanner s=new Scanner(System.in);
		int a=0;
		int b=1;
		System.out.println("enter the range:");
		int n=s.nextInt();
System.out.println(a);
System.out.println(b);
for(int i=2;i<n;i++)
{
	int d=a+b;
	a=b;
	b=d;
	System.out.println(d);
	
}
	}

}
