package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckPalindrome {

	public static void main(String[] args) {
		  String A= "yzfbzbyyrurquqf";
		  int oddcount = 0;
		  int evencount = 0; 
	     HashMap<Character, Integer> hmap = new HashMap<Character , Integer>();
	     for(int i = 0 ; i<A.length(); i++){
	    	 if(hmap.containsKey(A.charAt(i))){
	    		 hmap.put(A.charAt(i), hmap.get(A.charAt(i))+1);
	    	 }
	    	 else
	    	 {
	    		 hmap.put(A.charAt(i), 1);
	    	 }
	     }
	     System.out.println(hmap);
	     
	     Set<Character> keys = hmap.keySet();
	     for(Character key:keys){
	    	 if(hmap.get(key)%2!=0){
	    		 oddcount++;
	    	 }
	    	 else{
	    		 evencount++;
	    	 }
	     }
	     
	     System.out.println(oddcount);
	     System.out.println(evencount);
	     if((keys.size()-1)==evencount && oddcount==1){
	    	 System.out.println("Its palindrome");
	     }
	     else if(keys.size()==evencount && oddcount==0){
	    	 System.out.println("Its palindrome");
	     }
	     
	  /*   for(int i = 0; i<keys.size();i++){
	    	 if(hmap.get(i)==1){
	    		 onecount++;
	    	 }
	    	 else if(hmap.get(i)%2==0){
	    		 evencount++;
	    	 }
	     }
	     */
	     /* if(hs.size()==(A.length()/2))
	       System.out.println("Its Palindrom");
	        
	      else if(hs.size()==((A.length()/2)+1))
	    	  System.out.println("Its Palindrome");
	        
	      else
	    	  System.out.println("Its not  Palindrome");*/
	    }

	}


