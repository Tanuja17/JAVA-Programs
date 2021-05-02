package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arr1 {

	public static void main(String[] args) {
		List<Integer>list1=new ArrayList();
		List<String>list2=new ArrayList();
		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list2.add("a");
		list2.add("b");
		list2.add("b");
		list2.add("b");
		list2.add("b");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
			System.out.println(list2.get(i));
		}


	}

}
