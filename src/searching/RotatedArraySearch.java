package searching;

public class RotatedArraySearch {

	public static void main(String[] args) {
	/*	int A [] = {180, 181, 182, 183, 184, 187, 188, 189, 191, 192, 193, 194, 195, 196, 201,
				202, 203, 204, 3, 4, 5, 6, 7, 8, 9, 10, 14, 16, 17, 18, 19, 23, 26, 27, 28, 29,
				32, 33, 36, 37, 38, 39, 41, 42, 43, 45, 48, 51, 52, 53, 54, 56, 62, 63, 64, 67,
				69, 72, 73, 75, 77, 78, 79, 83, 85, 87, 90, 91, 92, 93, 96, 98, 99, 101, 102,
				104, 105, 106, 107, 108, 109, 111, 113, 115, 116, 118, 119, 120, 122, 123, 124,
				126, 127, 129, 130, 135, 137, 138, 139, 143, 144, 145, 147, 149, 152, 155,
				156, 160, 162, 163, 164, 166, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177 };*/
		int A[] = { 1, 7, 67, 133, 178 };

		int B = 1;
		int ans = -1;
		int l = 0;
		int h = A.length-1;
		
		if(A[0]<A[A.length-1])
	          ans = binarySearch(A , B , 0 , A.length-1);
		
        while(l<=h){
            int mid = (l+h)/2;
        
         if(A[mid]<A[mid-1]){
             ans  =  binarySearch(A, B , 0, mid-1);
             if(ans==-1)
             ans =  binarySearch(A, B , mid , A.length-1);
             System.out.println(ans);
          }
        
        else if(A[mid]>A[mid+1]){
          ans = binarySearch(A, B , 0, mid);
           if(ans==-1)
                ans = binarySearch(A, B , mid+1 , A.length-1);
           System.out.println(ans);    
        }
        else if(A[mid]<A[l]){
            h = mid-1;
            continue;
        }
            
        else{
            l= mid +1;
            continue;
        }
             
        }
        System.out.println(ans);
	}


	public static int binarySearch(int[]A, int B, int s , int e){
		int l = s;
        int h = e;
        int mid = 0;            
        while(l<=h){
            mid = (l+h)/2;
            if(A[mid]==B){
            	
                return mid;
            }
            else if(A[mid]>B)
                h = mid -1;
            else
                l = mid+1;
        }
        return -1;
	}
	
}
