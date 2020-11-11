package base;

public class RemoveJunkFromString {
	
	
	public static void main(String[] args) {
		String data = "&^*^^*^&*^&*&* latin 789732473423";
		data = data.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(data);
	}

}
