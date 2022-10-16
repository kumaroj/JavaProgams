package stacksandqueues;

import java.util.Stack;

public class EvaluatePostfixExpression {

	public static void main(String[] args) {
		String[]A = {"5", "1", "2", "+", "4", "*", "+", "3", "-"};
		
		Stack<String> stk = new Stack<String>();
		
		for (int i = 0; i<A.length;i++){
			
			String c = A[i];
			
			switch(c)
			{
				case "+":
					if(!stk.isEmpty()){
						int x = Integer.valueOf(stk.pop());
						int y = Integer.valueOf(stk.pop());
						int sum = x+y;
						stk.push(String.valueOf(sum));
					}
					break;
				case "*":
					if(stk.size()!=0){
						int x = Integer.valueOf(stk.pop());
						int y = Integer.valueOf(stk.pop());
						int pro = x*y;
						stk.push(String.valueOf(pro));
					}
					break;
				case "-":
					if(stk.size()!=0){
						int x = Integer.valueOf(stk.pop());
						int y = Integer.valueOf(stk.pop());
						int sub = y-x;
						stk.push(String.valueOf(sub));
					}
					break;
				case "/":
					if(stk.size()!=0){
						int x = Integer.valueOf(stk.pop());
						int y = Integer.valueOf(stk.pop());
						int div = y/x;
						stk.push(String.valueOf(div));
					}
					break;
			  default:
				 stk.push(c);
					
			}
			
		}
		
		System.out.println(Integer.valueOf(stk.pop()));

	}

}
