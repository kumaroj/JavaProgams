
package dynamicpgm;

public class EditDistance {

	public static void main(String[] args) {
		
		String A = "ba";
		String B = "aa";
		int op = minDistance(A,B);
		System.out.println(op);
	}
	
		
	 public  static int minDistance(String A, String B) {
	        
	        if(A.length()==1 && B.length()==1){
	            if(A.charAt(0)!=B.charAt(0)){
	                return 1;
	            }
	            else
	              return 0;
	        }
	        
	        char []X = A.toCharArray();
	        char []Y = B.toCharArray();
	        
	       int[][] DP = new int [X.length][Y.length];
	       
	       for(int i = 0 ; i<DP.length ; i++){
	           for(int j = 0 ; j<DP[i].length ; j++){
	               DP[i][j] = -1;
	           }
	       }
	       
	      return  editdistance(X, Y, X.length, Y.length, DP);
	    }
	
	
	 public static int editdistance(char[]A, char[] B, int i, int j , int[][]DP){
		 
        
        if(i==0)
         return j;
         
        if(j==0)
         return i;

        if(DP[i-1][j-1]!=-1){
            return DP[i-1][j-1];
        } 
        
        else{
            if(A[i-1]==B[j-1])
              DP[i-1][j-1] = editdistance(A , B, i-1, j-1, DP);
              
            else{
                DP[i-1][j-1] = Math.min((1 + editdistance(A , B, i, j-1, DP)),
                Math.min((1+editdistance(A , B, i-1, j-1, DP)),(1+editdistance(A , B, i-1, j, DP))));
            }  
              
        }
        
        return DP[i-1][j-1];
    }

}
