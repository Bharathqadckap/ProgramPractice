package base;

public class FibonacciNumberDivisibleByThree2 {

	public static void main(String[] args) {
		int from=10;
		int to=100;

		int divisibleByThree=0;

		//0 1 1 2 3 5 8 13 21

		int firstNumber=0;
		int secondNumber=1;

		while(firstNumber <= to) {

			if(firstNumber >= from) {
				if(divisibleByThree == 0  && firstNumber % 3 == 0) {
					divisibleByThree = firstNumber;
				}
			}
			//System.out.print(firstNumber+" ");
			int thirdNumber = firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;

		}
		System.out.println(divisibleByThree);
	}

}
