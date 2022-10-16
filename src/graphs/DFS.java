package graphs;

import java.util.ArrayList;
import java.util.HashSet;

public class DFS {

	
	static ArrayList<ArrayList<Integer>>	adjlist = new ArrayList<ArrayList<Integer>>();
	static HashSet<Integer>visitedset = new HashSet<Integer>();
	
	public static void main(String[] args) {
		int A = 6;
		int[][] B = {{1,2},{1,4},{2,3},{2,4},{3,6},{5,6},{3,5},{4,5}};
		
		adjList(A, B);
		System.out.println(adjlist);
		for(int i = 1; i<=A ; i++){
			if(!visitedset.contains(i)){
				DFS(i);
			}
				
		}
	
	}

	
	public static void adjList(int A, int [][]B){
		for(int i = 0; i<=A; i++){
			ArrayList<Integer> al = new ArrayList<Integer>();
			adjlist.add(al);
		}	
		for(int []arr:B){
			adjlist.get(arr[0]).add(arr[1]);
		}
	}
	
	public static void DFS(int v){
		
		visitedset.add(v);
		for(int u:adjlist.get(v)){
			if(!visitedset.contains(u)){
				DFS(u);
			}
		}
		System.out.println(v);
	}
}
