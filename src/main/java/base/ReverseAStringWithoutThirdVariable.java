package base;

public class ReverseAStringWithoutThirdVariable {
	
	public static void main(String[] args) {
		String a = "Selenium";
		String b = "Java";
		
		a = a+b;
		//a-SeleniumJava,b-Java
		//System.err.println(a.length());
		
		b=a.substring(0, (a.length()-b.length()));
		a = a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
