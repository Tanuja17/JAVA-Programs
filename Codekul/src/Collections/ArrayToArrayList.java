package Collections;

import java.util.*;

public class ArrayToArrayList {

	public static void main(String[] args) {
		List<Integer>al=new ArrayList();
		int count=1;
		al.add(1);
		al.add(2);
		al.add(3);
	    for(int i=0;i<al.size();i++)
	    {
	    	System.out.println(al.get(i));
	    }
	    
	   Integer [] arr=al.toArray(new Integer[al.size()]);
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    	count=count+arr[i];
	    	System.out.println(count);
	    }
	    
	    boolean ans=al.contains(39);
	    System.out.println(ans);
	  /*  List<String> al2=new ArrayList();
	    al2=Arrays.asList(arr);
		Iterator itr=al2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		

	}

}
