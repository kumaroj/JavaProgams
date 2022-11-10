package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctElementKWindow {

	public static void main(String[] args) {
		int k = 4;
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(3);
		
		 ArrayList<Integer> ans = countDistinctElementsopt(al, k);
		 System.out.println(ans);
	}
	
	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for (int i = 0; i<k ; i++){
			al.add(arr.get(i));
		}
		
		for(int x:al){
			hs.add(x);
		}
		ans.add(hs.size());
		hs.clear();
	
		for (int i = k ; i<arr.size(); i++){

			al.remove(0);
			al.add(arr.get(i));
			
			for(int x:al){
				hs.add(x);
			}
			ans.add(hs.size());
			hs.clear();
			
		}
		return ans;
	}
	
	
public static ArrayList<Integer> countDistinctElementsopt(ArrayList<Integer> arr, int k) {
		
		
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		for (int i = 0; i<k ; i++){
			hs.add(arr.get(i));
		}
		
		ans.add(hs.size());
		hs.clear();
	
		for (int i = 1 ; i<=arr.size()-k; i++){
			for (int j = i ; j<=i+k-1; j++){
				hs.add(arr.get(j));
			}
			ans.add(hs.size());
			hs.clear();
			
		}
		return ans;
	}

}
