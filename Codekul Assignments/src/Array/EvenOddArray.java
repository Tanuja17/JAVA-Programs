//Write a program to put even and odd elements of array in two separate arrays.

package Array;

import java.util.Scanner;

public class EvenOddArray {

	public static void main(String[] args) {
		int []a=new int[10];
		int []evenArr=new int[10];
		int []oddArr=new int[10];
        int j=0,k=0;
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter "+i+" element: ");
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				evenArr[j]=a[i];
			    j++;
			}
			else
		    {
				oddArr[k]=a[i];
				k++;
		    }
				
		}
		System.out.println("Even elements Array:");
		for(int i=0;i<j;i++)
		{
			System.out.println(evenArr[i]);
			
		}
		
		System.out.println("Odd elements Array:");
		for(int i=0;i<k;i++)
		{
			System.out.println(oddArr[i]);
			
		}
		
	}

}
