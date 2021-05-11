//Write a program to find the second largest element in an array

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestEle {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n;
		 System.out.println("enter size of an array: ");
		 n=sc.nextInt();
		 int []a=new int[n];
		
		for(int i=0;i<n;i++)
			{
				System.out.println("Enter "+i+" element: ");
				a[i]=sc.nextInt();
				
			}
			Arrays.sort(a);
		    System.out.println("Second largest element: "+a[n-2]);
			
	}

}
