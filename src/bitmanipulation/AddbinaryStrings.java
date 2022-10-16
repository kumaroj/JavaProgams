package bitmanipulation;

public class AddbinaryStrings {

	public static void main(String[] args) {
		String a = "101";
		String b = "111";
		
		int l1 = a.length();
		int l2 = b.length();
		int diff = 0;
		StringBuilder res = new StringBuilder();
		int carry = 0;

		if(l1>l2){
			diff = l1-l2;
			for(int i = 0; i<diff; i++){
				b='0'+b;
			}
	
		}
		else if (l2>l1){
			diff = l2-l1;
			for(int i = 0; i<diff; i++){
				a='0'+a;
			}
		
		}
		
		for(int i = a.length()-1 ; i>=0;i--){
			int s1= Integer.valueOf(a.charAt(i))-48;
			int s2 = Integer.valueOf(b.charAt(i))-48;
			int x =s1+s2+carry;
			carry = x/2;
			res=res.append((x%2));
			}	

		if(carry==1)
		  res=res.append((carry));
		//res = res.reverse().toString();
		System.out.println(res);
	}

}
