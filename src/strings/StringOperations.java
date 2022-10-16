package strings;

public class StringOperations {

	public static void main(String[] args) {
		
		String  a = "AbcaZeoB";
		
		String s1 = a+a;
		
		for(int i = 0 ; i<s1.length(); i++){
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'
					||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
				s1=s1.replace(s1.charAt(i), '#');
			}
			s1=s1.replaceAll("([A-Z])", "");
			
		}
		System.out.println(s1);
		
	}

}
