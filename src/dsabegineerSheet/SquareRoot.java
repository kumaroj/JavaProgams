package dsabegineerSheet;

public class SquareRoot {

	public static void main(String[] args) {
		int N = 20;
		int sqrt = sqaureRoot(N);
		System.out.println(sqrt);
	}
	
	public static int sqaureRoot(int a ){
		
		int l = 1;
		int h = a;
		int mid = 0;
		int ans = 0;
		
		while(l<=h){
			mid = (l+h)/2;
			
			if (mid*mid == a){
				return mid;
			}
			else if (mid*mid < a){
				ans = mid;
				l = mid+1;
			}
			else{
				h = mid -1;
			}
			
		}
		
		return ans;
		
	}


}
