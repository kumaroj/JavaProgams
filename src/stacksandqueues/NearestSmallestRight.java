package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestRight {

	public static void main(String[] args) {
		int [] A = {2,1,5,6,2,3};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]nse = new int[A.length];
		
		nse[A.length-1] = -1;
		
		stk.push(A[A.length-1]);
		
		for (int i = A.length-1; i>=0 ; i--){
			
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
