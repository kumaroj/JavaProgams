package subseqandsubsets;

public class LittlePonnyand2Subsequence {

	public static void main(String[] args) {
		
		String A = "leqielilec";
		String ans = solve(A);
		System.out.println(ans);

	}
	
	public static String solve(String A) {
		String subseq = "";
		
		if (A.length()==1){
			 subseq+=A.charAt(0);
			 return subseq;
		}
		
		int idx = 0;
		char min = A.charAt(0);
		
		for (int i = 1; i<A.length()-1 ; i++){
			
			if (A.charAt(i)<min){
				min = A.charAt(i);
				idx = i;
			}
		}
		
		subseq = subseq + min;
		StringBuilder sb = new StringBuilder(subseq);
		
		for (int i = idx+1; i<A.length(); i++){
			
			if (A.charAt(i)<min){
				min = A.charAt(i);				
		
				}
		}
			
			sb = sb.append(min);
		
		/*for (int i = idx+1; i<A.length()-1; i++){
			
			if (A.charAt(i)<min){
				min = A.charAt(i);
				sb = sb.append(min);
			}
			
			else if (A.charAt(i)==min){
				if (sb.length()<2){
					sb = sb.append(min);
				}
			}
		}*/
		
		
		/*if (A.charAt(A.length()-1)<min){
			
			if (sb.length()>=2){
				sb.setCharAt(sb.length()-1, A.charAt(A.length()-1));
			}
			else{
				sb = sb.append(A.charAt(A.length()-1));
			}
		}
		
		else if (sb.length()==1){
			sb = sb.append(A.charAt(A.length()-1));
		}
		*/
		
    
		return sb.toString();
	
	
	
	}

}
