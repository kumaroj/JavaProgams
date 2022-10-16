package leetcode;

import java.util.Stack;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		
		int A[] = {7,1,5,3,6,4};
		
		int max_profit  = 0;
		int profit  = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(A[0]);
		
		for (int i = 1 ; i<A.length; i++){
			if(A[i]>stack.peek()){
				profit = A[i] - stack.peek();
				max_profit = Math.max(max_profit, profit);
			}
			else{
				stack.pop();
				stack.push(A[i]);
			}
		}
		System.out.println(max_profit);
	}

}
