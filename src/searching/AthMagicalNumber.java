package searching;

public class AthMagicalNumber {

	public static void main(String[] args) {
		
		int A = 33488383;
		int B = 565;
		int C = 29473;
		
		int ans = 0;
		int l = 1;
		int h = A*Math.min(B, C);
		int mid = 0;
		int lcm = findLCM(B, C);
		
		
		while(l<=h){
			
			mid = l+(h-l)/2;
			
			int nums = countmagicalnumbers(mid, B, C , lcm);

			if (nums >= A){
				ans = mid;
				h = mid-1;
			}
			else
			 {
				l = mid+1;
			 }
			
		}
		
		System.out.println(ans);
 }
	
	public static int findLCM(int a , int b){
		
		int num1 = Math.min(a, b);
		int num2 = Math.max(a, b);
		int hcf = 0;
		int lcm = 0;

		while(num1!=0){
			int temp = num2%num1;
			num2 = num1;
			hcf = num1;
			num1 = temp;
		}
		
		lcm = (a*b)/hcf;
		return lcm;
	}
	
	public static int countmagicalnumbers(int h , int b , int c, int lcm){
		
		int x = (h/b + h/c) - (h/lcm);
		return x;
	}
}
