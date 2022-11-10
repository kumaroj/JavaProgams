package arrays;

import java.util.Arrays;

public class BinaryArraySorting {

	public static void main(String[] args) {
		
		int[]A = {0,1,0,0,1,0,1,1,1,0};
		//op = {0,0,0,0,0,1,1,1,1};
		
		int i = -1;
		
		for(int j = 0; j<A.length; j++){
			if(A[j]<1){
				i++;
				int temp = A[j];
				A[j] = A[i];
				A[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(A));
	}

}
