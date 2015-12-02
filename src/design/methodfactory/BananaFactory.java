package design.methodfactory;

public class BananaFactory extends FruitFactory {

	@Override
	public Fruit getInstance() {
		return new Banana();
	}

}
