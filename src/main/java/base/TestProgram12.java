package base;

import java.util.ArrayList;
import java.util.List;

public class TestProgram12 {

	static int num=3;
	public static void main(String[] args) {

		for (int i = 2; i < num-1; i++) {

			if(num%i==0) {
				System.out.println("");
				List<Integer> list = new ArrayList<Integer>();
				int firstnumber=0;
				int secondnumber=1;
				for(int j=0;j<num;j++) {

					int thirdnumber=firstnumber+secondnumber;
					list.add(thirdnumber);
					System.out.println(thirdnumber);
					firstnumber=secondnumber;
					secondnumber=thirdnumber;
				}
				System.out.println(list);
				if(list.contains(num)) {
		
				}

			}

		}

		



	}


}
