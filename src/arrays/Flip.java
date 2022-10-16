package arrays;

public class Flip {

	public static void main(String[] args) {
		String A = "010";
	    char[]src =	A.toCharArray();
	    int []ans = new int[2];
	    int l = 0;
	    int r = 0;
	    
	   

	}

	
	public static int count(char[]a){
		int i = 0;
		int count = 0;
		while(i<a.length){
			if(a[i]=='1')
				count++;
			i++;
		}
		
		return count;
	}
}
