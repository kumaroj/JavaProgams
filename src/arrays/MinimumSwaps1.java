package arrays;

public class MinimumSwaps1 {

	public static void main(String[] args) {
		int [] A = {52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84,
				27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27,
				74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70};
				
		
		//int [] A = { 5, 17, 100, 11};
		int B = 19;
		
		int minswap = Integer.MAX_VALUE;
		int count = 0;
		int badcount = 0;
		
		for (int i = 0; i<A.length; i++){
			if (A[i]<=B)
				count++;
		}

		if (count == 0)
			System.out.println(0);
		else if (count == 1){
			System.out.println(0);
		}

	 
	 int l = 0;
	 int r = count-1;
	 
	 while(l<=A.length-count && r<A.length){
		 badcount = 0;
		for(int i =l ; i<=r ;i++){
			if (A[i]>B){
				badcount++;
			}
		}
		 l++;
		 r++;
		 minswap = Math.min(minswap, badcount);
	 }
		
		System.out.println(minswap);

	}

}
