package contest;

public class Numberofsubarrays1 {

	public static void main(String[] args) {
		
		//ip String s = "111";
		//op '1' , '11' '111' op = 3
		//No of substrings starting and ending with 1.
		
		String s = "00100101";
		
		int subscount = 0 ;
		int j = s.length()-1;
		
		for (j = s.length()-1; j>=0; j--){
			if(s.charAt(j)!='0'){
				break;
			}
		}
		
		j--;
		int onecount = 1;
		
		while(j>=0){
			if (s.charAt(j)=='1'){
				subscount+=onecount;
				onecount++;
			}
			j--;
		}
		
		System.out.println(subscount);
	}

}
