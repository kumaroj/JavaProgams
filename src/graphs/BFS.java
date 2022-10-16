package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

public class BFS {
	
	static int maxn = 100009;
	static int[] visited = new int[maxn];
	static ArrayList < ArrayList < Integer > > adj;
	static HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		int A = 6;
		//int[][] B = {{6,3},{6,1},{5,1},{5,2},{3,4},{4,2}};
		int[][] B = {{1,2},{1,4},{2,3},{2,4},{3,6},{5,6},{3,5},{4,5}};
		 solve(A,B);
		 System.out.println(adj);
		 
		 for(int i = 1; i<=A; i++){
			 if(visited[i]!=1)
				 indegree(i);
		 }
		 
	System.out.println(hmap);
		
	}
	
	
	 public static void solve(int A, int[][] B) {
		    adj = new ArrayList < ArrayList < Integer > > (maxn);
		    for (int i = 0; i < maxn; i++) {
		      visited[i] = 0;
		      adj.add(new ArrayList < Integer > ());
		    }
		    
		    for (int[] edge: B)
		      adj.get(edge[0]).add(edge[1]);
		    
		}
	 
	 public static void indegree(int s) {
		    Queue < Integer > q = new ArrayDeque <Integer > ();
		    q.offer(s);
		    visited[s] = 1;
		    hmap.put(s, 0);
		    while (q.size() > 0) {
		      s = q.poll();
		      for(Integer x:adj.get(s)){
		    	   visited[x] = 1;
			       if(hmap.containsKey(x)){
			    		hmap.put(x, hmap.get(x)+1);	
			    		}
			       else{
			    		hmap.put(x, 1);
			    		q.add(x);
			    	}	  
				}
		    }
		
	 }
	
}
