package strings;

import java.util.Arrays;

public class ChangeCharacter {

	public static void main(String[] args) {
		
		String A = "abcabbccd";
		int B = 4;
		 char[]arr = A.toCharArray();
	       int []cnt = new int[26];
	       int count = 0;
	       for(int i = 0 ; i<arr.length; i++){
	           int index = arr[i]-'a';
	           cnt[index]++;
	       }	       
	       System.out.println(Arrays.toString(cnt));
	       Arrays.sort(cnt);
	       for(int j = 0 ;j<26; j++){
	        
	               if(cnt[j]<=B && cnt[j]!=0){
	                   int diff = B-cnt[j];
	                   cnt[j]=0;
	                   B = diff;
	               }
	           
	       }
	       for(int k = 0 ; k<cnt.length; k++){
	           if(cnt[k]>0){
	               count++;
	           }
	       }
	       System.out.println(count);

	}

}
