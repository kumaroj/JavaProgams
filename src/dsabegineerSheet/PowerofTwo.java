package dsabegineerSheet;

public class PowerofTwo {

	public static void main(String[] args) {
		int N = 16;
		System.out.println(isPowerOfTwo(N));
	}

	
	public static boolean isPowerOfTwo(int n) {
		
		if (n%2!=0 && n!=1)
			return false;
		
		while(n!=1){
			if (n%2!=0){
				return false;
			}
			n =n/2;

		}
		return true;
	}
}
