package stacksandqueues;

import java.util.Stack;

public class  DoubleCharacterTrouble {

	public static void main(String[] args) {
		
		String A = "abccbc";
		String temp = "";
		String ans = "";
		
		Stack<Character> stk = new Stack<Character>();	
		//stk.push(A.charAt(0));
		
		for (int i = 0; i<A.length();i++){
			if (stk.empty()){
				stk.push(A.charAt(i));
			}
			
			else if(stk.peek()==A.charAt(i)){
					 stk.pop();
			}
			else if(stk.peek()!=A.charAt(i)){
				stk.push(A.charAt(i));
			}	
		}
		
		while(!stk.isEmpty()){
			temp+=stk.pop();
		}
		
	for(int i = temp.length()-1; i>=0; i--){
		ans+=temp.charAt(i);
	}
	
	System.out.println(ans);
		
	}

}
