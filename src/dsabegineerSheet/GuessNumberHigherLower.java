package dsabegineerSheet;

public class GuessNumberHigherLower {

	public static void main(String[] args) {
	   int ans =	guessnumber(10, 6);
	   System.out.println(ans);

	}
	
	public static int guessnumber(int n,int pick){
		
		int l = 0;
		int h = n;
		int mid = 0;
		
		while(l<=h){
			
			mid = (l+h)/2;
			
			if (mid==pick)
				return pick;
			else if (mid>pick){
				h = mid-1;
			}
			else{
				l = mid+1;
			}
			
		}
		return -1;
	}

}
