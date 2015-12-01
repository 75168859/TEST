package cn.th;

public class Input implements Runnable {

	Resource r;
	public Input(Resource r){
		this.r = r;
	}
	
	@Override
	public void run() {
		int x = 0;
		while(true){
			synchronized(r){
				if(x == 0){
					r.setName("------00000000000----------");
					r.setSex("------男------------");
				}else{
					r.setName("---111111111-------");
					r.setSex("----nnnnnnnnnnnnnnnn--------");
				}
			}
			x = (x+1)%2;
		}
		
	}

}
