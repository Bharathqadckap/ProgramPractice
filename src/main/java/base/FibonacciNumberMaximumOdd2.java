package base;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumberMaximumOdd2 {
	
	public static void main(String[] args) {
		int from=10;
		int to=300;
		
		int maxOddNumber=0;
		
		int firstNumber=0;
		int secondNumber=1;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(firstNumber <= to) {
			if(firstNumber >= from) {
			list.add(firstNumber);
			if(firstNumber % 2 !=0) {
				maxOddNumber = firstNumber;
			}
			}
			
			int thirdNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	System.out.println(list);
	System.out.println(maxOddNumber);
	
	}

}
