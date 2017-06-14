@SuppressWarnings("unused")
public class PrimeTester {

	private int currentPrimeCopy = DialogBox.currentPrime;

	protected static boolean isPrime(int i) {
		for (int j = i - 1; j > 1; j--) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
