package hashing;

import java.util.ArrayList;

public class SubarraywithSum {

	public static void main(String[] args) {
		ArrayList<Integer> op =  new ArrayList<Integer>();
		 int A[] = {12, 1, 50, 39, 32, 23, 22, 44, 17, 5, 9, 12, 10, 
				 	50, 26, 5, 23, 38, 31, 5, 34, 8, 21, 11, 
				 	24, 44, 18, 19, 6, 31, 3, 47, 5, 2, 33, 44, 14, 9};
		 int B = 58;
		 int k = 0;
		 int i =0;
	     int sum = 0;
	     for(;i<A.length;i++){
	          sum+=A[i];
	          while(sum>B && k<=i){
	              sum=sum-A[k];
	              k++;
	              if(sum==B){
	                  for(int s=k ; s<=i; s++){
	                      op.add(A[s]);
	                  }
	                  System.out.println(op);
	                  break;
	              }
	          }
	          if (sum==B){
	        	  for(int s=k ; s<=i; s++){
                      op.add(A[s]);
                  }
	        	  System.out.println(op);
                  break;
	          }
	      }
	      op.add(-1);
	    System.out.println(op);
	}

}
