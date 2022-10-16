package leetcode;

public class Searchin2dMatrix {

	public static void main(String[] args) {
		
		int[][]A = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		int tgt = 3;
		boolean flag = false;
		
		for(int i = 0; i<=A.length-1 ; i++){
			flag =binarySearch(A[i], tgt, 0,A[i].length-1);
			if (flag)
				break;
			
		}

		System.out.println(flag);
	}
	
	public static boolean binarySearch(int A[], int b , int l , int h ){
		while(l<=h){
			
			int mid = (l+h)/2;
			
			if (A[mid]==b){
				return true;
			}
			else if (A[mid]>b){
				h = mid-1;
			}
			else
				l = mid+1;
			
		}
		return false;
	}
	

}
