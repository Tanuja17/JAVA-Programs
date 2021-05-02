/*daemon thread runs in background & provides service to other threads.
eg. finalize,garbage collector,Spell checker in docs which gives red underline which runs in background.
methods- setDaemon,isDaemon
case-main thread can't be daemon thread as it's startEd by JVM.
     need to set daemon thread before starting thread,otherwise it gives IllegalState exception.
     If main thread doesn't have any work,daemon thread will not work cz it's a helping thread & suppose to help main thread.
     */
 package multithreading;

public class DaemonThread extends Thread{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+"::"+"  Daemon thread running");
		}
		else {
			System.out.println(Thread.currentThread().getName()+"::"+"user thread running");
		}
	}
	

	public static void main(String[] args) {
		DaemonThread d=new DaemonThread();
		DaemonThread d1=new DaemonThread();
		DaemonThread d2=new DaemonThread();
		d.setDaemon(true);
		d.start();
		d1.setDaemon(true);
		d1.start();
		d2.start();
		
		
	}

}
