package trees;

public class CheckBSTonechild {

	public static void main(String[] args) {
		int [] A = {4, 10, 5, 8};
		System.out.println(solve(A));
	}
	
	public static String solve(int[]A){
		String ans = "";
		
		for (int i = 0 ; i<A.length-1; i++){
			int j = i+1;
			
			if (A[i]<A[j]){
				while(j<A.length){
					if (A[i]<A[j]){
						j++;
					}
					else
						return "NO";					
				}
			}
			else{
				while(j<A.length){
					if (A[i]>A[j])
						j++;
					else
						return "NO";
				}
			}
		}
		
		return "YES";
	}

}
