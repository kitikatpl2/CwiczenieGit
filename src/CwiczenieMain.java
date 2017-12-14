
public class CwiczenieMain {

	public static void main(String[] args) {
		System.out.println("Hello, world!");
		Factorial fact = new Factorial(6);
		System.out.println(fact.calculate());
		Fibonacci f = new Fibonacci(30);
		System.out.println(f.calculate());
	}

}
