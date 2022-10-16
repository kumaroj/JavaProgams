package dsabegineerSheet;

public class SpecialPositionBinaryMatrix {

	public static void main(String[] args) {
		int [][]mat = {{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,1},{0,0,0,0,1,0,0,0},{1,0,0,0,1,0,0,0},{0,0,1,1,0,0,0,0}};
		int spscount = 0;
		/* int specialrow = 0;
	      int specialcol = 0;
	        
	        int sumrow = 0;
	        int sumcol = 0;
	        
	        for (int i = 0; i<mat.length; i++){
	            for (int j = 0; j<mat[i].length; j++){
	                sumrow+=mat[i][j];
	            }
	            if(sumrow==1)
	                specialrow++;
	            sumrow = 0;
	        }
	        
	         for (int i = 0; i<mat[0].length; i++){
	            for (int j = 0; j<mat.length; j++){
	                sumcol+=mat[j][i];
	            }
	            if(sumcol==1)
	                specialcol++;
	            sumcol = 0;
	        }
		
		
	         
	         System.out.println(Math.min(specialrow, specialcol));*/
		
		
		
		for (int i = 0; i<mat.length; i++){
			int idx = colidx(mat,i);
			if(idx!=-1){
				int onecount = findoneCount(mat,idx);
				if (onecount ==1)
					spscount++;
			}
		}
		
		System.out.println(spscount);
	}
	
	
	
	
	public static int colidx(int[][]mat,int row){
		int colidx = -1;
		int count = 0;
		for (int j = 0;j<mat[0].length; j++){
			if (mat[row][j]==1){
				colidx = j;
				count++;
			}
		}
		if (count==1){
			return colidx;
		}
		return -1;
	}
	
	
	public static int findoneCount(int[][]mat,int colidx){
		int onecount = 0;
		for (int i = 0;i<mat.length; i++){
			if (mat[i][colidx]==1){
				onecount++;
			}
		}
		
		return onecount;
		
	}

}
