package base;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumberMaximumOdd {
	
	public static void main(String[] args) {
		
		int from = 10;
		int to = 2000;
		int maxOdd = 0;
		
		int firstnumber=0;
		int secondnumber=1;
		
		List<Integer> list =  new ArrayList<Integer>();
		
		while(firstnumber <= to) {
			
			if(firstnumber >= from) {
				list.add(firstnumber);
				if(firstnumber % 2 != 0) {
					maxOdd = firstnumber;
				}
			}
			
			int thirdnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=thirdnumber;
		}
		
		System.out.println("Series : "+list);
		System.out.println("maxOdd : "+maxOdd);
		
	}
		
}
