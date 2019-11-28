package logicalQuestions;

import java.util.Scanner;

public class DecoTOoct {

	public static void main(String[] args) {
		//Decimal number into octal number.
		Scanner s=new Scanner (System.in);
		int decimal=s.nextInt();
		String oct="";
		while (decimal!=0)
		{
			int a=decimal%8;
			oct=a+oct;
			decimal=decimal/8;
		}
		System.out.println(oct);
	}

}
