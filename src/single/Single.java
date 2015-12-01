package single;

/**
 * 单例模式
 * @author liuhuan
 *
 */
public class Single {
	
	private static Single single = null;
	private Single(){
		
	}
	
	public static synchronized Single getInstance(){
		if(single == null){
			single = new Single();
		}
		return single;
	}
	
}

class Single2{
	private static Single2 single2 = new Single2();
	private Single2(){}
	
	public static Single2 getInstance(){
		return single2;
	}
}

enum single3{
	e;
}






