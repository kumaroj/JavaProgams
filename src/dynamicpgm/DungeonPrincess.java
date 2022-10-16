package dynamicpgm;

public class DungeonPrincess {

	public static void main(String[] args) {
		int[][]A = {{-2,-3,3},{-5,10,1},{10,30,-5}};
		int op = calculateMinimumHP(A);
		System.out.println(op);
	}
	
	 public static  int calculateMinimumHP(int[][] A) {
	        
	      int[][]DP = new int[A.length][A[0].length];
	      int n = DP.length;
	      int m = DP[0].length;
	      
	      DP[n-1][m-1] = Math.max(1, 1-A[n-1][m-1]);
	      
	      for(int i =n-1 ; i>=0 ; i--){
	          for(int j = m-1; j>=0 ; j--){
	              
	              if(i==n-1 && j==m-1)
	                continue;
	                
	              else if(j==m-1){
	                   DP[i][j] = Math.max(1 , DP[i+1][j]-A[i][j]);
	              } 
	              
	              else  if(i==n-1){
	                   DP[i][j] = Math.max(1 , DP[i][j+1]-A[i][j]);
	              }  
	            
	              else {
	                  DP[i][j] = Math.max(1 , Math.min(DP[i+1][j],DP[i][j+1])-A[i][j]);
	              }
	                     
	          }
	      }
	      
	      return DP[0][0];
	    }

}
