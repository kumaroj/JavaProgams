package leetcode;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		
		String s = "a";
		String t = "ab";
		
		int []ana = new int [26];
		
		for (int i = 0; i<t.length(); i++){
			
			ana[t.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(ana));
		
		for (char x:s.toCharArray()){
			
			if (ana[x-'a']==0){
				System.out.println("No anagram");
				break;
			}
			else
				ana[x-'a']--;
		}
		
		for (int c :ana){
			if (c==1){
				System.out.println("No anagram");
				break;
			}
				
		}
	}

}
