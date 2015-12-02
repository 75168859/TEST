package cn.thread.th;







/*饿汉式*/
class Single{
	private static final Single SINGLE = new Single();
	private Single(){}
	public static Single getInstance(){
		return SINGLE;
	}
	
	
}

/*懒汉式*/
class Single2{
	private static Single2 single = null;
	private Single2(){}
	
	public static Single2 getInstance(){
		if(single == null){
			synchronized(Single2.class){
				if(single == null){
					single = new Single2();
				}
			}
		}
		return single;
	}
	
}


public class Singledemo {
	
	public static void main(String[] args) {
		
	}

}
