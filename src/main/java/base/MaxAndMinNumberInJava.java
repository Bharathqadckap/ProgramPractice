package base;

public class MaxAndMinNumberInJava {
	
	public static void main(String[] args) {
		//smalleer and larger number in an array


		  int maxnumber=0;
		  int minnumber=0;
		int array[]={10,5,18,7,8};
		  for(int i=0;i<array.length;i++){
		  	//System.out.println(array[i]);
			 if( array[i]>maxnumber) {
				maxnumber=array[i];
			 }
			  
		  }
		  
		  minnumber=maxnumber;
		  
		  for(int i=0;i<array.length;i++){
			  	//System.out.println(array[i]);
				 if(array[i]<minnumber) {
					minnumber=array[i];
				 }
				  
			  
		  }
	
		  System.out.println(maxnumber);
		  System.out.println(minnumber);
	}
}
	
