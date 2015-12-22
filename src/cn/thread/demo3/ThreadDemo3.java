package cn.thread.demo3;


public class ThreadDemo3 {
	
	public static void main(String[] args) {
		Ticket ticket = new Ticket();
		Thread t1 = new Thread(ticket,"窗口1");
		Thread t2 = new Thread(ticket,"窗口2");
		Thread t3 = new Thread(ticket,"窗口3");
		Thread t4 = new Thread(ticket,"窗口4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}


class Ticket implements Runnable{
	private int ticket = 100;
	
	@Override
	public void run() {
		while(true){
			synchronized (new Object()) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(ticket < 0){
					break;
				}
				System.out.println( Thread.currentThread().getName() + "---卖出--" + ticket--);
				
			}
		}
	}
}