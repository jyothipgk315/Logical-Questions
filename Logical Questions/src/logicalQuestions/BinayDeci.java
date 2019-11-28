package logicalQuestions;

import java.util.Scanner;

public class BinayDeci {

	public static void main(String[] args) {
		// Binary to decimal conversion
		//Integer.parseInt(String,radix)
Scanner s=new Scanner (System.in);
String n=s.next();
int decimal=Integer.parseInt(n,2);
System.out.println(decimal);
	}
}
