package arrays;

public class EquilibriumIndex {

	public static void main(String[] args) {
		//int [] A = {-7, 1, 5, 2, -4, 3, 0};
		int [] A = {1,2,3};
		
		int sum = 0;
		int [] PS = new int [A.length];
		
		int minidx = Integer.MAX_VALUE;
		int eqidx = Integer.MAX_VALUE;
		
		for(int i = 0; i<A.length; i++){
			sum = sum + A[i];
			PS[i] = sum;
		}
		
		for(int i = 0; i<A.length; i++){
			if (i ==0){
				if(PS[A.length-1]-PS[0]==0){
					System.out.println(i);
					break;
				}
			}
			else {
				if(PS[A.length-1]-PS[i]==PS[i-1]){
					eqidx = i;
					minidx = Math.min(eqidx, minidx);
				}
			}
		}
		
		System.out.println(minidx);
	}

}
