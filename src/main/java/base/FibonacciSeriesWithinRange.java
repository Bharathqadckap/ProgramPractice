package base;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeriesWithinRange {

	// 0 1 1 2 3 5 8 13 21
	
	public static void main(String[] args) {
		int from=20;
		int to = 1000;
		int divisibleByThree=to;
		int firstNumber=0;
		int secondNumber=1;
		
		List<Integer> list = new ArrayList<Integer>();
		
		while(firstNumber <= to) {
			
			if(firstNumber >= from) {
				list.add(firstNumber);
				if(divisibleByThree <= to && firstNumber % 3 == 0) {
					divisibleByThree = firstNumber;
				}
			}
			
			
			int thirdNumber = firstNumber +  secondNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			
		}
	
		System.out.println(list);
		System.out.println(divisibleByThree);
	}
	
}
