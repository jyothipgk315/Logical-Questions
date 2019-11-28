package logicalQuestions;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// Find simple interest
		 //SI=pnr/100
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the Prime Amount :");
		int p=s.nextInt();
		System.out.println("Rate of Intrest per year :");
		double r=s.nextDouble();
		System.out.println("Enter the Time");
		int n=s.nextInt();
		double a=p*n*r/100;
		System.out.println("SI :"+a);
	}

}
