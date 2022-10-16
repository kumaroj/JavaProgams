package twodArrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] A= {{1,2},{3,4}};
		
		
		for(int i = 0; i<A.length;i++){	
			for (int j = 0; j<A.length;j++){
				if(j>i && i!=j){
					int temp = A[i][j];
					A[i][j] = A[j][i];
					A[j][i] = temp;
					
				}
			}
		}
		
		for(int i = 0; i<A.length;i++){
			for(int j = 0; j<A[i].length;j++){
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}

}
