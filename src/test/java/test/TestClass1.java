package test;

public class TestClass1 {
	
	
	public static void main(String[] args) {
		int [] arr = {1,2,4,6};
		try {
		System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
		
	}

}
