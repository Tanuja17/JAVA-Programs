//whwn we run the prog,sometimes consumer consumes val.before producing it.So we use wait(),notify().


package multithreading;

 class ProducerConsumerDemo {
	int n;
	boolean flag=false;
	synchronized void set(int n)
	{
		if(flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("set: "+n);
		this.n=n;
		flag=true;
		notify();
	}
	synchronized void get()
	{
		if(!flag)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("get: "+n);
	    flag=false;
	    notify();
	}

}
class Producer implements Runnable
{
	  ProducerConsumerDemo prodcon;
	  Producer(ProducerConsumerDemo ob)
	  {
		  prodcon=ob;
		  Thread t=new Thread(this);
		  t.start();
	  }
	@Override
	public void run() {
	    int i=0;
		while(true)
	    {
			prodcon.set(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		
	}
	  
}

class Consumer implements Runnable
{
	ProducerConsumerDemo prodcon;
	  Consumer(ProducerConsumerDemo ob)
	  {
		  prodcon=ob;
		  Thread t=new Thread(this);
		  t.start();
	  }
	@Override
	public void run() {
		int i=0;
		while(true)
	    {
			prodcon.get();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	    }
		
	}
}


