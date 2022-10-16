package maths;

public class AandBandModulo {

	public static void main(String[] args) {
		int ans = 0;
		
		int A = 16;
		int B = 4 ;
		
		int diff = Math.abs(A-B);
		
		int i = 1;
		
		while(i*i<=diff){
			if (diff%i==0){
				ans = Math.max(ans, diff/i);
			}	
			i++;
		}
		
		
  System.out.println(ans);
	}

}
