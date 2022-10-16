package twopointers;

import java.util.Arrays;

public class SortBycolor {

	public static void main(String[] args) {
		
		/*int[]A = { 2, 0, 0, 1, 0, 0, 2, 2, 1, 1, 0, 0, 1, 0, 2, 1, 1, 0, 1, 0, 1, 2, 2, 2, 0, 0, 1, 0, 2, 1, 1, 2, 1, 2, 
				2, 1, 0, 2, 2, 1, 1, 1, 0, 1, 0, 1, 0, 2, 1, 2, 0, 2, 0, 1, 1, 0, 2, 2, 1, 2, 0, 2, 1, 1, 1, 2, 0, 1, 0,
				2, 2, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 2, 1, 1, 0, 2, 1, 2, 0, 0, 0, 2, 2, 2, 2, 0, 0, 0, 1, 1, 0, 2, 1, 2, 2, 2, 1, 2, 2, 0, 1, 0,
				1, 2, 1, 1, 0, 1, 2, 0, 1, 0, 2, 2, 1, 2, 1, 0, 2, 2, 1, 1, 0, 2, 1, 2};*/
		
	
		
		int[] A = { 1, 2, 1, 1, 1, 1, 1, 0, 0, 1, 0, 2, 0, 2, 2, 1, 2, 0, 2, 0, 2, 2, 2, 0, 1, 2, 1, 0, 0, 2, 0, 1, 1, 2,
				2, 1, 0, 1, 2, 0, 0, 0, 1, 2, 2, 0, 2, 2, 0, 2, 1, 2, 1, 2, 0, 1, 2, 1, 0, 2, 0, 2, 0, 1, 1, 0, 2, 2, 2, 
				0, 2, 1, 2, 0, 0, 1, 2, 0, 2, 1, 1, 1, 0, 2, 0, 2, 1, 0, 1, 0, 2};
		
		
		int i = 0;
		int j = A.length-1;
		int lastidx = -1;
		
		while(i<=j){
			if (A[i]==0 && A[j]!=0){
				lastidx = i;
				i++;
				j--;
			}
			else if(A[i]!=0 && A[j]==0){
				int temp = A[i];
				A[i] = 0;
				A[j] = temp;
				lastidx = i;
				i++;
				j--;
			}
			else if(A[i]!=0 && A[j]!=0){
				j--;
			}
			
			else if(A[i]==0 && A[j]==0){
				lastidx = i;
				i++;
			}
			
		}
		System.out.println(Arrays.toString(A));
		
        j = lastidx + 1;
		int k = A.length-1;
		
		while(j<k){
			if (A[j]==1 && A[k]!=1){
				j++;
				k--;
			}
			
			else if(A[j]!=1 && A[k]==1){
				int temp = A[j];
				A[j] = 1;
				A[k] = temp;
				j++;
				k--;
			}
			
			else if(A[j]!=1 && A[k]!=1){
				k--;
			}
			
			else if(A[j]==1 && A[k]==1){
				j++;
			}
			
		}
		
		System.out.println(Arrays.toString(A));
	}

}
