package single;

import java.lang.reflect.Constructor;

/**
 * 
 * 单例模式绕不开反射
 * 
 */
public class Test2 {
	
	public static void main(String[] args) throws Exception {
		MyWeekDay.MON.nextDay();
		X.a.aaat();
		
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1 == s2);
		
		Class c = Single.class;
		Constructor<Single> s = c.getDeclaredConstructor();
		s.setAccessible(true);
		Single s3 = s.newInstance();
		System.out.println(s3 == s2);
		
		
	}
}
