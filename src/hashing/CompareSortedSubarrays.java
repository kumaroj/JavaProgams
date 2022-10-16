package hashing;

import java.util.Arrays;

public class CompareSortedSubarrays {

	public static void main(String[] args) {
	
		int A[] = {100000, 100000, 100000, 100000, 100000 };
		int [][]B = {{0, 3, 1, 4},
				     {0, 1, 2, 3},
				     {4, 4, 1, 1},
				     {1, 3, 0, 0},
				     {2, 4, 1, 1}};
		
		int []ans = new int[B.length];
		
		for (int i = 0; i<B.length; i++){
			int sumlr1 = generateSum(A , B[i][0] , B[i][1]);
			int sumlr2 = generateSum(A , B[i][2] , B[i][3]);
			
			if (sumlr1 == sumlr2){
				ans[i] = 1;
			}
			else
				ans[i] = 0;
		}
		
		
		System.out.println(Arrays.toString(ans));

	}
	
	public static int generateSum(int[]A , int l, int r){
		
		int sum = 0;
		
		for (int i = l ; i<=r; i++){
			sum = sum +( A[i]*A[i]);
		}
		
		return sum;
	}

	
	
}
