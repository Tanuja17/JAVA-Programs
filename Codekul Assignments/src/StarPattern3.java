/*Write a program to generate following pattern.
*
***
*****
*******
*********
*******
*****
***      
*             */


public class StarPattern3 {

	public static void main(String[] args) {
		  for(int i=1;i<=5;i++)
	      {
	    	  for(int j=1;j<=(i*2)-1;j++)
	    	  {
	    		  System.out.print(" *");
	    	  }
	    	  System.out.println();
	      }
		 
	}

}
