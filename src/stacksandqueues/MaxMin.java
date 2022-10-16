package stacksandqueues;

import java.util.Arrays;
import java.util.Stack;

public class MaxMin {

	public static void main(String[] args) {
		
		int A[] ={4, 7, 3, 8};
		
		int []maxs = new int[A.length];
		int []maxe = new int[A.length];
		int []mins = new int[A.length];
		int []mine = new int[A.length];
		
		
		maxs = nearestgreaterleft(A);
		maxe = nearestgreaterright(A);
		
		mins = nearestSmallestidxleft(A);
		mine = nearestsmallestidxright(A);
		
		
		System.out.println(Arrays.toString(maxs));
		System.out.println(Arrays.toString(maxe));
		System.out.println(Arrays.toString(mins));
		System.out.println(Arrays.toString(mine));
	     
	     int sum = 0;
	     int maxcont = 0;
	     int mincont = 0;
	     
	     for(int i = 0; i<A.length; i++){
	    	 
	    	 if(maxs[i]!=-1 && maxe[i] !=-1 ){
	    		 maxcont = (i-maxs[i])*(maxe[i]-i)*A[i];
	    	 }
	    	 
	    	 else if (maxs[i]==-1 && maxe[i] ==-1){
	    		 maxcont = (i+1)*(A.length-i)*A[i];
	    	 }
	    	 
	    	 else if (maxs[i]==-1 ){
	    		 maxcont = (i+1)*(maxe[i]-i)*A[i];
	    	 }
	    	 else if(maxe[i]==-1){
	    		 maxcont = (i-maxs[i])*(A.length-i)*A[i];
	    	 }
	    	 
	    	 if (mins[i]!=-1 && mine[i]!=-1){
    			 mincont = (i-mins[i])*(mine[i]-i)*A[i];
    		 }
    		 
    		 else if (mins[i]!=-1 && mine[i]==-1 ){
    		     mincont = (i-mins[i])*((A.length-1)-i+1)*A[i];
    		 }	
    		 else if(mine[i]!=-1 && mins[i]==-1){
    			 mincont =(i+1)*(mine[i]-i)*A[i];
    		 }
    		 else if(mins[i]==-1 && mine[i]==-1){
    			 mincont = (i+1)*((A.length-1)-i+1)*A[i];
    		 }

	    	sum = sum + (maxcont - mincont);
	    	maxcont = 0;
	    	mincont  = 0;
	     }
	     
	     
		System.out.println(sum);
		
	}
	
	public static int[] nearestgreaterleft(int[]A){
		Stack<Integer> stk = new Stack<Integer>();
		int[]ngl = new int[A.length];
		ngl[0] = -1;
		stk.push(0);
		for(int i = 1; i<A.length; i++){
			while(!stk.isEmpty() && A[stk.peek()]<=A[i]){
				stk.pop();
			}
			
			if(stk.isEmpty()){
				ngl[i] = -1;
			}
			else{
				ngl[i] = stk.peek();
			}
			stk.push(i);
		}
		return ngl;
	}
	
	public static int[] nearestgreaterright(int[]A){
		
		Stack<Integer> stk = new Stack<Integer>();
		int[]ngr = new int[A.length];
		ngr[A.length-1] = -1;
		stk.push(A.length-1);
		for(int i = A.length-2; i>=0; i--){
			while(!stk.isEmpty() && A[stk.peek()]<=A[i]){
				stk.pop();
			}
			
			if(stk.isEmpty()){
				ngr[i] = -1;
			}
			else{
				ngr[i] = stk.peek();
			}
			
			stk.push(i);
		}
		
		return ngr;
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
