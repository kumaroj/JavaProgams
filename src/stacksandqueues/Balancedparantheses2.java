package stacksandqueues;

import java.util.Stack;

public class Balancedparantheses2 {

	public static void main(String[] args) {
		
		String A = "))))))))";
		
		Stack<Character> stk = new Stack<Character>();
		
		for (int i = 0; i<A.length(); i++){
			
			if (A.charAt(i)=='(' || A.charAt(i)=='[' || A.charAt(i)=='{'){
				stk.push(A.charAt(i));
			}
			
			else{
				if(A.charAt(i)==']'){
					if(!stk.isEmpty()){
						char x = stk.pop();
					    if (x=='{' || x== '('){
					    	System.out.println("Not Balanced");
					    	break;
					    }
					}  	
				}
				else if (A.charAt(i)=='}'){
					if(!stk.isEmpty()){
						char x = stk.pop();
					    if (x=='[' || x== '('){
					    	System.out.println("Not Balanced");
					    	break;
					    }
					    	
					  }
				}
				else if (A.charAt(i)==')'){
					if(!stk.isEmpty()){
						char x = stk.pop();
					    if (x=='{' || x== '['){
					    	System.out.println("Not Balanced");
					    	break;
					    }
					    	
					}
				}
				else if (stk.isEmpty()){
					System.out.println("Not Balanced");
			    	break;
				}
				
			}
			
				
		}
			
		if(stk.empty())
			System.out.println("Balanced");
	}
}
