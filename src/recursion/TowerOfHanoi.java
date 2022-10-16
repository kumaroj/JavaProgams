package recursion;

import java.util.ArrayList;


public class TowerOfHanoi {
	
	static int counter = 1;
	static int A = 1;
	public static void main(String[] args) {

		int s = 1;
		int i = 2;
		int d = 3;
		
		System.out.println(towerOfHanoi(A,s,d,i));
	}

	
	public  static ArrayList<ArrayList<Integer>> towerOfHanoi(int N, int s, int d , int i){
		
		if (N==1){
			
			ArrayList<ArrayList<Integer>> th = new ArrayList<ArrayList<Integer>>();
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(0,1);
			al.add(1,s);
			al.add(2,d);
			System.out.println(s+"->"+d);
			th.add(al);
			
			return th;
			 //return 1;
		}
		  
		ArrayList<ArrayList<Integer>> x = towerOfHanoi(N-1, s, i, d);
		ArrayList<ArrayList<Integer>> y = towerOfHanoi(1, s, d, i);
		y.get(0).set(0, N);
		ArrayList<ArrayList<Integer>> z = towerOfHanoi(N-1, i, d, s);
		
		ArrayList<ArrayList<Integer>> hanoi = new ArrayList<ArrayList<Integer>>();
		for (int k = 0 ; k<x.size(); k++){
			hanoi.add(x.get(k));
		}
		hanoi.add(y.get(0));		
		for (int k = 0 ; k<z.size(); k++){
			hanoi.add(z.get(k));
		}
		return hanoi;
	}
}
