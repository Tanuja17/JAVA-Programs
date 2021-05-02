package Collections;

import java.util.ArrayList;
import java.util.Iterator;



public class EmpArrayList {

	public static void main(String[] args) {
		Emp e1=new Emp();
		Emp e2=new Emp();
	    e1.setEmpid(10);
	    e1.setName("tanuja");
	    e2.setEmpid(20);
	    e2.setName("Jori");
		ArrayList <Emp> emplist=new ArrayList();
		emplist.add(e1);
		emplist.add(e2);
		Iterator<Emp> itr=emplist.iterator();
		while(itr.hasNext())
		{
			Emp e=(Emp)itr.next();
			System.out.println("empid: "+e.empid);
			System.out.println("emp Name:  "+e.name);
		}
		
		
		
	}

}
