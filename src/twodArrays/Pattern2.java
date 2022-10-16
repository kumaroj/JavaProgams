package twodArrays;

public class Pattern2 {

	public static void main(String[] args) {
		
		int A = 3;
		int [][] pattern = new int[A][A];
		
		for(int i = 1; i<=A; i++){
			for(int j=A; j>=i;j--){
				pattern[i-1][j-1] = i;
			}
		}

		
		for(int i = 0; i<pattern.length;i++){
			for(int j = 0; j<pattern.length;j++){
				System.out.print(pattern[i][j]);
			}
			System.out.println();
		}
	}

}
