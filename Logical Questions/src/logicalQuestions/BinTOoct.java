package logicalQuestions;

import java.util.Scanner;

public class BinTOoct {

	public static void main(String[] args) {
		// Binary number into octal number.
		Scanner s=new Scanner (System.in);
		String oct ="";
		String n=s.next();
		int decimal=Integer.parseInt(n,2);
		while (decimal!=0)
		{
			int a=decimal%8;
			oct=a+oct;
			decimal=decimal/8;
		}
		System.out.println(oct);
	}

}
