package dynamicpgm;

public class Maxsumwithoutadj {

	public static void main(String[] args) {
		int [][]A = {{74,37,81,1},{66,38,16,1}};
		System.out.println(adjacent(A));
	}
	
	 public static  int adjacent(int[][] A) {
	        return maxsum(A ,A[0].length-1);
	    }
	 
	 public static int maxsum(int[][]A , int j){
	        if(j<0)
	          return 0;
	          
	        return Math.max((Math.max(A[0][j],A[1][j])+ maxsum(A,j-2)),maxsum(A,j-1));  
	    }
}
