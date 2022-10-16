package bitmanipulation;

public class CountTotalSetBits {

	public static void main(String[] args) {
		int A = 4;
	    int setbitcount = 0;
        int num = 0;
        for(int i = 0; i<32; i++){
        int  j = (int)Math.pow(2,i);
        num = j;
        while(num<=A){
            setbitcount++;
            num+=(int)Math.pow(2,j);
         }  
        }
        System.out.println(setbitcount);
        
	}

}
