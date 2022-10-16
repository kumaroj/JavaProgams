package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CommonElements {

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new  ArrayList<Integer> ();
		ArrayList<Integer> B = new  ArrayList<Integer> ();
		
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(1);
		
		B.add(2);
		B.add(3);
		B.add(1);
		B.add(2);
		
		System.out.println(solve(A, B));
	}
	
	 public static  ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		 
		 
		 HashSet<Integer> hs = new HashSet<Integer>();
		 ArrayList<Integer> ans = new ArrayList<Integer>();
		 HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		 
		 
		 for (int i = 0; i<A.size(); i++){
			 hs.add(A.get(i));
			 
			 if (hmap.containsKey(A.get(i))){
				 hmap.put(A.get(i), hmap.get(A.get(i))+1);
			 }
			 else
				 hmap.put(A.get(i), 1);
		 }
		 
		 for (int i = 0; i<B.size(); i++){
			
			 if (hs.contains(B.get(i))){
				if (hmap.get(B.get(i))>=1){
					ans.add(B.get(i));
					hmap.put(B.get(i),  hmap.get(A.get(i))-1);
				}
			 }
		 }
		 
		 
		 
		 System.out.println(hs);
		 System.out.println(hmap);
		 
		 return ans;
	    }

}
