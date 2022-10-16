package arrays;

public class DivisiblityBy8 {

	public static void main(String[] args) {
			String A = "452";
		 StringBuilder  sb = new StringBuilder();
	       sb.append(A);
	       sb.reverse();
	       int ans = 0;
	       int carry = 1;
	       for(int i = 1; i<=sb.length(); i++){
	           int x = Character.getNumericValue(sb.charAt(i-1));
	          
	           ans = ans+((x%8)*carry)%8;
	           ans = ans%8;
	           carry = (carry*10)%8;
	       }
	     
	    System.out.println(ans);

	}

}
