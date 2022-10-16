package stacksandqueues;

import java.util.Stack;

public class Balancedparantheses {

	public static void main(String[] args) {
		String A = "))((()(())";
	
		Stack<Character> stk = new Stack<Character>();
		
		for (int i = 0; i<A.length();i++){
			
		if(A.charAt(i)==')'){
			if(!stk.isEmpty()){
				stk.pop();
			}
			else
				System.out.println("Not balanced");
		}
		else {
			stk.push(A.charAt(i));
		}
			
		}
		
		if(stk.empty())
			System.out.println("Balanced");
		
	}

}
