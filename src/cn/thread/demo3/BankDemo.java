package cn.thread.demo3;

public class BankDemo {
	public static void main(String[] args) {
		Cus cus = new Cus();
		Thread t1 = new Thread(cus);
		Thread t2 = new Thread(cus);
		
		t1.start();
		t2.start();
	}
}


class Cus implements Runnable{

	Bank b = new Bank();
	@Override
	public void run() {
		for(int x=0; x < 3; x++){
			b.add(100);
		}
	}
	
}


class Bank{
	
	private int sum;
	private Object obj = new Object();
	public synchronized void add(int num){//同步函数
//		synchronized (obj) {//同步代码块
			sum = sum + num;
			System.out.println("sum=" + sum);
//		}
	}
	
}