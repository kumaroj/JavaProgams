package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmallestIndx {

	public static void main(String[] args) {
		
		int []A ={4, 5, 2, 10, 8};
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]nse = new int[A.length];
		
		nse[0] = -1;
		
		stk.push(0);
		
		for(int i = 1; i<A.length; i++){
			
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
