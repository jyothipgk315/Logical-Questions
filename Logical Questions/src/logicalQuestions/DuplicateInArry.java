package logicalQuestions;

import java.util.Scanner;

public class DuplicateInArry {

	public static void main(String[] args) {
		// Duplicate elements in the array
		Scanner s=new Scanner(System.in);
		System.out.println("size :");
		int size=s.nextInt();
		int arr[]=new int[size];
		
		int i, j; 
		for(i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
        System.out.println("Repeated Elements are :"); 
        for (i = 0; i < size; i++)  
        { 
            for (j = i + 1; j < size; j++)  
            { 
                if (arr[i] == arr[j])  
                    System.out.print(arr[i] + " "); 
            } 
        } 
	}

}
