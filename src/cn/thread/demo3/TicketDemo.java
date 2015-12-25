package cn.thread.demo3;





public class TicketDemo {

	public static void main(String[] args) {
		Ticket2 ticket2 = new Ticket2();
		Thread t1 = new Thread(ticket2);
		Thread t2 = new Thread(ticket2);
		Thread t3 = new Thread(ticket2);
		t1.start();
		t2.start();
		t3.start();
	}
	
}


class Ticket2 implements Runnable{

	private int num = 100;
	public void run() {
		while(true){
			
			if(num > 0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-----" + num--);
			}
			
		}
	}
	
}