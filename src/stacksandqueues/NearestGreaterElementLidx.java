package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestGreaterElementLidx {

	public static void main(String[] args) {
		
		int []A = {4, 7, 3, 8};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]nge = new int[A.length];
		
		nge[0] = -1;
		
		stk.push(0);
		
		for(int i = 1; i<A.length; i++){
			
			while(!stk.isEmpty() && A[stk.peek()]<=A[i]){
				stk.pop();
			}
			
			if(stk.isEmpty()){
				nge[i] = -1;
			}
			else{
				nge[i] = stk.peek();
			}
			
			stk.push(i);
		}
		
		System.out.println(Arrays.toString(nge));

	}

}
