package dsabegineerSheet;

public class MatrixDaigonalSum {

	public static void main(String[] args) {
		
		
	}
	
	
	public static int daigonalSum(int[][] mat){
		int i = 0;
        int j = 0; 
        int primarysum = 0;
        int secondrysum = 0;
        
        while(i<mat.length && j<mat[0].length){
            primarysum+=mat[i][j];
            i++;
            j++;
        }
        
        i = 0;
        j = mat[0].length-1;
        
       while(i<mat.length && j>=0){
            secondrysum+=mat[i][j];
            i++;
            j--;
        }
        
        int daigsum = primarysum + secondrysum;
        if (mat.length%2!=0)
           return daigsum - mat[mat.length/2][mat.length/2];
        
        return daigsum;
        
	} 

}
