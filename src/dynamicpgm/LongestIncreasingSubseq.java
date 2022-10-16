package dynamicpgm;

public class LongestIncreasingSubseq {

	public static void main(String[] args) {
		int [] A = {14, 24, 18, 46, 55, 53, 82, 18, 101, 20, 78, 35, 68, 9, 16, 93, 101, 85, 81, 28, 78 };
		
		int op = lis(A);
		System.out.println(op);
	}

	 public static  int lis(final int[] A) {
	        
	      int[] DP = new int [A.length];
	      for(int i = 0 ; i<DP.length ; i++){
	          DP[i] = 1;
	      }
	      
	     for(int i = 1; i<A.length; i++){
	        for(int j = 0; j<i ; j++){
	            if(A[i]>A[j]){
	                DP[i] = Math.max(DP[i] , 1+DP[j]);
	            }
	         }
	        }
	        return DP[A.length-1];
	    }
}
