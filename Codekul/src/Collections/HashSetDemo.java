package Collections;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
	
		List<Integer>al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(1);
		al.add(10);
		
		HashSet<Integer>hs=new HashSet();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		HashSet<Integer>hs1=new HashSet(al);
		
		
		Iterator<Integer>itr=hs1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
