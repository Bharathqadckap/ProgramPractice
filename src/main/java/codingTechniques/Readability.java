package codingTechniques;

public class Readability {
	
	static int age=16;
	
	public static void main(String[] args) {
		method1();
	}
	
	
	public static void method1() {
		if(age>15)
			System.out.println("Matured");
		else 
		{
			if(age<15)
				System.out.println("Immatured");
			else
				System.out.println("overMatured");
			
			//added a comment
		}
	}

}
