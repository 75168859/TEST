package simplefactory;

/**
 * 简单工厂
 * @author liuhuan
 *
 */
public class Test2 {
	public static void main(String[] args) {
		
//		Apple apple = new Apple();//控制不反转
		
		/************简单工厂原型**********************
		*使用者不用自己创建对象直接从工厂获取
		*具体产品的扩展开放了，有新的产品实现Fruit接口即可
		*但是工厂需要修改
		********************************************
		*/
		Fruit fruit = FruitFactory.getInstance("banana");
		fruit.grow();

		
		/***************演变*****
		* 配置文件加反射解耦
		* 
		**************************
		**/
		Fruit fruit2 = FruitFactory.getInstance();
		fruit2.grow();
		
		
	}
}
