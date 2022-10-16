package stacksandqueues;

import java.util.Stack;

public class RedundantBraces {

	public static void main(String[] args) {
		
	   String A = "(a+(a+b))";
	   int res = validBraces(A);
	   System.out.println(res);
		
	}

	public static int validBraces(String A){
		
		  Stack<Character> stk =  new Stack<Character>();
		     
		     for (int i = 0; i<A.length(); i++){
		         
		         if(A.charAt(i)=='(' || A.charAt(i)=='+' || A.charAt(i)=='-' || A.charAt(i)=='*' ||A.charAt(i)=='/'){
		             stk.push(A.charAt(i));
		         }
		         else {
		             
		             if (A.charAt(i)==')' ){
		                 
		                 if (stk.isEmpty()){
		                     return 1;
		                 }
		                 else{
		                      
		                      if (stk.peek()!='('){
		                          stk.pop();
		                          stk.pop();
		                      }
		                      else if (stk.peek()!=')')
		                         return 1;
		                 }
		             }
		         }
		     }
		     
		     if (stk.isEmpty()){
		         return 0;
		         
		     }
		     else if (!stk.isEmpty()){
		    	 if (stk.peek()!='(')
		    		 return 0;
		     }
		       
		     return 1;
	}
}
