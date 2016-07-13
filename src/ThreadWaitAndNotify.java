
class ProducerConsumerBehaviour {
	int n;
	boolean isPut = false;
	
	synchronized public int get() {
		if(!isPut) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got "+n);
		isPut = false;
		notifyAll();
		return n;
	}
	
	synchronized public void put(int n) {
		if(isPut) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		isPut = true;
		System.out.println("Put "+n);
			notify();
	}
}

class Producer implements Runnable {
	ProducerConsumerBehaviour p;
	
	public Producer(ProducerConsumerBehaviour p) {
		this.p = p;
		new Thread(this, "Producer").start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(i<20) {
			p.put(i++);
		}
	}
}

class Consumer implements Runnable {
	ProducerConsumerBehaviour p;

	public Consumer(ProducerConsumerBehaviour p) {
		this.p = p;
		new Thread(this, "Consumer").start();
	}

	@Override
	public void run() {
		while(true) {
			p.get();
		}
		
	}
	
	
}

public class ThreadWaitAndNotify {
	public static void main(String[] args) {
		ProducerConsumerBehaviour p = new ProducerConsumerBehaviour();
		new Producer(p);
		new Consumer(p);
		new Consumer(p);
	}
}
