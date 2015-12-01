package cn.th5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resrouce{
	private String name;
	private int count = 1;
	private boolean flag = false;
	Lock lock = new ReentrantLock();
//	Condition condition = lock.newCondition();
	Condition producer_con = lock.newCondition();
	Condition consumer_con = lock.newCondition();
	
	public void set(String name){
		lock.lock();
		try{
			while(flag){
				try {
//					this.wait();
					producer_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.name = name + count;
			count++;
			System.out.println(Thread.currentThread().getName() + "...procuder..." + this.name);
			flag = true;
//			this.notifyAll();
			consumer_con.signal();
		}finally{
			lock.unlock();
		}
		
		
	}
	
	public  void out(){
		lock.lock();
		try{
			while(!flag){
				try {
//					this.wait();
					consumer_con.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + "...........consumer............" + this.name);
			flag = false;
//			this.notifyAll();
//			condition.signalAll();
			producer_con.signal();
			
		}finally{
			lock.unlock();
		}
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
