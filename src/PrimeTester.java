
public class PrimeTester {

	protected boolean isPrime(int i) {
		for(int j = i - 1; j > 1; j--) {
			if((i / j) % 1 == 0) {
				return false;
			}
		}
		return true;
	}

}
