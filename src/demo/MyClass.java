package demo;

public class MyClass extends AbstractDemo {

	@Override
	public void view() {

		System.out.println("I am a method in interface implmented by Abstract class");
	}

	@Override
	void display() {
		System.out.println("I am a method from Abstractclass extended by current class");
	}

}
