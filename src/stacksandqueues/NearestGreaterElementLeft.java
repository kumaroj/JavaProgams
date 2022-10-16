package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterElementLeft {

	public static void main(String[] args) {
		
		int []A = {4, 7, 3, 8};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]ngl = new int[A.length];
		
		ngl[0] = -1;
		
		stk.push(A[0]);
		
		for (int i = 1; i<A.length ; i++){
			
			while(!stk.isEmpty() && A[i]>=stk.peek()){
				stk.pop();
			}
			 if (stk.isEmpty()){
				 ngl[i] = -1;
			}
			 else{
				 if(A[i]<stk.peek())
					 ngl[i]= stk.peek();
			 }
			stk.push(A[i]);
		}
		
		System.out.println(Arrays.toString(ngl));
	}

}
