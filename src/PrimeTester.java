
public class PrimeTester {
	// Uses Wilson's theorem
	protected static boolean isPrime(int i) {
		int product = 1;
		for (int j = 1; j < i; j++) {
			product *= j;
		}
		if ((product + 1) % i == 0) {
			return true;
		}
		return false;
	}

}
