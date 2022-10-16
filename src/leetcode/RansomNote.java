package leetcode;

import java.util.HashMap;

public class RansomNote {

	public static void main(String[] args) {
		
		String ransomNote = "aa";
		String magazine = "ab";
		
		HashMap<Character, Integer> mapnote = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapmag  =  new HashMap<Character, Integer>();
		
		for (int i = 0 ; i<ransomNote.length(); i++){
			if (mapnote.containsKey(ransomNote.charAt(i))){
				mapnote.put(ransomNote.charAt(i), mapnote.get(ransomNote.charAt(i))+1);
			}
			else
				mapnote.put(ransomNote.charAt(i), 1);
		}
		
		for (int i = 0 ; i<magazine.length(); i++){
			if (mapmag.containsKey(magazine.charAt(i))){
				mapmag.put(magazine.charAt(i), mapmag.get(magazine.charAt(i))+1);
			}
			else
				mapmag.put(magazine.charAt(i), 1);
		}
		
		for (Character c:mapnote.keySet()){
			if (mapmag.get(c)==null){
				System.out.println("Not Possible");
				break;
			}
			else if (mapmag.get(c)<mapnote.get(c)){
				System.out.println("Not Possible");
				break;
			}
		}
		

	}

}
