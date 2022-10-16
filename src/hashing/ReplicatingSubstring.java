package hashing;

import java.util.HashMap;

public class ReplicatingSubstring {

	public static void main(String[] args) {
		
		int A = 2;
		String B = "bc";
		
		int x = solve(A,B);
		System.out.println(x);
		
	}
	
	public  static int solve(int A, String B) {
        
		int length = B.length();
		if (length%A==0){
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int i = 0; i<B.length(); i++){
				if(map.containsKey(B.charAt(i)))
					map.put(B.charAt(i), map.get(B.charAt(i))+1);
				else
					map.put(B.charAt(i), 1);
			}
			
			for (char x:map.keySet()){
				if (map.get(x)%A!=0)
					return -1;
			}	
		}
		else{
			return -1;
		}
		
		return 1;
    }

}
