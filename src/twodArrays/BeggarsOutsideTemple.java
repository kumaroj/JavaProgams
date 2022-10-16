package twodArrays;

import java.util.Arrays;

public class BeggarsOutsideTemple {

	public static void main(String[] args) {
		
		
	int	A = 10;
	int[][]	B = {{1, 3, 10}, {6, 9, 2}, {3, 5, 3},{2, 8, 4},{6, 7, 5}};
	
	int []ans = new int[A];
	
	int sum = 0;
	
	for(int i = 0 ; i<B.length; i++){
		int l = B[i][0]-1;
		int r = B[i][1]-1;
		int p = B[i][2];
		
		if(l<A-1 && r==A-1){
			ans[l] =ans[l]+ p;
		}
		else if(l<A-1 && r<A-1){
			ans[l] = ans[l]+ p;
			ans[r+1] = ans[r+1]+(-p);
		}
		else if(l==r){
			ans[l] =ans[l]+ p;
		}
	}
	
	for(int i = 0; i<ans.length ; i++){
		sum = sum+ans[i];
		ans[i]= sum;
	}
	System.out.println(Arrays.toString(ans));
	}

}
