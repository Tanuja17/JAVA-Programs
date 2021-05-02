package Collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,String>map1=new HashMap();
		map1.put(1, "Tanuja");
		map1.put(2, "Shailesh");
		map1.put(3, "Shravan");
	
		Map<Integer,String>map2=new HashMap<Integer,String>();
		map2.put(10, "Tanuja");
		map2.put(20, "Shailesh");
		map2.put(30, "shravan");
		
		
		
		
		List<Map<Integer,String>> al=new ArrayList();
		al.add(map1);
		al.add(map2);
		
		al.forEach(s-> {
			s.forEach((k,v)-> {
			System.out.println("Key="+k+" value="+v);	
			});
		});
		
		
		
		System.out.println("map traversing::");
		 map1.forEach((k,v)-> {
			System.out.println("Key="+k+" value="+v);
		});
	}

}
