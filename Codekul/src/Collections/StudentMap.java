package Collections;

import java.util.*;

public class StudentMap {
	
	   int id;
	   String name;
	   
	  public StudentMap(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	  

	public static void main(String[] args) {
	   StudentMap s1=new StudentMap(1,"tanuja");
	   StudentMap s2=new StudentMap(2,"Sanika");
	   StudentMap s3=new StudentMap(3,"Anuja");
	   
	   	Map<Integer,StudentMap>studmap=new HashMap<Integer,StudentMap>();
	   	studmap.put(1, s1);
	   	studmap.put(2, s2);
	   	studmap.put(3, s3);
	   	
	   	studmap.forEach((k,v)->
	   	{
	   		StudentMap val=(StudentMap)v;
	   		System.out.println("key::"+ k+"  Student id: "+val.id+"  Student name: "+val.name);
	   	});
	   	//2nd way to traverse map
	   	
	   	Set set=studmap.entrySet();
	   	Iterator itr=set.iterator();
	   	while(itr.hasNext())
	   	{
	   		Map.Entry entry=(Map.Entry)itr.next();
	   		StudentMap value=(StudentMap)entry.getValue();
	   		System.out.println("key::"+entry.getKey()+"  Student id: "+value.id+"  Name: "+value.name);
	   	}
	   	
	}

}
