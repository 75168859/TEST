package design.methodfactory;

/**
 * 具体工厂
 * @author liuhuan
 *
 */
public class AppleFactory extends FruitFactory{

	@Override
	public Fruit getInstance() {
		return new Apple();
	}

}
