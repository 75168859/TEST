package cn.thread.th3;

class Resource {
	private String name;
	private String sex;
	private boolean flag = false;
	
	public synchronized void set(String name,String sex){
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	
	public synchronized void out(){
		if(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + ":::::" + sex);
		flag = false;
		this.notify();
	}
	
}

class Input implements Runnable {

	Resource r;
	public Input(Resource r){
		this.r = r;
	}
	
	@Override
	public void run() {
		int x = 0;
		while(true){
			if(x == 0){
				r.set("------00000000000-----", "--男--");
			}else{
				r.set("------111111111---", "--nnnnnn--");
			}
			x = (x+1)%2;
		}
		
	}

}

class Output implements Runnable{

	Resource r;
	
	public Output(Resource r){
		this.r = r;
	}
	
	@Override
	public void run() {
		while(true){
			r.out();
		}
			
	}
	
}


public class ResourceDemo3 {
	public static void main(String[] args) {
		Resource r = new Resource();
		
		Input in = new Input(r);
		Output out = new Output(r);
		
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);
		
		t1.start();
		t2.start();

	}
}
