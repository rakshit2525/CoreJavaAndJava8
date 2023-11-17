package java8Topics.staticAndDefault.basicExample;

public class B implements A{

	public static void main(String[] args) {
		B b = new B();
		b.method1();
	}

	@Override
	public void method1() {
		System.out.println("This is method interface");
	}

}
