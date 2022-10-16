package homeworkProblems;

import java.util.Arrays;

public class BeggarsTemple {

	public static void main(String[] args) {
		int A = 5;
		int sum =0;
		int [][]B = {
		                      {1, 3, 10},
		            		  {6, 9, 2},
		            		  {3, 5, 3},
		            		  {},
		            		  {},
		            		  {},
		            		};
	
		 int []beg = new int[A];
	     int []PS  = new int[A]; 
	     for(int i = 0 ;i<B[0].length; i++){
	         beg[B[i][0]-1]+= B[i][B[i].length-1];
	         int e = B[i][1];
	         if(e<A)
	            beg[e]+=(-B[i][B[i].length-1]);
	        
	     }
	     
	     for(int i = 0; i<beg.length; i++){
	         sum+=beg[i];
	         PS[i] = sum;
	     }
	     System.out.println(Arrays.toString(beg));
	     System.out.println(Arrays.toString(PS));
	}

}
