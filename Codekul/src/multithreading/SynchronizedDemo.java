package multithreading;

public class SynchronizedDemo{
    int num=0;
	public static void main(String[] args) throws InterruptedException {
		SynchronizedDemo ob1=new SynchronizedDemo();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					ob1.count();
				}
			}
			});		
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=1000;i++)
				{
					ob1.count();
				}
			}
			});	
		
		    t1.start();
		    t2.start();
		    
		    t1.join();
		    t2.join();
		    
		    System.out.println(ob1.num);
		    
	}
		
			synchronized void count()
			{
				num++;
				
		    } 
		   
			
		
	}


