
package base;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTry1 {
	
	public static void main(String[] args) {
		
			HashMap<String,String> statecapital = new HashMap<String, String>();
			statecapital.put("TN", "Bangalore");
			statecapital.putIfAbsent("TN", "Chennai");
			statecapital.put("MH", "Mumbai");
			Set<String> keySet = statecapital.keySet();
			//System.out.println(keySet);
			for (String state : keySet) {
				System.out.println(state);
			}
			
			System.out.println(statecapital.containsKey("TND"));
			System.out.println(statecapital.containsValue("mumbai"));
			
			//System.out.println(statecapital.get("TN"));
			
			
			//System.out.println(statecapital.getOrDefault("India", "New Delhi"));
			
			//getTheCountOfLettersInString("TTTHHHYYY");
			
			
	}
	
	
	public static void getTheCountOfLettersInString(String value) {
		
		HashMap<Character,Integer> mapping = new HashMap<Character,Integer>();
		
		
		for(char c : value.toCharArray()) {
			Character ch = new Character(c);
			mapping.put(ch, mapping.getOrDefault(ch, 0)+1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : mapping.entrySet()) {
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		
		
	}

}
