package cn.th;

public class Ticket implements Runnable{
	private int num = 100;
	Object obj = new Object();
	boolean flag = true;
	
	public void run(){
		if(flag){
			while(true){
				synchronized (obj) {
					show();
				}
			}
		}else{
			while(true){
				show();
			}
		}
	}

	private synchronized void show() {
		synchronized(obj){
			if(num > 0){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "----" + num--);
			}
		}
	}
	
	
	
	
	
}
