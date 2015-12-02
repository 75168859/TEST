package cn.itcast.heima2;

/**
 * 线程同步
 * @author liuhuan
 *
 */
public class TraditionalThreadSynchronized {
	public static void main(String[] args) {
		new TraditionalThreadSynchronized().init();
	}
	
	private void init(){
		final Outputer outputer = new Outputer();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					outputer.output("zhangxiaoxiang");
				}
			}
		}){}.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					outputer.output("lihuoming");
				}
			}
		}){}.start();
	}
	
	class Outputer{//静态方法中不能new内部类的实例对象
		public void output(String name){
			int len = name.length();
			for(int i = 0; i < len; i++){
				System.out.print(name.charAt(i));
			}
			System.out.println();
		}
	}
}
