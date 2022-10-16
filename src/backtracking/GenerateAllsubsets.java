package backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class GenerateAllsubsets {

	
	static ArrayList<Integer> al = new ArrayList<Integer>();
	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
	static int sum = 0;
	static int k =7;
	public static void main(String[] args) {
		
		ArrayList<Integer> ip = new ArrayList<Integer>();
		ip.add(2);
		ip.add(3);
		ip.add(6);
		ip.add(7);
		generateSubsets(ip, 0 , al);
		System.out.println(ans);

	}
	
	 public static void generateSubsets(ArrayList<Integer> A , int idx, ArrayList<Integer> currlist){
	        
	        if(idx==A.size()){
	         ArrayList<Integer>  temp = new ArrayList<Integer>();
	         temp.addAll(currlist);
	         for(int a:temp){
	        	sum =sum+a;
	         }	        
	         if(sum==k){
	        	 ans.add(temp);
	         }
	         else if(sum<k){
	        	int diff = k-sum;
	        	if(temp.contains(diff)){
	        		temp.add(diff);
	        		Collections.sort(temp);
	        		 ans.add(temp);
	        	}
	         }
	         sum=0;
	         return;
	         
	        }
	        currlist.add(A.get(idx));
	        generateSubsets(A , idx+1 , currlist);
	        
	        currlist.remove(currlist.size()-1);
	        generateSubsets(A , idx+1 , currlist);
	        
	       
	    }
}
