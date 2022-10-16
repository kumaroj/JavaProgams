package dsabegineerSheet;

public class NegativenumbersinSortedMatrix {

	public static void main(String[] args) {
		
		int [][]mat = {{3,2,1},{0,-1,-2},{-3,-4,-5}};
		int negativecount = 0;
		
		for (int i = 0; i<mat[0].length; i++){
			for (int j = 0; j<mat.length ; j++){
				
				if (mat[j][i]<0){
					negativecount = negativecount + (mat.length -i);
					break;
				}
				
			}
		}
		
		System.out.println(negativecount);

	}

}
