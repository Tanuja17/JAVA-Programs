package Collections;

public class Emp {
  
	String name;
	int empid;

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}


	
	public static void main(String[] args) {
			
			Emp e1=new Emp();
			Emp e2=new Emp();
		    e1.setEmpid(10);
		    e1.setName("tanuja");
		    e2.setEmpid(20);
		    e2.setName("Jori");
	}
		    
/*HASHSET HAS UNIQUE ELEMENTS ONLY BUT IF YOU HAVE OBJ WD SAME VALUES IT CONSIDERS IT DIFF OBJ CZ REFERANCE IS DIFF
	        SO TO AVOID objs wd same values we need to use hashCode()& equals() methd in class to compare objs.*/  

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
		
	}


