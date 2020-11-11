package base;

public class NewFibonaccitry1 {

	public static void main(String[] args) {
		int from = 20;
		int to = 100;

		int firstNumber = 0;
		int secondNumber = 1;

		while(firstNumber <= to){
			if(firstNumber >= from){
				System.out.println(firstNumber);
			}
			int thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}

}
