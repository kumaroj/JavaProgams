package arrays;

public class ReturnPattern {

	public static void main(String[] args) {
		solve(3);

	}
	public  static int[][] solve(int A) {
	     int[][]res = new int[A][A];
	     int count = 1;
	     for(int i = 0; i<A ;i++){
	         for(int j = 0; j<=i;j++){
	             res[i][j] = count++;
	         }
	         count = 1;
	     }
	     return res;
	    }
}
