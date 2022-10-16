package leetcode;

import java.util.HashMap;

public class FirstUnqiueCharacter {

	public static void main(String[] args) {
		
		String A  = "loveleetcode";
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i = 0; i<A.length(); i++){
			
			if (map.containsKey(A.charAt(i))){
				map.put(A.charAt(i), map.get(A.charAt(i))+1);
			}
			else
				map.put(A.charAt(i), 1);
		}
		
		for (int i = 0; i<A.length(); i++){
			
			if (map.get(A.charAt(i))==1){
				System.out.println(i);
				break;
			}
		}

	}

}
