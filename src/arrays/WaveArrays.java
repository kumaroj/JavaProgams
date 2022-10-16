package arrays;

import java.util.Arrays;

public class WaveArrays {

	public static void main(String[] args) {
		int [] A ={ 1,2,3,4};
		Arrays.sort(A);
		for(int i =0; i<A.length-1; i=i+2){
			int temp = A[i];
			A[i] = A[i+1];
			A[i+1] = temp;
		}
		System.out.println(Arrays.toString(A));
	}

}
