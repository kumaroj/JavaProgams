package hashing;
import java.util.HashMap;
import java.util.HashSet;
//import javafx.util.*;

public class Unique2Dpoints {

	public static void main(String[]args) {
		int [][]A = {{5, 6}, {2, 8}, {-1, -1}, {2, -3}, {2, 8}, {7, 7}, {2, -3}};

		int ans = solve(A);
		System.out.println(A.length);
		System.out.println(ans);

	

		
	}
	
	 public static int solve(int[][] A) {
		 
		 HashSet<Pair> hs =	new HashSet<Pair>();
		 for (int i = 0 ; i<A.length; i++){
			 	int x = A[i][0];
			 	int y = A[i][1];
		
				Pair p1 = new Pair(x, y);
				System.out.println(p1.hashCode());
				hs.add(p1);
			
			
	    }
		 
		 System.out.println(hs);
		 return hs.size();
	 }

	
	
   
}

/*class Pair {
	
    int key;
    int value;
   
   public Pair(int first, int second) {
       this.key = first;
       this.value = second;
   }
   
   public int getKey() {
       return key;
   }

   public int getValue() {
       return value;
   }


@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.key+","+this.value;
}
    */


   


