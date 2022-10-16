package arrays;

public class MaxSumSubarray {

	public static void main(String[] args) {
		int[]A = {-2,3,4,-1,5-10,7};
		int sum = 0;
	    int maxsum = Integer.MIN_VALUE;
	    int s = 0;
	    int e = 0;
	    for(int i = 0 ; i<A.length ; i++){
            sum = sum+A[i];
            //s = i;
            if(sum>maxsum) {
            	maxsum = sum;
            	e = i;
            }
                
            if(sum<0){
            	 s = i+1;
                 sum = 0;	
            }
        }
		
	    System.out.println(s);
	    System.out.println(e);
	    System.out.println(maxsum);
	    for(int i = s; i<=e; i++){
	    	System.out.print(A[i]);
	    	System.out.print(" ");
	    }
	}

}
