package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterElementridx {

	public static void main(String[] args) {
		
		int []A = {4, 7, 3, 8};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]ngr = new int[A.length];
		
		ngr[A.length-1] = -1;
		
		stk.push(A.length-1);
		
		for(int i = A.length-2; i>=0; i--){
			
			while(!stk.isEmpty() && A[stk.peek()]<=A[i]){
				stk.pop();
			}
			
			if(stk.isEmpty()){
				ngr[i] = -1;
			}
			else{
				ngr[i] = stk.peek();
			}
			
			stk.push(i);
		}
		
		System.out.println(Arrays.toString(ngr));
	}

}


