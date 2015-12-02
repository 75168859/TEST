package cn.thread.th4;

class Resrouce{
	private String name;
	private int count = 1;
	private boolean flag = false;
	public synchronized void set(String name){
		while(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name + count;
		count++;
		System.out.println(Thread.currentThread().getName() + "...procuder..." + this.name);
		flag = true;
		this.notifyAll();
	}
	
	public synchronized void out(){
		while(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "...........consumer............" + this.name);
		flag = false;
		this.notifyAll();
	}
	
}

class Producer implements Runnable{

	Resrouce r;
	Producer(Resrouce r){
		this.r = r;
	}
	public void run() {
		while(true){
			r.set("kkkkkkkkkkkk");
		}
	}
}

class Consumer implements Runnable{
	Resrouce r;
	Consumer(Resrouce r){
		this.r = r;
	}
	@Override
	public void run() {
		while(true){
			r.out();
		}
	}
	
}

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		Resrouce r = new Resrouce();
		Producer producer = new Producer(r);
		Consumer consumer = new Consumer(r);
		
		Thread t0 = new Thread(producer);
		Thread t1 = new Thread(producer);
		Thread t2 = new Thread(consumer);
		Thread t3 = new Thread(consumer);
		t0.start();
		t1.start();
		t2.start();
		t3.start();
	}
	
	
	
}
