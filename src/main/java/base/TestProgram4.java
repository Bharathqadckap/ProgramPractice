package base;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestProgram4 {

	
	public static void main(String[] args) {
		List <String> ls = new ArrayList<String>();
		ls.add("USA");
		ls.add("India");
		System.out.println(ls.get(0));
		
		Set <String> st = new HashSet<String>();
		st.add("USA");
		st.add("India");
		st.add("China");
		
		System.out.println(st);
		
		
	}
	
}
