package bitmanipulation;

public class SingleNumberII {

	public static void main(String[] args) {
		 	int[]A =  {0,0,0,1};
		 	int num = 0;
		 	int countbit = 0;
		 	for(int i = 0; i<32; i++){
		 		for(int j = 0 ; j<A.length; j++){
		 			if((A[j]&(1<<i))!=0){
		 				countbit++;
		 			}
		 		}
		 		if(countbit%3!=0)
		 			num = ( num|(1<<i));
		 		countbit = 0;
		 	}
		 System.out.println(num);	
	}

}
