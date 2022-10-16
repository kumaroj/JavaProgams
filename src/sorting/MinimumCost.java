package sorting;

import java.util.Arrays;

public class MinimumCost {

	public static void main(String[] args) {
		int []A = {3, 0, 9, 7, 8};
		String s1 = "acdddd";
		
		 Arrays.sort(A);
	        int i = 0;
	        int j = A.length-1;
	        int cos = 0;
	        while(i<=j){
	            int temp = A[i];
	            A[i] = A[j];
	            A[j] = temp;
	            i++;
	            j--;
	        }
	        
	        for(int k = 0 ;k<A.length-1; k++){
	            cos+=(A[k]*(k+1));
	        }
		
	        System.out.println(cos);
	}

}
