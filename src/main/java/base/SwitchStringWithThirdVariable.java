package base;

public class SwitchStringWithThirdVariable {
	
	public static void main(String[] args) {
		String a = "Selenium";
		String b = "java";
		String c ="";
		
		c = a;
		//a-selenium,b-java,c-selenium
		a = b;
		//a-java,b-java,c-selenium
		b=c;
		//a-java,b-selenium,c-selenium
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
