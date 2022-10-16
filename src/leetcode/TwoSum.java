package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		
		int []num = {3,2,4};
		int tgt = 6;
		int[] ans = new int[2];
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i<num.length; i++){
			hmap.put(num[i], i);
		}
		
		for (int i = 0; i<num.length; i++){
			int diff = tgt - num[i];
			if (diff!=num[i]){
				if (hmap.containsKey(diff)){
					ans[0] = i;
					ans[1] = hmap.get(diff);
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(ans));
	}

}
