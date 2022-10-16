package hashing;

import java.util.HashMap;

public class CountRightTriangles {

	public static void main(String[] args) {
		
		int[] A = {1, 1, 2, 3, 3};
		int[] B = {1, 2, 1, 2, 1};
		
		  HashMap<Integer, Integer> hmx =  new HashMap<Integer, Integer>();
		  HashMap<Integer, Integer> hmy =  new HashMap<Integer, Integer>();
		     
		     int ans = 0;
		     
		     for (int i = 0; i<A.length; i++){
		         
		         if (hmx.containsKey(A[i]))
		             hmx.put(A[i], hmx.get(A[i])+1);
		         else
		             hmx.put(A[i], 1);
		     }
		     
		     for (int j = 0; j<B.length; j++){
		          if (hmy.containsKey(B[j]))
		             hmy.put(B[j], hmy.get(B[j])+1);
		         else
		             hmy.put(B[j], 1);
		     }
		     
		     for (int k = 0; k<A.length; k++){
		         
		        int a = hmx.get(A[k]);
		        int b = hmy.get(B[k]);
		        
		        ans = ans + ((a-1)*(b-1));
		         

	}
	
	
	}

}
