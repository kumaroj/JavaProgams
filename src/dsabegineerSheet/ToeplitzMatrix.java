package dsabegineerSheet;

public class ToeplitzMatrix {

	public static void main(String[] args) {
		
		//int[][]matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
		
		int[][]matrix = {{84}};
		
		boolean Toeplitzrow = false;
		boolean Toeplitzcol = false;
		
		for (int j = 0; j<matrix[0].length; j++){
			Toeplitzcol = daigonalelements(matrix, 0, j);
			if (!Toeplitzcol)
			 break;
		}
		
		for (int i = 1; i<matrix.length;i++){
			Toeplitzrow = daigonalelements(matrix, i, 0);
			if (!Toeplitzrow)
				 break;
		}
		
		if(Toeplitzcol && Toeplitzrow )
			System.out.println("Daigonal Elements are equal");
	}
	
	
	public static boolean daigonalelements(int[][]A , int row , int col){
		
		while(row<A.length-1 && col<A[0].length-1){
			if(A[row][col]!=A[row+1][col+1])
				return false;
			row++;
			col++;
		}
		
		return true;
	}

}
