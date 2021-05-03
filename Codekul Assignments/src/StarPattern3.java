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
		 
		  for(int k=1;k<=4;k++)
		  {
			  for(int l=1;l<=2*(5 - k) -1;l++)
			  {
				  System.out.print(" *");
			  }
			  System.out.println();
		  }
	}

}
