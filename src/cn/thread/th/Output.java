package cn.thread.th;

public class Output implements Runnable{

	Resource r;
	
	public Output(Resource r){
		this.r = r;
	}
	
	@Override
	public void run() {
		while(true){
			synchronized(r){
				System.out.println(r.getName() + "::::"  + r.getSex());
			}
		}
	}
	
}
