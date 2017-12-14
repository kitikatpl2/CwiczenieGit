
public class Factorial {
	private int n;
	public Factorial(int n) {
		this.n = n;
	}
	public int calculate() {
		if (n == 0)
			return 1;
		int result = 1;
		for (int i = 1; i <= n; i++)
			result *= i;
		return result;
	}
}
