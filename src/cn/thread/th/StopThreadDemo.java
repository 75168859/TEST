package cn.thread.th;



class StopThread implements Runnable{
	private boolean flag = true;
	public void run() {
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "--run-------------");
		}
	}
	
	public void setFlag(){
		this.flag = false;
	}
	
}


public class StopThreadDemo {
	public static void main(String[] args) {
		StopThread st = new StopThread();
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		t2.setDaemon(true);
		t2.start();
		
		int num = 1;
		for (; ; ) {
			if(++num == 50){
				st.setFlag();
//				t1.interrupt();
//				t2.interrupt();
				break;
			}
			System.out.println("main-------" + num);
		}
		
	}
}
