package multithreading;

public class DeadLockDemo extends Thread {

	public static void main(String[] args) {
		
		 String r1="Printer";
		 String r2="Scanner";
		 Thread t1=new Thread(()->{
			 synchronized(r1)
			 {
				 System.out.println(Thread.currentThread().getName()+ " locked "+r1);
				/* try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				 synchronized(r2)
				 {

					 System.out.println(Thread.currentThread().getName()+ " locked "+r2);
					 
				 }
			 }
			 
		 });
		 
		Thread t2=new Thread(()->{
			  synchronized(r2)
			  {

					 System.out.println(Thread.currentThread().getName()+ " locked "+r2);
					 synchronized(r1)
					 {

						 System.out.println(Thread.currentThread().getName()+ " locked "+r1);
						 
					 }
					 
			  }
			
			
		});
		
		t1.setName("Computer");
		t2.setName("Laptop");
		t1.start();
		t2.start();
		
		
		
				

	}

}
