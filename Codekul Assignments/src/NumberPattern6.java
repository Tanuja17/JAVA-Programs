/*Write a program to print
following Pattern
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15  */

public class NumberPattern6 {

	public static void main(String[] args) {
		  int val=1;
		  for(int i=1;i<=5;i++)
	      {
	    	  for(int j=1;j<=i;j++)
	    	  {
	    		  System.out.print(" "+val);
	    		  val++;
	    	  }
	    	  System.out.println();
	      }

	}

}
