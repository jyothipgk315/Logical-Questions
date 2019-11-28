package logicalQuestions;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		// Decimal to Binary Conversion
Scanner s=new Scanner (System.in);
System.out.println("Decimal");
int n=s.nextInt();
int d=0;
String x="";
while (n!=0)
{
	d=n%2;
	x=d+" "+x;
	n=n/2;
	
	
}
System.out.println(x);
	}

}
