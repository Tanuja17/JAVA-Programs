package multithreading;

public class PCMain {
	
		public static void main(String[] args) {
			
			ProducerConsumerDemo prodcon=new ProducerConsumerDemo();
			Producer prod=new Producer(prodcon);
			Consumer cons=new Consumer(prodcon);
		}
	}

