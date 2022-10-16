package arrays;

import java.util.Arrays;

public class PickfrombothSides {

	public static void main(String[] args) {
		
	/*	int A[] = {-584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786,
				   -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 
				   982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, 
				  -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, 
				  -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628,
				  -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102,
				  -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 
				  505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187,
				 -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333 };*/
		int A[]= {2, 3, 4, 3, 4, 4, 1};
		int B = 6;
		
		int k = A.length-B;
		
		int minsum = Integer.MAX_VALUE;
		int maxxsum = 0;
		int tsum = 0;
		int ksum = 0;
		
		  for(int i = 0 ;i<A.length;i++){
			  tsum+=A[i];
	       }
		  
		  for(int i = 0; i<k ; i++){
			  ksum+=A[i];
		  }
		  
		  minsum =  Math.min(ksum, minsum);
		  for(int i = 1; i<=B;i++){
			  ksum = ksum - A[i-1] +A[i+k-1];
			  minsum = Math.min(ksum, minsum);
			 
		  }
		  
		  
		  System.out.println(minsum);
		  maxxsum = tsum - minsum;
		  
		   System.out.println(maxxsum);
		
		/*int psum = 0;
		int ssum = 0;
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
        int PS[] =  new int[A.length];
        int SS[] =  new int[A.length];
       
       for(int i = 0 ;i<A.length;i++){
    	   psum+=A[i];
    	   PS[i]=psum;
       }
       System.out.println(Arrays.toString(PS));
       for(int j = A.length-1; j>=0;j--){
    	   ssum+=A[j];
    	   SS[j]=ssum;
       }
       System.out.println(Arrays.toString(SS));
       for(int i =1; i<=A.length;i++){
    	   int k = B-i;
    	   if(k>=0){
    		   if(k==0){
        		   sum = PS[i-1];
        	   }
        	   else
        		   sum = PS[i-1]+SS[A.length-k];
    	   }
    	   else{
    		 sum =  SS[A.length-(i-B)]-PS[i-1];
    	   }
    	   System.out.println(sum);
    	   if(sum>max_sum)
    		   max_sum =sum;
    	   
       }
       System.out.println(max_sum);*/
		
		
		
		
	}

}
