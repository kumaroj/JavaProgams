package searching;

public class KRotation {

	public static void main(String[] args) {
		
		int A [] = {11,14,19,23,27,-20,-14,-8,-4,1,2,4,7};
		int rotation = 0;
		
		for(int i = 0 ; i<A.length-1; i++){
			if(A[i+1]<A[i]){
				rotation = i;
				break;
			}
		}
		
		System.out.println(rotation);
	}

}
