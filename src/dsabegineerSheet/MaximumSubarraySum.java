package dsabegineerSheet;

public class MaximumSubarraySum {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 7 ,-4 ,3, 2 ,-10, 9, 1};
		int n = 9;
		
		long res = maxSubarraySum(arr, n);
		System.out.println(res);
	}
	
	public static long maxSubarraySum(int[] arr, int n) {
		
		long sum = 0;
		long maxsum = 0;
		
		for (int i = 0; i<n; i++ ){
			
			sum = sum + arr[i];
			maxsum = Math.max(maxsum, sum);
			
			if (sum<0)
				sum = 0;
		}
		
	  return maxsum;
	}
}
