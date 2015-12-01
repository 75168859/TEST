package parent;

import java.lang.reflect.Method;
import java.util.Calendar;

public class Test2 {
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();
		animal.cry();
		animal.a("sssss");
		
		Calendar.getInstance();
		
		
		try {
			Animal dog = (Dog)Class.forName("parent.Dog").newInstance();
			
			Class clazz = dog.getClass();
			Method m = clazz.getMethod("a", String.class);
			m.invoke(dog, "1111111111");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}	
