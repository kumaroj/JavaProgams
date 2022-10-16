package dsabegineerSheet;

import java.util.Arrays;

public class MoveZerostoLeft {

	public static void main(String[] args) {
		
		int []arr = {1 ,2, 0 ,0 ,1};
		
		int zerpos = Integer.MAX_VALUE;
		int zerocount = 0;
		int j = arr.length-1;
		
		for (int i =  arr.length-1; i>=0 ; i--){
			
			 if (arr[i] != 0) {
	              int temp = arr[i];
	              arr[i] = arr[j];
	              arr[j] = temp;
	              j--;
	            }
			
		}
		System.out.println(Arrays.toString(arr));
		
	/*	for (int i = 0; i<arr.length ; i++){
			
			 if (arr[i] != 0) {
	              int temp = arr[i];
	              arr[i] = arr[j];
	              arr[j] = temp;
	              j++;
	            }
			 if (arr[i]==0){
				 zerocount++;
			 }
		}
		System.out.println(Arrays.toString(arr));
		reverseArray(arr,0,arr.length-1);
		
		reverseArray(arr,zerocount,arr.length-1);
		System.out.println(Arrays.toString(arr));
*/
	}
	
	public static void  reverseArray(int []A , int l , int h){
		
		while (l<=h){
			int temp = A[l];
			A[l] = A[h];
			A[h] = temp;
			l++;
			h--;
			
		}
	}

}
