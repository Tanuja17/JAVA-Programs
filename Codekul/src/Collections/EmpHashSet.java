package Collections;

import java.util.HashSet;
import java.util.*;

public class EmpHashSet {

	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp();
	    e1.setEmpid(10);
	    e1.setName("tanuja");
	    e2.setEmpid(10);
	    e2.setName("tanuja");
	    HashSet<Emp>hs=new HashSet();
	    hs.add(e1);
	    hs.add(e2);
		
		Iterator<Emp>itr=hs.iterator();
		while(itr.hasNext())
		{
			Emp e=(Emp)itr.next();
			System.out.println(e.name);
			System.out.println(e.empid);
		}
	    

	}

}
