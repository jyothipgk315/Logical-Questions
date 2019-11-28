package pattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int rows=s.nextInt();
		for (int i=1;i<=rows;i++)
        {
            for (int j=rows;j>i;j--)
            {
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=rows;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=rows-i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
	}

}
