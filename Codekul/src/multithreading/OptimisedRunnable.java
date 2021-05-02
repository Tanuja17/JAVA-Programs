
/*if suppose I want to print exit after all 2 threads are completed,then we neEd to use join method to stop main method and after completion
 of 2 threds then start it's working*/
package multithreading;

public class OptimisedRunnable {

	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new Runnable(){

			public void run() {
				for(int i=1;i<=5;i++)
				{
					System.out.println("Hi");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		});
		
		Thread t2=new Thread(()->{   //using lambda
			for(int i=1;i<=5;i++)
			{
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		  
		t1.start();
		t2.start();
		
		t1.join();//join throws InterruptedException so we used throws
		t2.join();
		System.out.println("Exit");
      
	}

}
