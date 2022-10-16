package stacksandqueues;

import java.util.Stack;

public class PassingGame {

	public static void main(String[] args) {
		
		int A = 10;
		int B = 23;
		int[]C = {86, 63, 60, 0, 47, 0, 99, 9, 0, 0};
		
		Stack<Integer> stk = new Stack<Integer>();
		stk.push(B);
		for(int i = 0; i<C.length; i++){
			
			if(C[i]!=0){
				stk.push(C[i]);
			}
			else{
				if(!stk.isEmpty()){
					if (C[i]==0){
						stk.pop();
					}
				}
			}
		}
		
		System.out.println(stk.pop());
		
	}

}
