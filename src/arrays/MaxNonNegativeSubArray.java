package arrays;

import java.util.Arrays;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {
		int []A = {-1, -1, -1, -1, -1 };
		int sum = 0 ;
		int pos_sub = 0;
		int start_index = 0;
		int min_index = 0;
		int end_index = 0;
		int length = 0;
		int max_length = 0;
		
		for(int i = 0 ; i<A.length ; i++){
			if(A[i]>0){
				sum = sum + A[i];
				length++;
			}
			else if (A[i]<0){
				sum = 0;
				start_index = i+1;
				length = 0;
			}
		   if(pos_sub<sum){
			  pos_sub = sum;
			  end_index = i;
			  min_index = start_index;
			  max_length = length;
		   }
		   else if(pos_sub==sum){
			   if( max_length < length){
				   end_index = i;
				   min_index = start_index;
			   }
		   }
		}
		
		System.out.println(pos_sub);
		System.out.println(min_index);
		System.out.println(end_index);
		System.out.println(max_length);
		System.out.println(length);
		
		
		if (sum==0){
			   int[]ans = new int[1];
			    ans[0]= 0;
			    System.out.println(Arrays.toString(ans));
			}
		
		int[]ans = new int[max_length];
		int s = 0;
		for(int k = min_index; k<=end_index;k++){
		   ans[s] = A[k];
		    s++;
		}
		System.out.println(Arrays.toString(ans));
	}

}
