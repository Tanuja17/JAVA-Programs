package multithreading;

public class MultiThreadingDemo1 {
  public static void main(String[] args) {
	  Hiprint hi1=new Hiprint();
	 // hi1.setPriority(1);
	  hi1.start();
	
	 
	  HelloPrint hello1=new HelloPrint();
	 /* hello1.setPriority(10); or
	   hello1.setPriority(Thread.MAX_PRIORITY);*/
	  hello1.start();
  }
}

class Hiprint extends Thread{
	
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

class HelloPrint extends Thread
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