package Collections;
import java.util.*; 
public class TreeSetDemo {
	 
	 public static void main(String args[]){  
	 TreeSet<String> set=new TreeSet<String>();  
	         set.add("Ravi");  
	         set.add("Vijay");  
	         set.add("Ajay");  
	         set.add("null");
	         System.out.println("Traversing element through Iterator in descending order");  
	         Iterator i=set.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	           
	 }  
	}  

