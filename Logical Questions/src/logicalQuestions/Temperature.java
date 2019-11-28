package logicalQuestions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
// Temperature in Centigrade and convert to Fahrenheit
	Scanner s=new Scanner (System.in);
	System.out.println("Centigrade :");
	double c=s.nextDouble();
	double r=(c*1.8)+32;
	System.out.println("Fahrenheit :"+r);
	}

}
