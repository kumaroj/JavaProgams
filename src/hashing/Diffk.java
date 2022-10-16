package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Diffk {

	public static void main(String[] args) {
	 int A[] = {0};
	 int k = 0;
	int x = finddiffPair(A, k);
	System.out.println(x);
	/* HashSet<Integer>  hs =	new HashSet<Integer>();	 
	 for(int i = 0 ; i<A.length; i++){
		 System.out.println(A[i]-k);
		 if(!(hs.contains(A[i]-k))){
			 hs.add(A[i]);
		 }
		 else
			 System.out.println(A[i]);
	 }*/

	}
	
	public static int finddiffPair(int []A , int k){
		int diffpair = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0 ; i<A.length; i++){
			if(map.containsKey(A[i]))
				map.put(A[i], map.get(A[i])+1);
			else
				map.put(A[i], 1);
		}
		
		for(int i = 0 ; i<A.length;i++){
			if(map.containsKey(A[i]-k)){
				if(k==0){
					if(map.get(A[i])>1)
						diffpair++;
				}
				else
					diffpair++;
			}
		}
		return diffpair;
	}

}
