//Write a program to get the difference between the largest and smallest values in an array of integers.

package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DiffLargestandSmallest {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n,largest,smallest,diff;
		 System.out.println("enter size of an array: ");
		 n=sc.nextInt();
		 int []a=new int[n];
		
		for(int i=0;i<n;i++)
			{
				System.out.println("Enter "+i+" element: ");
				a[i]=sc.nextInt();
				
			}
			Arrays.sort(a);
			smallest=a[0];
			largest=a[n-1];
			diff=largest-smallest;
			System.out.println("Difference between largest and smallest element in an array: "+diff);
			
	}

}
