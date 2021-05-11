//Write a program to test if an array contains a specific value
package Array;

import java.util.Scanner;

public class SearchValue {

	public static void main(String[] args) {
		int []a=new int[5];
		int val,pos=0;
		boolean flag=false;
	    Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter "+i+" element: ");
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter value to search in array: ");
		val=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(a[i]==val)
			{
				flag =true;
				pos=i+1;
				
			}
			
		}
		if(flag)
		{
			System.out.println("Value "+val+" is present at index "+pos);
		}
		else
			
		    System.out.println("Value "+val+" not present in an array");
		
	}

}
