package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestElement {

	public static void main(String[] args) {
		
		int []A = {2,1,5,6,2,3};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]nse = new int[A.length];
		
		nse[0] = -1;
		
		stk.push(A[0]);
		
		for (int i = 1; i<A.length ; i++){
			
			while(!stk.isEmpty() && A[i]<=stk.peek()){
				stk.pop();
			}
			 if (stk.isEmpty()){
				nse[i] = -1;
			}
			 else{
				 if(A[i]>stk.peek())
					nse[i]= stk.peek();
			 }
			stk.push(A[i]);
		}
		
		
		System.out.println(Arrays.toString(nse));
	}

}
