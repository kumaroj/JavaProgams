package stacksandqueues;

import java.util.Stack;

public class CheckTwoBracketExpression {

	public static void main(String[] args) {
		
		String A = "-(-(-(-a+b)-d+c)-q)";
		String B = "a-b-d+c+q";

		Stack<Character> stackA = new Stack<Character>();
		Stack<Character> stackB = new Stack<Character>();
		
		stackA = expression(A);
		stackB = expression(B);
		
		if (stackA.size()!=stackB.size()){
			System.out.println("Not matching");
		}
		
		while(!stackA.isEmpty() && !stackB.isEmpty()){
			char x = stackA.pop();
			char y = stackB.pop();
			
			if(x!=y){
				System.out.println("Not matching");
				break;
			}	
		}
		
	}
	
	public static Stack<Character> expression(String A){
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i<A.length(); i++){
			if(A.charAt(i)=='-' || A.charAt(i)=='+'){
				stack.push(A.charAt(i));
			}
			
			else if (A.charAt(i)=='('){
				
				if (!stack.isEmpty()){
					
					char x = stack.peek();
					if(x=='-'){
						for(int k = i+1; i<A.length(); k++){
							if(A.charAt(k)==')')
								break;
							else{
								if(A.charAt(k)=='+')
									stack.push('-');
								else if (A.charAt(k)=='-')
									stack.push('+');
								
								i++;
							 }
						}
					}
				}
			}
		}
		return stack;
	}

}
