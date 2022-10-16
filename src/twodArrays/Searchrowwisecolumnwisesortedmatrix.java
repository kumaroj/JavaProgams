package twodArrays;

public class Searchrowwisecolumnwisesortedmatrix {

	public static void main(String[] args) {
		
		int[][]A = {{2,8,8,8},{2,8,8,8},{2,8,8,8}};
		int B = 8;
		  int ans = Integer.MAX_VALUE;
	        int i = 1;
	        int j = A.length;
	        
	        while(i<=A.length && j>=1){
	            
	            if(A[i-1][j-1]==B){
	                int val = (i)*1009 +(j);
	                ans = Math.min(ans, val);
	                j--;
	            }
	            else if (A[i-1][j-1]>B){
	                j--;
	            }
	            else if (A[i-1][j-1]<B){
	                i++;
	            }
	        }
	        
	        if (ans==Integer.MAX_VALUE)
	          System.out.println(ans);
	     
	        System.out.println(ans);
	}

}
