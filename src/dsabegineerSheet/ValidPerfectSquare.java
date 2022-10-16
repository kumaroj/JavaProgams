package dsabegineerSheet;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		
		int A = 7;
		
		boolean isperfect = isPerfectSqaure(A);
		System.out.println(isperfect);

	}
	
	public static boolean isPerfectSqaure(int a ){
		
		int l = 1;
		int h = a;
		int mid = 0;
		
		while(l<=h){
			mid = (l+h)/2;
			
			if (mid*mid == a){
				return true;
			}
			else if (mid*mid < a){
				l = mid+1;
			}
			else{
				h = mid -1;
			}
			
		}
		
		return false;
		
	}

}
