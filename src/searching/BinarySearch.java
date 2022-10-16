package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int A[] = { 3, 4, 18, 19, 20, 27, 28, 31, 36, 42, 44, 71, 72, 75, 82, 86, 88, 97,
				100, 103, 105, 107, 110, 116, 118, 119, 121, 122, 140, 141, 142, 155, 157,
				166, 176, 184, 190, 199, 201, 210, 212, 220, 225, 234, 235, 236, 238, 244, 
				259, 265, 266, 280, 283, 285, 293, 299, 309, 312, 317, 335, 341, 352, 354, 
				360, 365, 368, 370, 379, 386, 391, 400, 405, 410, 414, 416, 428, 433, 437, 
				438, 445, 453, 457, 458, 472, 476, 480, 485, 489, 491, 493, 501, 502, 505, 
				510, 511, 520, 526, 535, 557, 574, 593, 595, 604, 605, 612, 629, 632, 633, 
				634, 642, 647, 653, 654, 656, 658, 686, 689, 690, 691, 709, 716, 717, 737, 
				738, 746, 759, 765, 775, 778, 783, 786, 787, 791, 797, 801, 806, 815, 820, 
				822, 823, 832, 839, 841, 847, 859, 873, 877, 880, 886, 904, 909, 911,
				917, 919, 937, 946, 948, 951, 961, 971, 979, 980, 986, 993 
				};
		int B = 902;
	int pos =	binarySearch(A, B);
	System.out.println(pos);

	}
	
	public static int binarySearch(int[]A, int B){
		int l = 0;
        int h = A.length-1;
        int mid = 0;
        int ans = 0;
        if(B<A[0]){
            System.out.println(0);
        }
        else if (B>A[A.length-1])
        {
        	System.out.println(A.length);
        }
        while(l<=h){
            mid = (l+h)/2;
            
            if(A[mid]==B){
            	
                return mid;
            }
            else if(A[mid]>B)
                h = mid -1;
            else
                l = mid+1;
            System.out.println(A[mid]);
        }
        if(A[mid]>B)
          ans =  mid-1;
          else
           ans = mid +1 ;
        return ans;
	}

}
