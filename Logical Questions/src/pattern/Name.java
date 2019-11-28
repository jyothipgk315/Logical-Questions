package pattern;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		for(int i=0;i<=5;i++)
		{
		for(int j=0;j<=3;j++)
		{
			
			if(i==1&&j==0||i==2&&j==1||i==3&&j==2||i==4&&j==3||i==0&&j==1||i==0&&j==2||i==1&&j==3||i==4&&j==0||i==5&&j==1||i==5&&j==2)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
		}

	}

}
