package subseqandsubsets;

public class OddEvenSubsequences {

	public static void main(String[] args) {
		
		int []A = {2, 2, 2, 2, 2};
		
		int cnt = solve(A);
		System.out.println(cnt);
		

	}

	
	public static int solve(int[]A){
		int cnt = 1;
		
		for (int i = 1; i<A.length; i++){
			
			if (A[i]%2==0){
				if(A[i-1]%2!=0){
					cnt++;
				}
			}
			else if (A[i]%2!=0){
				if(A[i-1]%2==0){
					cnt++;
				}
				
			}
			
		}
		return cnt;
	}
}
