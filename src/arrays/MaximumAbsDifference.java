package arrays;

public class MaximumAbsDifference {

	public static void main(String[] args) {
		int []A = {86, 19, 46, 56, 14, 67, 19, 53, 15, 59};
		
		int max1 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		
		int max2 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int i = 0; i<A.length; i++){
			
			int x1 = A[i]+(i+1);
			int y1 = A[i]-(i+1);
			
			max1 = Math.max(max1, x1);
			min1 =  Math.min(min1, x1);
			
			max2 = Math.max(max2, y1);
			min2 = Math.min(min2, y1);
			
		}
		
		System.out.println(max1);
		System.out.println(min1);
		System.out.println(max2);
		System.out.println(min2);
		
		System.out.println(Math.max(max1-min1 , max2-min2));
	
	}

}
