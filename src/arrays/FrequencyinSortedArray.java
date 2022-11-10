package arrays;

public class FrequencyinSortedArray {

	public static void main(String[] args) {
		
		int []A = {2 ,2, 2, 2, 2 ,2 ,3};
		int x = 6;
		int pos = binarySearch(A , 0, A.length-1, x);
		
		if (pos==-1){
			System.out.println(0);
		}
		
		int i = 0;
		int j = A.length-1;
		
		
		while(i<pos){
			if (A[i]==x){
				break;
			}
			i++;
		}
		
		while(j>pos){
			if (A[j]==x){
				break;
			}
			j--;
		}
		int freq = j-i+1;
		System.out.println(freq);
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
