package graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Stack;

public class TopologicalSortOutdegree {

	static ArrayList<ArrayList<Integer>>	adjlist = new ArrayList<ArrayList<Integer>>();
	static HashSet<Integer>visitedset = new HashSet<Integer>();
	static Stack<Integer> ansstack = new Stack<Integer>();
	
	public static void main(String[] args) {
		int  A = 8;
		int[][] B = { { 1, 4 }, { 1, 2 }, { 4, 2 }, { 4, 3 }, { 3, 2 }, { 5, 2 }, { 3, 5 }, { 8, 2 }, { 8, 6 } };
		adjList(A,B);
		for(ArrayList<Integer>list:adjlist){
			Collections.sort(list,Collections.reverseOrder());
		}
		
		System.out.println(adjlist);
		for(int i = A; i>=1; i--){
			if(!visitedset.contains(i)){
				dfs(i);
			}
		}
		
		System.out.println(ansstack);
		
		while(!ansstack.isEmpty()){
			System.out.println(ansstack.pop());
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
	
	public static void dfs(int v){
		
		visitedset.add(v);
		for(int u:adjlist.get(v)){
			if(!visitedset.contains(u)){
				dfs(u);
			}
		}
		ansstack.push(v);
	}
	
}
