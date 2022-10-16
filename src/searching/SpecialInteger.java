package searching;

public class SpecialInteger {

	public static void main(String[] args) {
		int[]A = {1, 1000000000};
		int B = 1000000000;
		
		int l = 1; int h = A.length;
		int mid = 0;
		int ans = 0;
		
		while(l<=h){
			mid = (l+h)/2;
			int sum = subarraySum(A,mid);
			if (sum==-1){
				h = mid -1;
			}
			else if (sum==1){
				ans = mid;
				l = mid+1;
			}
			
		}
		
		System.out.println(ans);
	}
	
	public static int subarraySum(int[]A, int k){
		
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i = 0; i<k; i++){
			sum+=A[i];
		}
		maxsum = sum;
		for (int i = 1; i<=A.length-k; i++){
			sum = sum - A[i-1] + A[i+k-1];
			if (sum>maxsum)
				maxsum = sum;
		}
		
		return maxsum;
	}
	
	
	public static int subarraySum(int[]A, int k, int B){
		
		int maxsum = Integer.MIN_VALUE;
		int sum = 0;
		
		for (int i = 0; i<k; i++){
			sum+=A[i];
		}
		if (sum>B){
			return -1;
		}
		for (int i = 1; i<=A.length-k; i++){
			sum = sum - A[i-1] + A[i+k-1];
			if (sum>B)
				return -1;
		}
		
		return 1;
	}
	
}
