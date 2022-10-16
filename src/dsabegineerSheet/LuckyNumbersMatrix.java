package dsabegineerSheet;

import java.util.ArrayList;
import java.util.HashSet;

public class LuckyNumbersMatrix {

	public static void main(String[] args) {
		int[][]A = {{3,7,8},{9,11,13},{15,16,17}};
		
		ArrayList<Integer> minrow = new ArrayList<Integer>();
		ArrayList<Integer> maxcol = new ArrayList<Integer>();
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		
		for (int i = 0; i<A.length; i++){
			min = Integer.MAX_VALUE;
			for(int j = 0 ; j<A[i].length; j++){
				min = Math.min(min, A[i][j]);
			}
			minrow.add(min);
		}
		
		System.out.println(minrow);
		
		for (int i = 0; i<A.length; i++){
			max = Integer.MIN_VALUE;
			for(int j = 0 ; j<A[i].length; j++){
				max = Math.max(max, A[j][i]);
			}
			maxcol.add(max);
		}

		
		System.out.println(maxcol);
		
		
		HashSet<Integer> hs =new HashSet<Integer>();
		
		for (int x:minrow){
			hs.add(x);
		}
		
		for (int y:maxcol){
			if (hs.add(y)==false){
				res.add(y);
			}
		}
		
		
		System.out.println(res);
	}

}
