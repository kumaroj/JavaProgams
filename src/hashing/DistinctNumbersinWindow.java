package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class DistinctNumbersinWindow {

	public static void main(String[] args) {
	
		int[]A = {1, 1, 2, 2};
		int B = 1;
		
		int ans[] = new int [A.length-B+1];
		HashSet<Integer> hs = new HashSet<Integer>();
		HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
		
		int k = 0;
		
		/*for (int i = 0 ; i<=A.length-B ; i++){
			int x = i+(B-1);
			for (int j = i; j<=x ; j++){
				hs.add(A[j]);
			}
			
			ans[i] = hs.size();
			hs.clear();
		}
		*/
		int i = 0;
		int j = B-1;
		
		while(i<=j){
			if(hmap.containsKey(A[i]))
				hmap.put(A[i], hmap.get(A[i])+1);
			else
				hmap.put(A[i], 1);
			i++;
		}
		
		ans[k] = hmap.size();
		i = 1;
		j++;
		k++;
		
		while(i<=A.length-B && j<A.length){
			
		  if (hmap.get(A[i-1])>1){
			  hmap.put(A[i-1],  hmap.get(A[i-1])-1);
		   }
		  else if (hmap.get(A[i-1])==1){
			  hmap.remove(A[i-1]);
		  }
		  else if (hmap.get(A[i-1])==0){
			  hmap.remove(A[i-1]);
		  }
		  
		  if(hmap.containsKey(A[j]))
				hmap.put(A[j], hmap.get(A[j])+1);
			else
				hmap.put(A[j], 1);
		  
			ans[k] = hmap.size();
			i++;
			j++;
			k++;
		  
		}
		
		System.out.println(Arrays.toString(ans));
	}
	
	

}
