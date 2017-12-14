
public class Fibonacci {
	private int n;
	public Fibonacci(int n) {
		this.n = n;
	}
	
	public int calculate() {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int najstarszy = 0, sredni = 1, nowy = 0;
		for (int i = 2; i <= n; i++) {
			nowy = najstarszy+sredni;
			najstarszy = sredni;
			sredni = nowy;
		}
		return nowy;
	}
}
