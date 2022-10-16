package twopointers;

import java.util.Arrays;
import java.util.HashSet;

public class PairwithDiff {

	public static void main(String[] args) {
		
		int[]A = { 8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3,
				2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3 };
		
		//int []A = {9,12,16,4,0,20};

		int B = 3;
		
		int x = findDiff(A , B);
		
		System.out.println(x);

	}

	
	public static int findPairs(int[]A, int B){
		 int pairs = 0;
	        Arrays.sort(A);
	        
	        int i = 0;
	        int j = 0;
	        
	        while(i<A.length && j<A.length){
	            if(Math.abs(A[j]-A[i])==B){
	                if(i!=j){
	                     pairs++;
	                }
	              j++;
	              i++;
	            }
	            else if(Math.abs(A[j]-A[i])<B){
	                j++;
	            }
	            else
	               i++;
	               
	        }
	        
	        return pairs;
	    }
	
	public static int findDiff(int[]A , int B){
		   int pair = 0;
	      HashSet<Integer> hs = new HashSet<Integer>();
	      HashSet<Integer> ele = new HashSet<Integer>();
	      
	      for (int i = 0; i<A.length; i++){
	          for (int j = i+1; j<A.length; j++){
	        	 int k = Math.abs(A[i]-A[j]);
	              if(k==B){
	            	  if (!ele.contains(A[i]) && !ele.contains(A[j])){
	            		   ele.add(A[i]);
	            		   ele.add(A[j]);
	            		   //pair++;
	            	  }
	            	  else if (!ele.contains(A[j])){
	            		  ele.add(A[j]);
	            		 // pair++;
	            	  }
	            	  else if (!ele.contains(A[i])){
	            		  ele.add(A[i]);
	            		 // pair++;
	            	  }
	            
	              }
	             
	          }
	          int c = ele.size()/2;
		      int mod = ele.size()%2;
		      pair = c+mod;
	         /* if (hs.size()==2){
            	  pair++;
              }
	          hs.clear();*/
	      }
	      
	/*      int c = ele.size()/2;
	      int mod = ele.size()%2;
	      pair = c+mod;*/
	        
	        return pair;
	}
	
}

