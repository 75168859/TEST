package design.simplefactory;

import java.io.IOException;
import java.util.Properties;


public class FruitFactory {
	
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(FruitFactory.class.getResourceAsStream("/simplefactory/fruit.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 简单工厂原型
	 * 没有反射功能的语言做到这一步即可
	 * @param name
	 * @return
	 */
	public static Fruit getInstance(String name){
		if("apple".equals(name)){
			return new Apple();
		}else if("banana".equals(name)){
			return new Banana();
		}else{
			throw new RuntimeException("不存在");
		}
	}
	
	
	/**
	 * 动态加载类并做强制类型转换
	 * 配置文件+反射解耦，去除对工厂的依赖
	 * @return
	 */
	public static Fruit getInstance(){
		try {
			return (Fruit)Class.forName(prop.getProperty("fruit")).newInstance();
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
