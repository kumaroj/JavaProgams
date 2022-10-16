package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class MaximumRectangle {

	public static void main(String[] args) {
		
		int[][]A = {{0, 1, 1},{1, 0, 0},{1, 0, 0},{1, 0, 0},{1, 0, 0},{1, 1, 1},{0, 1, 0}};
		
		Stack<Integer> stack = new Stack<Integer>();
		int[]X = new int[A.length];
		int max_size = 0;
		int size = 0;
		
		int []nslidx = new int[A.length];
		int []nsridx = new int[A.length];
		
		
		
		for(int i = 0; i<A.length;i++){
			
			 max_size = 0;
			 size = 0;
			for(int j = 0; j<A[i].length; j++){
				
				if(A[i][j]==1){
					size++;
					max_size = Math.max(size, max_size);
				}
				else{
					size = 0;
				}
			}
			
			X[i]= max_size;
		}
			
		System.out.println(Arrays.toString(X));

		nslidx = nearestSmallestidxleft(X);
		nsridx = nearestsmallestidxright(X);
		
		
		int area = 0;
		int max_area = Integer.MIN_VALUE;
		int width = 0; 
		
		for (int i = 0 ; i<X.length; i++){
			if (nslidx[i]==-1){
			 width = i;
			}
			else if (nsridx[i]==-1)	{
				width =A.length-i;
			}
			else{
				 width = (i-nslidx[i]) + (nsridx[i]-i) -1;
			}
			
			area = (width*X[i]);
			max_area = Math.max(max_area, area);
			width = 0;
		}
		
		System.out.println(max_area);
	}
	
	
	public static  int[] nearestSmallestidxleft(int[]A){
		
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
		return nse;
	}
	
	public static int[] nearestsmallestidxright(int[]A){
		
		Stack<Integer> stk = new Stack<Integer>();
		
		int[]nse = new int[A.length];
		nse[A.length-1] = -1;
		stk.push(A.length-1);
		
		for(int i = A.length-2; i>=0; i--){
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
		return nse;
	}
	
	
	

}
