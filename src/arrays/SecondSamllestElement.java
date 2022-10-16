package arrays;

public class SecondSamllestElement {

	public static void main(String[] args) {
		
		
		int [] A = { 15, 19, 46, 56, 14, 67, 19, 53, 86, 59};
		
		int secondmin = Integer.MAX_VALUE;
		int minelement = Integer.MAX_VALUE;
		
		for(int i = 0; i<A.length;i++){
			if(A[i]<minelement){
				secondmin =minelement;
				minelement = A[i];
			}
			else if(A[i]<secondmin){
				secondmin = A[i];
			}
		}
		
		System.out.println(minelement);
		System.out.println(secondmin);
	}

}
