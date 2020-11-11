package base;

import java.util.ArrayList;
import java.util.List;

// fib last first num divisible by 3 
public class FibonacciNumberDivisibleByThree {
	
	public static void main(String[] args) {
		
		int from = 10;
		int to = 100;
		int divisibleByThree = 0;
		
		int firstnumber=0;
		int secondnumber=1;
		
		List<Integer> list =  new ArrayList<Integer>();
		
		while(firstnumber <= to) {
			
			if(firstnumber >= from) {
				list.add(firstnumber);
				if(divisibleByThree == 0 && firstnumber % 3 == 0) {
					divisibleByThree = firstnumber;
				}
			}
			
			int thirdnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
		}
		
		System.out.println("Series : "+list);
		System.out.println("fivisibleByThree : "+divisibleByThree);
		
	}
		
}
