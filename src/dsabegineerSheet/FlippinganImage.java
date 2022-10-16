package dsabegineerSheet;

import java.util.Arrays;

public class FlippinganImage {

	public static void main(String[] args) {
		
		int [][]image = {{1,1,0},{1,0,1},{0,0,0}};
		 for (int i = 0; i<image.length; i++){
	            reverseArray(image[i]);
	        }
		 
		 for (int[]row:image){
			 System.out.println(Arrays.toString(row));
		 }
	}
	
	public  static void reverseArray(int[]A){
        
        int l = 0;
        int h = A.length-1;
        
        while(l<=h){
            int temp = A[l];
            A[l] = A[h];
            A[h] = temp;
            l++;
            h--;
        }
	}

}
