package arrays;

public class SubarraysLeastAvg {

	public static void main(String[] args) {
		int[]A = {20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11};
		int B = 9;
		float sum = 0;
        float avg = 0;
        float least_avg = Integer.MAX_VALUE;
        int index = 0;
        for(int i = 0 ;i<B ; i++){
            sum = sum+A[i];
        }
        avg = sum/B;
        least_avg = avg<least_avg?avg:least_avg;
        for(int i = 1 ;i<=A.length-B ; i++){
        	sum = sum - A[i-1]+A[i+B-1];
            avg = sum/B;
            if(avg<least_avg){
                least_avg = avg;
                index = i;
            }
        }
        System.out.println(index);
	}

}
