//Collections.sort sorts only primityive data types so to sort user defined objs we need to use comparator or comparable interface.
//with Comparable,we can use only 1 field for comparison(eg id or name).Comparator n comparable are functional interfaces.
//Comparable has only one compare abstract method.
//for string comparison we use compareTo method of string class.
package Collections;

import java.util.*;

public class StudComparable implements Comparable<StudComparable>{

	  int id;
	  String name;
	   
	  public StudComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	  
	  public int compareTo(StudComparable s) {
			 if(this.id ==s.id){
	         return 0;      
	         }else if(this.id>s.id ){
	  
	        	 return 1;
	      }else {
	           return -1;
	       }
			 }
	  /*public int compareTo(StudComparable s) {
	      return this.name.compareTo(studComparable.name);
	   */
	public static void main(String[] args) {
		 StudComparable s1=new StudComparable(1,"tanuja");
		 StudComparable s2=new StudComparable(25,"Sanika");
		 StudComparable s3=new StudComparable(3,"Anuja");
		   
		
		List<StudComparable>studlist=new ArrayList();
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
		
		Collections.sort(studlist);
		
		studlist.forEach(s->
		{
			System.out.println("Id::"+s.id+" Name::"+s.name);
		});
	}		
	
	

  }
	
	
