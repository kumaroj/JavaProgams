package backtracking;

import java.util.ArrayList;

public class AllPermutations {
	
	static ArrayList<Integer> al = new ArrayList<Integer>();
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ip = new ArrayList<Integer>();
		ip.add(1);
		ip.add(2);
		ip.add(3);
		allPermutations(ip,0, 0);
		//generatenumbers(ip,al,0);
		System.out.println(ans);
		System.out.println(ans.size());
	}
	
	/*public static void generatenumbers(ArrayList<Integer>A,ArrayList<Integer> al,int idx){
		if(idx==A.size()){
			ArrayList<Integer> copy = new ArrayList<Integer>();
			copy.addAll(al);
			ans.add(copy);
			return;
		}
		
		al.add(idx, A.get(idx));
		generatenumbers(A,al,idx+1);
		
		
		
		al.remove(idx);
		
		al.add(idx, A.get(idx));
		generatenumbers(A,al,idx+1);
	
		al.remove(idx);
	}*/
	 public static void allPermutations(ArrayList<Integer> A, int N , int idx ){
	        if (N==A.size())
	          return;
	        
	        for(int i = idx; i<A.size()-1; i++){
	            int temp = A.get(i);
	            A.remove(i);
	            A.add(i+1 , temp);
	            
	           ArrayList<Integer> store = new ArrayList<Integer>();
	           store.addAll(A);
	            ans.add(store);    
	        }  
	        allPermutations(A , N+1 , 0);
	        
	    }
	
	

}
