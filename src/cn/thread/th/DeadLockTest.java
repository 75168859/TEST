package cn.thread.th;



public class DeadLockTest {
	public static void main(String[] args) {
		Test test1 = new Test(true);
		Test test2 = new Test(false);
		
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test2);
		
		t1.start();
		t2.start();
		
		
	}
}



class MyLock{
	public static final Object locka = new Object();
	public static final Object lockb = new Object();
	
}

class Test implements Runnable{

	private boolean flag;
	public Test(boolean flag){
		this.flag = flag;
	}
	
	public void run() {
		if(flag){
			synchronized(MyLock.locka){
				System.out.println("if------locaka------");
				synchronized(MyLock.lockb){
					System.out.println("if------locakb------");
					
				}
			}
		}else{
			synchronized(MyLock.lockb){
				System.out.println("else-----locakb------");
				synchronized(MyLock.locka){
					System.out.println("else-----locaka------");
					
				}
			}
		}
	}
	
}