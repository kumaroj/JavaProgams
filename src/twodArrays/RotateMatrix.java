package twodArrays;

public class RotateMatrix {

	public static void main(String[] args) {
		
		int[][] A= {{1,2},{3,4}};
		transpose(A);
		for(int[]x:A){
			rotateArray(x);
		}
		
		for(int i = 0; i<A.length;i++){
			for(int j = 0; j<A[i].length;j++){
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}

	public static void transpose(int[][]A){
		
		for(int i = 0; i<A.length;i++){	
			for (int j = 0; j<A.length;j++){
				if(j>i && i!=j){
					int temp = A[i][j];
					A[i][j] = A[j][i];
					A[j][i] = temp;
					
				}
			}
		}
	}
	
	public static void rotateArray(int[]A){
		
		int i = 0;
		int j = A.length-1;
		
		while(i<=j){
			int temp = A[i];
			A[i] = A[j];
			A[j] = temp;
			i++;
			j--;	
		}
	}
	
}
