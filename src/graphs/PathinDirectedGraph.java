package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class PathinDirectedGraph {

	public static void main(String[] args) {
		int A= 5;
		int [][]B = {{1, 2} ,
		        {4, 1} ,
		                {2, 4},
		                {3, 4} ,
		                {5, 2} ,
		                {1, 3}};
		
		int res = solvedirectedpath(B,A);
		System.out.println(res);
	}

	
	/* public static int solve(int A, int[][] B) {
	       int[][]grp= new int[A][A];
	       
	       for(int i = 0; i<B.length; i++ ){
	             int k =  B[i][0];
	             int l =  B[i][1];
	             grp[k-1][l-1] = 1;

	       }
	       
	       for(int i = 0; i<grp.length; i++){
	           for(int j = i+1; j<grp[i].length; j++){
	               if(grp[i][j]!=0){
	                   if(grp[j][A-1]==1){
	                       return 1;
	                   }
	                   else
	                     continue;
	               }
	           }
	       }
	       return 0;
	       
	    }*/
	
	public static int solvedirectedpath(int[][]A,int b){
		
		   ArrayList<ArrayList<Integer>> grp = new ArrayList<ArrayList<Integer>>();
	       HashSet<Integer>hs = new HashSet<Integer>();
		   Queue<Integer> q = new LinkedList<>();
		   
		   for(int i = 0; i<=b; i++){
		       ArrayList<Integer>  al =  new ArrayList<Integer>();
		       grp.add(al);
		   }
		   for(int i = 0; i<A.length; i++){
		       grp.get(A[i][0]).add(A[i][1]);
		   }
		   
			q.add(1);
			hs.add(1);
			
			while(!q.isEmpty()){
				
				int v =q.remove();
				if(v==b)
				  return 1;
				else{
				    for(Integer x:grp.get(v)){
				    	if(x==b)
				    		return 1;
				    	else{
				    		if(!hs.contains(x)){
				    			hs.add(x);
				    			q.add(x);
				    		}
							  
						}
					}
				}  

			}
			
			return 0;
		
	}
}
