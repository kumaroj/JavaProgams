package strings;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String X = "aaaabaaa";
		
		String longestPalindrome = "";
		String palindrome = "";
		String reverse = "";
		
		
		for (int i = 0 ; i<X.length() ; i++){
			
			palindrome = palindrome + X.charAt(i);
			reverse = reverse + X.charAt(i);			
			
			for(int j = i+1; j<X.length() ; j++){
				
				palindrome = palindrome + X.charAt(j);
				reverse = X.charAt(j) + reverse;
				
				if(palindrome.equals(reverse))
					if (longestPalindrome.length()<palindrome.length())
					     longestPalindrome = palindrome;
			}
			palindrome = "";
			reverse = "";
		}
		
		System.out.println(longestPalindrome);
		
	}

}
