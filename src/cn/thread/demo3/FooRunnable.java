package cn.thread.demo3;

public class FooRunnable implements Runnable{

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 3; i++) {
				 this.fix(30); 
		            try { 
		                Thread.sleep(1); 
		            } catch (InterruptedException e) { 
		                e.printStackTrace(); 
		            } 
		            System.out.println(Thread.currentThread().getName() + ": 当前foo对象的x值= " + foo.getNum()); 
			}
		}
		
	}
	
	public  int fix(int x){
			return foo.fix(x);
	}

	
	private Foo foo = new Foo();
	public static void main(String[] args) {
		FooRunnable fooRunnable = new FooRunnable();
		Thread t1 = new Thread(fooRunnable, "TTTT11111111");
		Thread t2 = new Thread(fooRunnable, "TTT22222222");
		t1.start();
		t2.start();
	}
}
