package cn.th;


class Demo implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread() + "----" + i );
			Thread.yield();
		}
	}
	
}



public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
//		t1.join();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		
		for (int i = 0; i < 50 ; i++) {
			System.out.println(Thread.currentThread() + "----" + i );
		}
	}
}
