package maths;

public class PrimeSubsequences {

	public static void main(String[] args) {
		
		int A[] = {1,2,3};
		int count = 0;
		int primesubseq = 0;
		
		for (int i = 0; i<A.length ; i++){
			if (isPrime(A[i])){
				count++;
			}
		}
		
		primesubseq = (int)Math.pow(2, count);
		
		System.out.println(primesubseq-1);
	}
	
	public static boolean isPrime(int N){
		
		if (N==1)
			return false;
		
		for (int i = 2; i*i<=N ; i++){
			
			if (N%i==0){
				return false;
			}
		}
		
		return true;
	}

}
