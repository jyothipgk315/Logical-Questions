package logicalQuestions;

import java.util.Scanner;

public class ArcLength {

	public static void main(String[] args) {
		// arc length of a circle  #2pi*r*(angle/360)
		Scanner s=new Scanner (System.in);
		System.out.println("enter the Radius :");
		double r=s.nextInt();
		System.out.println("enter the angle :");
		double angle=s.nextInt();
		if(angle>360)
		{
			System.out.println("Invalid angle");
		}
		else
		{
			double len=2*Math.PI*r*(angle/360);
			System.out.println("Arc length :"+len);
		}
		
	}

}
