package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class CycleinUnDirectedGraph {
	
	static  HashSet<Integer>hs = new HashSet<Integer>();
    static ArrayList<ArrayList<Integer>> grp = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args) {
		int A = 4;
		int[][] B = { {1,2},{2,3},{3,4}};
		
		constructadj(A,B);
		System.out.println(grp);
		boolean flag = iscyclic(1,-1);
		System.out.println(flag);
	}
	
	
	
	public static void constructadj(int A, int[][] B){
		
		   for(int i = 0; i<=A; i++){
		       ArrayList<Integer>  al =  new ArrayList<Integer>();
		       grp.add(al);
		   }
		   System.out.println(grp.size());
		   
		   for(int i = 0; i<B.length; i++){
		       grp.get(B[i][0]).add(B[i][1]);
		   }
		   
		   for(int j = 0; j<B.length; j++){
		       grp.get(B[j][1]).add(B[j][0]);
		   }
	}
	
	public static void dfs(int v){
		hs.add(v);
		for(int x:grp.get(v))
		{
			if(!hs.contains(x))
				dfs(x);
		}
		System.out.println(v);
	}
	
	public static boolean iscyclic(int v,int parent){
		hs.add(v);
		for(int x:grp.get(v)){
			if(hs.contains(x) && x!=parent)
				return true;
			else if(!hs.contains(x)){
				if(iscyclic(x,v))
					 return true;
			}
		}
		
		return false;
	}
	
	
	public static boolean connectdcomp( int A, int parent){
		
		for(int i = 0 ; i<=A; i++){
			if(!hs.contains(i)){
				boolean flag = iscyclic(i,parent);
				if(flag)
					return true;
			}
			
		}
		return false;
	}

}
