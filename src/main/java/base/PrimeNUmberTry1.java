package base;

public class PrimeNUmberTry1 {
	
	public static void main(String[] args) {
		int num = 27;
		String primeNumber = "Yes, It is a prime Number";
		
		for (int i = 2; i < num/2; i++) {
			if(num%i==0) {
				primeNumber = "No, It is not a prime number";
			}
		}
		System.out.println(primeNumber);
	}
	

}
