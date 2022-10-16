package arrays;

public class ClosetMinMax {

	public static void main(String[] args) {
		int A[] = {4, 4, 4, 4, 4};
		int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
        boolean lastmax = false;
        boolean lastmin = false;
        int currmin = 0;
        int currmax = 0;
        int minlength = Integer.MAX_VALUE;
        int length = Integer.MAX_VALUE;
        for(int i = 0; i<A.length; i++){
            if(A[i]>max_value){
                max_value = A[i];
            }
        }
        for(int i = 0; i<A.length; i++){
            if(A[i]<min_value){
                min_value = A[i];
            }
        }
        
         for(int i = 0; i<A.length; i++){
          if(A[i]==min_value){
              lastmin = true;
              currmin = i;
          }
          else if(A[i]==max_value){
              lastmax = true;
              currmax = i;
          }
          if(lastmin && lastmax){
              length = Math.abs(currmax - currmin);
          }
           if(length<minlength)
                minlength = length;
      
         }
        
         System.out.println(minlength+1);
	}

}
