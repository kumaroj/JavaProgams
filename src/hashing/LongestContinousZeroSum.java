package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LongestContinousZeroSum {

	public static void main(String[] args) {
		
		int A[] = { 1, 2, -2, 4, -4 };
		int PS[] = new int[A.length];
		int sum = 0;
		int e = 0;
		int s  = 0;
		int length = 0;
		int maxlength = 0;
		
		for (int i = 0 ; i<A.length; i++){
			sum+=A[i];
			PS[i]=sum;
		}

		System.out.println(Arrays.toString(PS));
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for(int i = 0; i<PS.length ; i++){
			hmap.put(PS[i], i);
		}
		
		
		for(int i = 0 ; i<PS.length; i++){
			if(hmap.containsKey(PS[i])){
				int j = hmap.get(PS[i]);
				if(i!=j){
					 length = j-i;
					 if(length>maxlength){
						 
					 }
				}
			
			}
		}
		
		System.out.println(maxlength);
		System.out.println(e);
		System.out.println(s);
		
		int ans[] = new int[maxlength];
		int j = 0;
		for (int i = s+1; i<=e ; i++){
			ans[j] = A[i];
			j++;
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
