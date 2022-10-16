package graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopologicalSort {

	
	
	static ArrayList<Integer>toporder = new ArrayList<Integer>();
	static int maxn = 100009;
	static int[] visited = new int[maxn];
	static ArrayList < ArrayList < Integer > > adj;
	static HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	static Queue<Integer> topoq = new LinkedList<>();
	static Queue<Integer>pq= new PriorityQueue<Integer>();
	static HashSet<Integer>hstopo = new HashSet<Integer>();
	public static void main(String[] args) {
		int  A = 8;
		
		int[][] B = { { 1, 4 }, { 1, 2 }, { 4, 2 }, { 4, 3 }, { 3, 2 }, { 5, 2 }, { 3, 5 }, { 8, 2 }, { 8, 6 } };

		 adjlist(A,B);
		 System.out.println(adj);
		 
		 for(int i = 1; i<=A; i++){
			 if(visited[i]!=1)
				 indegree(i);
		 }
		 
		 System.out.println(hmap);

		
		 topologicalsort(A);
		System.out.println(toporder);
	}

	
	public static void topologicalsort(int A){
		for(int i = 1; i<=A ; i++){
			if(hmap.get(i)==0)
				pq.add(i);
			
		}
		while(!pq.isEmpty()){
		  int s = pq.remove();
		   toporder.add(s);
		   for(int x:adj.get(s)){
			  hmap.put(x, hmap.get(x)-1);
				if(hmap.get(x)==0){
					pq.add(x);
				}	
			}
		}
	}
	
	
	
	 public static void adjlist(int A, int[][] B) {
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
		    	  if(visited[x]!=1){
		    		  visited[x] = 1;
		    		  q.add(x);
		    	 	  hmap.put(x, 1);
		    	  }
				  else
				     hmap.put(x, hmap.get(x)+1);	
				    
		      }

		  }
	  }
}
