package arrays;

public class BestInsertPosition {

	
	public static boolean elementfound = false;
	   
	public static void main(String[] args) {
		
		//int[]arr = {1, 5, 6, 7, 9, 10, 12 ,15, 16, 17, 19, 21 ,23 ,24 };
		int[]arr = {1, 3, 4, 8, 10, 11 ,12, 13, 15, 17, 21 ,23};

		int n = arr.length;
		int m = 14;
		int res = bestInsertPos(arr , n , m);
		System.out.println(res);
		
	}
	
	public static int bestInsertPos(int [] arr, int n, int m)
    {
		
        if (n==0)
          return 0;
        if (m>arr[n-1]){
            return n;
        }
        else if (m<=arr[0]){
            return 0;
        }
       int pos = binarySearch(arr , m);
        
       if (elementfound){
            return pos;
       } 
      else {
           int temp = arr[pos];
           if (m>temp)
               pos = pos+1;
         }
      return pos;
	}
    
    public static int binarySearch(int[]arr , int m) {
        
            int mid = 0;
            int s = 0;
            int e = arr.length-1;
            
            while (s<=e) {
                
                mid = (s+e)/2;
                
                if (arr[mid]==m) {
                    elementfound = true;
                    return mid;
                }
                else if (arr[mid]>m) {
                    e = mid-1;
                }
                else {
                    s = mid+1;
                }
            }
            
            return mid;
    }

}
