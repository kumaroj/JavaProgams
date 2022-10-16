package bitmanipulation;

public class SmallestXor {

	public static void main(String[] args) {
		
		int A = 4;
		int B = 6;
		int x = 0;
		int setbitscount = B;
		int msb = 0;
		for(int i =31; i>=0; i--){
			if((A&(1<<i))!=0){
				if(setbitscount>0){
					x = x|(1<<i);
					setbitscount--;
				}
				System.out.println(x);
			}
		}

		for(int i =0 ; i<32; i++){
			if((x&(1<<i))==0 && setbitscount>0){
				x = x|(1<<i);
				setbitscount--;
			}
		}
		System.out.println(x);
	}

}
