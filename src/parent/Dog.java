package parent;

public class Dog extends Animal{

	@Override
	public void cry() {
		System.out.println("dog.........cry........");
	}

	@Override
	public void eat() {
		System.out.println("dog.........eat............");
	}
	
	@Override
	public void a(String a) {
		System.out.println("...dog ...a ...=====" + a);
	}
	
}




