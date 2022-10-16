package twopointers;

import java.util.Arrays;

public class ThreeSum {

	public static void main(String[] args) {
		int[]A = { -6, 1, -4, -1, 8, -4, 9, 0, -3, 7, -3, 2, -4, -2, 3, -4, 10, 0, 9, 6, 1, 3, 4, 2 };
		int B = -3;
	  int ans = threecloseSum(A,B);
	  System.out.println(ans);
	}
	
	public static  int threeSumClosest(int[] A, int B) {
		int closestnum = 0; 
		int mindiff = Integer.MAX_VALUE;
		
		for (int i = 0; i<A.length; i++){
			
			for (int j = i+1; j<A.length; j++){
				
				for (int k = j+1; k<A.length; k++){
					
					int sum = A[i] + A[j] + A[k];
					
					int diff = Math.abs(B-sum);
					if (diff<mindiff){
						mindiff = diff;
						closestnum = sum;
					}
					
				}
			}
		}
		 
	  return closestnum;
	}
	
	
	public static  int threecloseSum(int[] A, int B) {
		int closestnum = 0; 
		int mindiff = Integer.MAX_VALUE;
		
		Arrays.sort(A);
		for (int i = 0 ; i<A.length ; i++){
			int upsum = Math.abs(B - A[i]);
			
			int j = 0;
			int k = A.length-1;
			if (i!=j){
				while(j<k){

					int sum = A[j] + A[k];
					int diff = Math.abs(upsum - sum);
					if (diff<mindiff){
						if (i!=j && i!=k && j!=k){
							mindiff = diff;
							closestnum = sum + A[i];
						}
					
						
					}
					if (diff>=0){
						j++;
					}
					else if (diff<0){
						k++;
					}
			   }
		   }
		
		}
			
		
	  return closestnum;
	}
	
		
}
