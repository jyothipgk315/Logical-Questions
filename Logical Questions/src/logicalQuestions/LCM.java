package logicalQuestions;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// LCM of two numbers

	Scanner s=new Scanner (System.in);

	int n1=s.nextInt();
	int n2=s.nextInt();
	int lcm =0;
	int	max = (n1 > n2) ? n1 : n2;
		        for(int i=max;i<n1*n2;i++)		        {
		            if( i % n1 == 0 && i % n2 == 0 )
		            {
		                lcm=i;
		                break;
		            }
		           
		        }
		        System.out.println(lcm);
	}
	

}
