package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PossibleToMakeTriangle {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(4);
		al.add(2);
		al.add(1);
		al.add(3);
		al.add(2);
		boolean ans = possibleToMakeTriangle(al);
		System.out.println(ans);
	}
	
	public static boolean possibleToMakeTriangle(ArrayList<Integer> arr){

		
		for (int i = 0; i<arr.size();i++){
			
			for (int j = i+1; j<arr.size();j++){
				
				for(int k = j+1; k<arr.size();k++){
					
					 if(((arr.get(i)+arr.get(j))>arr.get(k))
				                &&((arr.get(i)+arr.get(k))>arr.get(j))
				                &&((arr.get(j)+arr.get(k))>arr.get(i))){
				                return true;
				            }
				}
			}
		}
		
		return false;
		
	}

}
