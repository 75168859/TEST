package design.pototype;

/**
 * 原型模式
	克隆（拷贝）
           浅拷贝、深拷贝
 	浅拷贝一般情况下语言都会默认支持， 内部变量引用的堆内存地址不变
	深拷贝一般通过序列化来实现
	
 *
 */

public class Test3 {
	
	public static void main(String[] args) {
		User u = new User();
		Address address = new Address();
		u.setAddress(address);
		
		User u1 = null;
		
		try {
//			u1 = (User)u.clone();
			u1 = (User)u.deepclone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(u == u1);
		System.out.println(u.getAddress() == u1.getAddress());
		
		
		
	}
	
}
