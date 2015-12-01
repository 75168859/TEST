package cn.th2;

class Resource {
	 String name;
	 String sex;
	 boolean flag = false;
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
			synchronized(r){
				if(r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x == 0){
					r.name = "------00000000000----------";
					r.sex = "------男------------";
				}else{
					r.name = "---111111111-------";
					r.sex = "----nnnnnnnnnnnnnnnn--------";
				}
				r.flag = true;
				r.notify();
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
			synchronized(r){
				if(!r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}else{
					System.out.println(r.name + "::::"  + r.sex);
					r.flag = false;
					r.notify();
				}
			}
		}
	}
	
}


public class ResourceDemo2 {
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
