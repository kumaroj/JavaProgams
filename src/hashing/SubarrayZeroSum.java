package hashing;

import java.util.HashMap;

public class SubarrayZeroSum {

	public static void main(String[] args) {
		int[]A ={15,-2, 2,-8,1,7,10};
		int[]PS = new int[A.length];
	    int sum = 0;
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = 0; i<A.length; i++){
	       sum+=A[i];
	       PS[i]=sum;
	     }
		

	}

}
