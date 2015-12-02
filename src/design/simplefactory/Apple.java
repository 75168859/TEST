package design.simplefactory;

/**
 * 具体产品
 * @author liuhuan
 *
 */
public class Apple extends Fruit {

	@Override
	public void grow() {
		System.out.println("apple....grow...");
	}

	@Override
	public void plaint() {
		System.out.println("apple.....plaint........");
	}

}
