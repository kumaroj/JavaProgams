package recursion;

public class RemveConsecutiveDuplicates {

	public static void main(String[] args) {
		String s = "aazbbby";
		String ans =removeConsecutiveDuplicates(s , 0, "");
		System.out.println(ans);
	}

	
	public static String removeConsecutiveDuplicates(String s , int i , String s2) {
		
		if (i==s.length())
			return s2;
		else if (s2.length()==0)
			s2+=s.charAt(i);
		
		else if (s.charAt(i)!=s2.charAt(s2.length()-1))
			s2+=s.charAt(i);

		return removeConsecutiveDuplicates(s , i+1, s2);
	}
}
