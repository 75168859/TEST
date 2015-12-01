package methodfactory;

/**
 * 工厂方法
 * 一个抽象产品---》一个抽象工厂
 * 一个具体产品---》一个具体工厂
 * 
 * C++建议使用工厂方法
 * 
 *由子类（工厂子类）决定创建的对象是哪一个
 * @author liuhuan
 *
 */

public class Test2 {
	public static void main(String[] args) {
		
		//使用者会对具体的工厂产生依赖
		FruitFactory appleFactory = new AppleFactory();
		Fruit fruit = appleFactory.getInstance();
		fruit.grow();
		
		
		FruitFactory bana = new BananaFactory();
		Fruit b = bana.getInstance();
		b.grow();
		
		
	}
}
