package hashing;

import java.util.HashMap;

public class KOccurrences {

	public static void main(String[] args) {
		int []A = {0, 0, 1 };
		int k = 2;
		int sum = 0;
	    HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
	    for(int i = 0 ; i<A.length;i++){
	    	if(map.containsKey(A[i]))
	    		 map.put(A[i] , map.get(A[i])+1);
	    	else
	    		 map.put(A[i] , 1);
	    
	    }
	    for(int s:map.keySet()){
	    	if(map.get(s)==k)
	    		sum+=s;
	    }
	    System.out.println(sum);
	}

}
