package dynamicpgm;

public class MinimumSquares {
	
	static  int minsqcount = Integer. MAX_VALUE;
	static int i= 1;
	static int ip= 12;
	int[]ans = new int[ip];
	public static void main(String[] args) {
	
	int x = countsquares(ip,i);
	System.out.println(x);
		    
		   
		   
	}
	
	/* public static  int countMinSquares(int A) {
	        if(A==1)
	          return 1;
	          
	        for (int i = 1; i*i<=A ; i++){
	           int sqcount = countsquares(A,i );
	           System.out.println(sqcount);
	           minsqcount  = Math.min(minsqcount,countsquares(A));
	          }
	    return minsqcount;
	}*/
	 
	public static  int countsquares(int A, int i){
         if(A<=0)
          return 0;

         for (; i*i<=A; i++){
             minsqcount  = Math.min(minsqcount, 1+countsquares(A-(i*i),i));
	          }
      return minsqcount;
    }
  
}
