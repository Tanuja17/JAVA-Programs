package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SumAverage {
  public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n,sum=0,avg;
		 System.out.println("enter size of an array: ");
		 n=sc.nextInt();
		 int []a=new int[n];
		
		for(int i=0;i<n;i++)
			{
				System.out.println("Enter "+i+" element: ");
				a[i]=sc.nextInt();
				
			}
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
	    }
		avg=sum/n;
		System.out.println("Sum of elements in an array: "+sum);
		System.out.println("Average of elements in an array: "+avg);
		
		

  }
}