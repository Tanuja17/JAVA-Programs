package Collections;

public class GenericsClass<T> {

	  T t;
	  void setVal(T t) {
		  this.t=t;
	  }
	 T getVal()
	  {
		  return t;
	  }
	
	
	public static void main(String[] args) {
	  GenericsClass<Integer> ob1=new GenericsClass();
	  ob1.setVal(56);
	  System.out.println(ob1.getVal());
	  
	  GenericsClass<String> ob2=new GenericsClass();
	  ob2.setVal("Tan");
	  System.out.println(ob2.getVal());
		

	}

}
