package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestidxright {

	public static void main(String[] args) {
		
		int []A ={4, 5, 2, 10, 8};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]nse = new int[A.length];
		
		nse[A.length-1] = -1;
		
		stk.push(A.length-1);
		
		for(int i = A.length-2; i>=0; i--){
			
			while(!stk.isEmpty() && A[stk.peek()]>=A[i]){
				stk.pop();
			}
			
			if(stk.isEmpty()){
				nse[i] = -1;
			}
			else{
				nse[i] = stk.peek();
			}
			
			stk.push(i);
		}
		
		System.out.println(Arrays.toString(nse));
	}

}
