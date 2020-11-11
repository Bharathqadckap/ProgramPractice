package base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stringdiff {
	
	public static void main(String[] args) {
		
		
		String value =  "4¥$SDFyuiwh890";
		char[] charArray = value.toCharArray();
		List<Integer> number = new ArrayList<Integer>();
		List<String> lowercase = new ArrayList<String>();
		List<String> uppercase = new ArrayList<String>();
		
//		int[] numberArray = new int[value.length()];
//		int[] lowercaseArray = new int[value.length()];
//		int[] uppercaseArray = new int[value.length()];
		
		System.out.println("value : "+value);
		for (int i = 0; i < charArray.length; i++) {
			
			if(charArray[i] >= '0' && charArray[i] <= '9') {
				number.add(Integer.parseInt(String.valueOf(charArray[i])));
				//numberArray[i] = charArray[i];
			}
			else if(charArray[i] >= 'a' && charArray[i] <= 'z') {
				lowercase.add(String.valueOf(charArray[i]));
				//lowercaseArray[i] = charArray[i];
			}
			else if(charArray[i] >= 'A' && charArray[i] <= 'Z') {
				uppercase.add(String.valueOf(charArray[i]));
				//uppercaseArray[i] = charArray[i];
			}
		}
		
//		System.out.println("Number");
//		for (int i = 0; i < numberArray.length; i++) {
//			System.out.print((char)numberArray[i]);
//		}
//		System.out.println();
//		System.out.println("Lower");
//		for (int i = 0; i < lowercaseArray.length; i++) {
//			System.out.print((char)lowercaseArray[i]);
//		}
//		System.out.println();
//		System.out.println("Upper");
//		for (int i = 0; i < uppercaseArray.length; i++) {
//			System.out.print((char)uppercaseArray[i]);
//		}
		
//		String value =  "4¥$SDFyuiwh890";
//		char[] charArray = value.toCharArray();
//		List<Integer> number = new ArrayList<Integer>();
//		List<String> lowercase = new ArrayList<String>();
//		List<String> uppercase = new ArrayList<String>();
//		for (int i = 0; i < charArray.length; i++) {
//			if(Character.isDigit(charArray[i])) {
//				number.add(Integer.parseInt(String.valueOf(charArray[i])));
//			}
//			if(Character.isLowerCase(charArray[i])) {
//				lowercase.add(String.valueOf(charArray[i]));
//			}
//			if(Character.isUpperCase(charArray[i])) {
//				uppercase.add(String.valueOf(charArray[i]));
//			}
//		}
//		
		System.out.println(number);
		System.out.println(lowercase);
		System.out.println(uppercase);
	}

}
