package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KweakestRowsMatrix {

	public static void main(String[] args) {
		//int[][]mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
		int[][]mat = {{1,0},{1,0},{1,0},{1,1}};
		System.out.println(Arrays.toString(weakestmatrix(mat, 3)));
		
	}
	
	public static int[] weakestmatrix(int[][]mat, int k){
		
		 HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		 HashMap<Integer,Integer>sortedmap = new HashMap<Integer,Integer>();
		
		 
		 for (int i = 0; i<mat.length; i++){
		         int count = 0;
		       for(int j = 0; j<mat[i].length; j++){
		              if(mat[i][j]==1){
		                  count++;
		              }
		          }
		          map.put(i,count);
		      } 
		        
		     sortedmap =map.entrySet()
		                  .stream()
		                  .sorted((i1, i2)
		                              -> i1.getValue().compareTo(
		                                  i2.getValue()))
		                  .collect(Collectors.toMap(
		                      Map.Entry::getKey,
		                      Map.Entry::getValue,
		                      (e1, e2) -> e1, LinkedHashMap::new));;

		  int[]ans = new int[k];
		  int count = 0;
		     for(int c :sortedmap.keySet()) {
		         if(count<k){
		             ans[count] = c;
		             count++;
		         }
		         else
		             break;
		         
		     }
		        
		        return ans;
		     
	}

}
