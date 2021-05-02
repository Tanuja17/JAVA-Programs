package multithreading;

public class RunnableDemo1 {

	public static void main(String[] args) {
		
				Hiprint h1=new Hiprint();
				Thread t1=new Thread(h1);
				t1.start();
				//System.out.println(Thread.currentThread().getId()+ Thread.currentThread().getName());
				HelloPrint h2=new HelloPrint();
				Thread t2=new Thread(h2);
				t2.start();
				//System.out.println(Thread.currentThread().getId()+ Thread.currentThread().getName());
			
				
			}
			

		}
		class Hiprint implements Runnable{
			
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
			
		}

		class HelloPrint implements Runnable
		{
			
			public void run()
			{
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
			}
		}
	


