package twodArrays;

import java.util.Arrays;

public class SubmatrixSumQueries {

	public static void main(String[] args) {
		
		int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int[] B = {1, 2};
		int[] C = {1, 2};
		int[] D = {2, 3};
		int[] E = {2, 3};
		
		
		int[][]PS = new int[A.length][A[0].length];
		int sum = 0;
		
		int[] ans = new int[B.length];
		
		for(int i = 0; i<A.length; i++){
			sum = 0;
			for(int j = 0; j<A[0].length; j++){
				
			sum = sum+A[i][j];
			PS[i][j] = sum;
			}
		}
		
		
		for(int j = 0; j<A[0].length; j++){
			sum = 0;
			for(int i = 0; i<A.length; i++){
				sum = sum+PS[i][j];
			    PS[i][j] = sum;
			}
		}
		
		
		/*for(int i = 0; i<A.length; i++){
			for(int j = 0; j<A[0].length; j++){
				
			 System.out.print(PS[i][j]);
			 System.out.print(' ');
			}
			
			System.out.println();
		}*/
		
		
		
		for(int i = 0; i<B.length; i++){
			int t = B[i]-1 ;
			int l = C[i]-1;
			int b = D[i]-1;
			int r = E[i]-1;
			
			if(t==0 && l==0){
				ans[i] = PS[b][r];
			}
			else if (t==0){
				ans[i] = PS[b][r] - PS[b][l-1];
			}
			else if(l==0){
				ans[i] = PS[b][r] - PS[t-1][r];
			}
			else
				ans[i] = PS[b][r] - PS[t-1][r]- PS[b][l-1] + PS[t-1][l-1]; 
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
