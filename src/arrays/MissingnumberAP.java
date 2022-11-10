package arrays;

public class MissingnumberAP {

	public static void main(String[] args) {
		int []arr = {5,10,20,25};
		
		int ft = arr[0];
		int lt = arr[arr.length-1];
		
		int d = (lt-ft)/(arr.length);
		System.out.println(d);
		
		for (int i = ft+d ; i<=lt ; i=i+d){
			int num = binarySearch(arr, 0, arr.length-1, i);
			if( num==-1){
				System.out.println(i);
				break;
			}
			
		}
	

	}
	
	
public static int binarySearch(int[] arr, int s , int e, int x){
		
		int mid = 0;
		
		while(s<=e){
			mid = (s+e)/2;
			
			if (arr[mid]==x){
				return mid;
			}
			else if (arr[mid]>x){
				e = mid-1;
			}
			else
				s = mid+1;
		}
		
		return -1;
	}

}
