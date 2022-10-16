package dsabegineerSheet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	public static void main(String[] args) {
		ArrayList< Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(7);
		arr.add(11);
		arr.add(13);
		System.out.println(twoSum(arr,9,arr.size()));
	}
	
	
	public static ArrayList<Map<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
		
		ArrayList<Map<Integer, Integer>> ans = new ArrayList<Map<Integer, Integer>>();
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		
		for (int i = 0; i<arr.size(); i++){
			if (hmap.containsKey(arr.get(i)))
				hmap.put(arr.get(i), hmap.get(arr.get(i))+1);
			else
				hmap.put(arr.get(i), 1);
		}
		
		for (int x : hmap.keySet()){
			if (hmap.containsKey(target-x)){
				if ((target-x)!=x){
					 HashMap<Integer, Integer> op = new HashMap<Integer,Integer>();
					 op.put(x, target-x);
					 ans.add(op);
					if (hmap.get(target-x)>1){
						hmap.put(target-x, hmap.get(target-x)-1);
					
					}
				}
				else{
					if (hmap.get(target-x)!=1){
						HashMap<Integer, Integer> op = new HashMap<Integer,Integer>();
						op.put(x, target-x);
						hmap.put(target-x, hmap.get(target-x)-1);
						ans.add(op);
					}
				}
				
			}
		}
		
		if (ans.size()==0){
			HashMap<Integer, Integer> op = new HashMap<Integer,Integer>();
			hmap.put(-1, -1);
			ans.add(op);
		}
		
		
		return ans;
		
	}
}
