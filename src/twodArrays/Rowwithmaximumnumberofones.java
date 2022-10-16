package twodArrays;

public class Rowwithmaximumnumberofones {

	public static void main(String[] args) {
		int [][]A =      {{0, 0, 0, 0, 0, 1, 1, 1, 1},
				          {0, 0, 0, 0, 0, 1, 1, 1, 1},
						  {0, 0, 0, 0, 0, 1, 1, 1, 1},
						  {0, 0, 0, 0, 0, 0, 1, 1, 1},
						  {0, 0, 0, 0, 0, 0, 1, 1, 1},
						  {0, 0, 0, 1, 1, 1, 1, 1, 1},
						  {0, 0, 0, 0, 1, 1, 1, 1, 1},
						  {0, 0, 0, 1, 1, 1, 1, 1, 1},
						  {0, 0, 0, 1, 1, 1, 1, 1, 1}};
		
		int colcount = Integer.MAX_VALUE;
        int i = 0;
        int j = A[0].length-1;
        int ans = -1;
        while(i<A.length && j>=0){
            if(A[i][j]==1){
            	if(colcount>j){
            		colcount = j;
            		ans = i;
            	}
    
                j--;
                
            }
            else if(A[i][j]==0)
             i++;
        }
        
        System.out.println(colcount);
        System.out.println(ans);

	}

}
