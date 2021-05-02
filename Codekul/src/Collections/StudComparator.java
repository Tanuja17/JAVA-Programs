//Comparator has compare method.Using comparator we can compare on many fields.

package Collections;
import java.util.*;


public class StudComparator implements Comparator<StudComparator> {
    int id;
    String name;
    
   public StudComparator(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		StudComparator s1=new StudComparator(1,"tanuja");
		StudComparator s2=new StudComparator(25,"Sanika");
		StudComparator s3=new StudComparator(3,"Anuja");
		   
		
		List<StudComparator>studlist=new ArrayList();
		studlist.add(s1);
		studlist.add(s2);
		studlist.add(s3);
		
	
		
		   Comparator<StudComparator> idcomparator= new Comparator<StudComparator>() {
			   @Override
	       public int compare(StudComparator s1, StudComparator s2) {
				   if(s1.id ==s2.id){
				         return 0;      
				         }else if(s1.id>s2.id ){
				  
				        	 return 1;
				      }else {
				           return -1;
				      }
			   }};
			   
			   Comparator<StudComparator> namecomparator= new Comparator<StudComparator>() {
				   public int compare(StudComparator s1, StudComparator s2) {
					   return s1.name.compareTo(s2.name);
				   }
			   };

				Collections.sort(studlist,idcomparator);
				studlist.forEach(s->
				{
					System.out.println("Id::"+s.id+" Name::"+s.name);
				});
	
	}

	@Override
	public int compare(StudComparator o1, StudComparator o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	}






	


