package Collections;
import java.util.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer>list1=new ArrayList();
		ArrayList<Integer>list2=new ArrayList();
		list1.add(10);
		list1.add(null);
		list1.add(30);
		list1.add(40);
		list2.add(50);
		list2.add(60);
		int count=2;
		
		list1.addAll(list2);
		System.out.println(list1.size());
		
		/*List <Integer>unmodifiable=Collections.unmodifiableList(list1);
		unmodifiable.add(45);*/
		
	/*	for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		//2nd way to iterate through list
		Iterator it=list1.iterator();
		while(it.hasNext())
			System.out.println(it.next());*/
		
		//3rd way
	//	list1.forEach(s->{System.out.println(s);});
		//4th way listIterator moves in forward n backward direction
		 ListIterator listitr=list1.listIterator();  
		 
		 while(listitr.hasNext()){    
             
		        System.out.println("index:"+listitr.nextIndex()+" value:"+listitr.next());    
		        }  
		 System.out.println("reverse direction");
         while(listitr.hasPrevious())  
         {  
         
             System.out.println(listitr.previous());  
             
         }
	}

}
