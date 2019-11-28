package logicalQuestions;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// The power of a given number
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Number :");
		int number=s.nextInt();
		System.out.println("Enter the Power :");
		int power=s.nextInt();
		System.out.println("Power :"+Math.pow(number, power));
	}

}
