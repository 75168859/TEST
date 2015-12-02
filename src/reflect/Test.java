package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception {
		Person person = new Person();

		Method[] methods = person.getClass().getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			StringBuffer sb = new StringBuffer();
			Method m = methods[i];
			sb.append(m.isAccessible() + "--");
			sb.append(m.getName()+"(");
			Class[] clazz = m.getParameterTypes();
			for (int j = 0; j < clazz.length; j++) {
				String cname = clazz[j].getName();
				sb.append(cname.substring(cname.lastIndexOf(".") + 1 ) );
				sb.append(j != clazz.length-1 ? "," : "");
			}
			sb.append(")\n");
			System.out.print(sb.toString());
		}
		
		
		
		Class c1 = Person.class;
		Class c2 = person.getClass();
		Class c3 = Class.forName("ref.Person");
		
		System.out.println(c1==c2);
		System.out.println(c2==c3);
		
		
		
		
		
	}
}

class Person {
	private String name;
	private int age;
	public String pub;
	
	
	public void work(){
		System.out.println("...work....");
	}
	
	private void speak(String str,int a){
		System.out.println("str...==" + str);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}
	
}