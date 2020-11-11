package base;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInCollections {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Stella");
		al.add("Zampa");
		al.add("Govindhan");
		al.add("BHarath");
		al.add("Srikanth");

		System.out.println(al);

		Collections.sort(al);

		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);

	}

}
