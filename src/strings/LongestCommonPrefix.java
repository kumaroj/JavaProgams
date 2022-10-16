package strings;

public class LongestCommonPrefix {

	public static void main(String[] args) {
	/*	String[]A = {"aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 
					"aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", 
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 
					"aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", 
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 
					"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};*/
		
		String[]A = {"abcd", "aze"};
		int minlength =A[0].length();
		int length =0;
		int index = 0;
		String commonprefix = "";
		int var = 0;
		boolean flag = false;
		
		for(int i = 1; i<A.length; i++){
			length = A[i].length();
			if(length<minlength){
				minlength = length;
				index = i;
			}
		}
		
		
		for(int i =0 ; i<A[index].length();i++){
			for(int j = 0; j<A.length;j++){
				if(A[j].charAt(var)!=A[index].charAt(var))
					flag = true;
				else{
					flag = false;
					break;
				}
			}	
			if(flag){
				commonprefix+=A[index].charAt(var);
				var++;
			}	
			else
				break;
		}
		System.out.println(commonprefix);

	}

}
