package base;

public class PaindromeWithOneString {
	
	public static void main(String[] args) {
		String s = "RACECAR";
		int length =s.length();
		System.out.println(length);
		boolean result = true;
		for(int i=0;i<=length/2;i++) {
			if(s.charAt(i) != s.charAt(length-1-i)) {
				result = false;
			}
		}
		if(result) {
			System.out.println("Palidrome");
		}
		else {
			
			System.out.println("Not a palindrome");
		}
	}

}
