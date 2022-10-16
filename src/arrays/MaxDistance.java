package arrays;

public class MaxDistance {

	public static void main(String[] args) {
	  int []A = {3, 5, 4, 2};
	  int maxdist = 0;
	  int i = 0;
	  int j = A.length-1;
	  
	  while(i<j){
		  if(A[i]<=A[j]){
			  int val = j-i;
			  maxdist =  Math.max(val, maxdist);
			  i++;  
		  }
		  else if (A[i]>A[j]){
			  i++;  
		  }
			  
	  }
	  
	  
	  //Brute Force Approach
	/*  for (int i = 0 ;i<A.length; i++){
		  for(int j = i+1; j<A.length; j++){
			  if(A[i]<=A[j]){
				  int val = j-i;
				  maxdist = Math.max(maxdist, val);
			  }
		  }
	  }
*/
	  
	 

	}
}
