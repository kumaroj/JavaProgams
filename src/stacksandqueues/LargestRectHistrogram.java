package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectHistrogram {

	public static void main(String[] args) {
		
		int A[] = {90, 58, 69, 70, 82, 100, 13, 57, 47, 18};
		
		int []nslidx = new int[A.length];
		int []nsridx = new int[A.length];
		
		
		nslidx = nearestSmallestidxleft(A);
		nsridx = nearestsmallestidxright(A);
		
		System.out.println(Arrays.toString(nslidx));
		System.out.println(Arrays.toString(nsridx));
		
		int area = 0;
		int max_area = Integer.MIN_VALUE;
		int width = 0;

	    for (int i = 0 ; i<A.length; i++){
	    
	    	if (nslidx[i]==-1 && nsridx[i]==-1 ){
	    		width = 1;
	    	}
	    	
	    else if (nslidx[i]==-1){
		       width = (nsridx[i]-i)+i ;
		   }
	       else if (nsridx[i]==-1)	{
			width =A.length-nslidx[i];
		   }
		   
	      else{
			 width = (i-nslidx[i]) + (nsridx[i]-i) -1;
		}
		
		area = (width*A[i]);
		max_area = Math.max(max_area, area);
		width = 0;
	}
		
		
		/*for (int i = 0 ; i<A.length; i++){
			int width = (i-nslidx[i]) + (nsridx[i]-i) -1;
			area = (width * A[i]);
			max_area = Math.max(max_area, area);
		}*/
		
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
