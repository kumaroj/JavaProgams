package arrays;

import java.util.Arrays;

public class ProductArrayPuzzle {

	public static void main(String[] args) {
		int [] A = {2, 12, 1, 1, 20, 1};
		
		int product = 1;
		int[]prodarr = new int[A.length];
		
		for (int i = 0; i<A.length; i++){
			product = 1;
			for (int j = 0; j<A.length; j++){
				if (i!=j){
					product = product * A[j];
				}
			}
			prodarr[i] = product;
		}

		System.out.println(Arrays.toString(prodarr));
	}

}
