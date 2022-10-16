package hashing;

import java.util.HashSet;

public class PairsWithGivenXor {

	public static void main(String[] args) {
		
		
		int [] A = {3, 6, 8, 10, 15, 50};
		int B = 5;
		int ans = 0;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i<A.length ; i++){
			hs.add(A[i]);
		}
		
		for (int i = 0; i<A.length ; i++){
			int x = B^A[i];
			if (hs.contains(x)){
				ans++;
				hs.remove(x);
				hs.remove(A[i]);
			}
		}
		
		System.out.println(ans);
		
	}
  
	
	
}
