//Write a program to arrange the elements of an given array of integers where all positive integers appear before all the negative integers.Write a

package Array;

import java.util.Scanner;

public class PosNegArrangement {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int n,sum=0,avg,j=0;;
		 System.out.println("enter size of an array: ");
		 n=sc.nextInt();
		 int []a=new int[n];
		 int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
			{
				System.out.println("Enter "+i+" element: ");
				a[i]=sc.nextInt();
				
			}
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
			{
				arr[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<0)
			{
				arr[j]=a[i];
				j++;
			}
		}
		for(int num:arr)
		{
			System.out.println(num);
		}
		
	}

}
