package sorting;

import java.util.Arrays;

public class UniqueElements {

	public static void main(String[] args) {
		int []A = {1,1,3};
		boolean  flag = false;
		int count = 0;
		Arrays.sort(A);
		while(flag == false){
			for(int i = 0 ; i<A.length-1; i++){
				if(A[i]==A[i+1]){
					A[i+1]++;
					count++;
					flag = true;
				}
			}
			if(flag)
				flag = false;
			else
				flag = true;
		}
		System.out.println(Arrays.toString(A));
		System.out.println(count);
	}

}
