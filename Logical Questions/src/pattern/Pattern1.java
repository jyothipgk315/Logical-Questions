package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
int number=s.nextInt();
for(int i=0;i<=number;i++)  //allocates rows
{
	for(int j=0;j<=i;j++)   //allocate column
	{
	System.out.print("*"+" ");	// print the *
	}
	System.out.println();       // for next Line
}
	}

}
