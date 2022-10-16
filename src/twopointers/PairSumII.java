package twopointers;

import java.util.Arrays;

public class PairSumII {

	public static void main(String[] args) {
		int [] A = {1, 2, 6, 6, 7, 9, 9};
		int B = 13;
		
		int pairs = 0;
		int sum = 0;

		Arrays.sort(A);
		
		int i = 0;
		int j = A.length-1;
		
		while(i<j){
			
			sum = A[i] + A[j];
			
			if (sum==B){
				if (A[i]==A[j]){
					pairs = pairs + (j-i+1);
					break;
				}
				j--;
				pairs++;
			}
			else if (sum<B){
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println(pairs);
	}

}
