package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;



public class LeadersinArray {

	public static void main(String[] args) {
		List<Integer>elements = Arrays.asList(4,9,5, -2, -2, -4, -4, -5, 9);
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(elements.get(0));
		
		for (int i = 1; i<elements.size(); i++){
			if (elements.get(i)<stack.peek()){
				stack.push(elements.get(i));
			}
			
			else{
				while(!stack.isEmpty() && stack.peek()<=elements.get(i)){
					stack.pop();
				}
				stack.push(elements.get(i));
			}
		}
		Stack<Integer> tempstack = new Stack<Integer>();
		while(!stack.isEmpty()){
			tempstack.push(stack.pop());
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(!tempstack.isEmpty()){
			al.add(tempstack.pop());
		}
		//al.add(elements.get(elements.size()-1));
		
		System.out.println(al);
	}

}
