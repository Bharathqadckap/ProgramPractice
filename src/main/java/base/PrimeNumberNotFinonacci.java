package base;

public class PrimeNumberNotFinonacci {

	public static void main(String[] args) {
		int num = 21;

		boolean isPrime = primeNumber(num);
		boolean isInFibonacci = finonacci(num);

		if (isPrime == true && isInFibonacci == false) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

	private static boolean primeNumber(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
			else
				return true;
		}
		return false;
	}

	private static boolean finonacci(int num) {
		int firstnumber = 0;
		int secondnumber = 1;

		while (firstnumber <= num) {
			if (firstnumber == num)
				return true;
			int thirdnumber = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = thirdnumber;
		}
		return false;
	}
}
