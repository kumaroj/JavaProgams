package bitmanipulation;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ReverseBits {

	public static void main(String[] args) {
		
		Long num = new Long(3);
		
		//Long res = new Long(0);
		BigDecimal res = new BigDecimal(0);
		String x = "";
		long x1 = 0;
		for(int i = 0; i<32 ; i++){
			if((num&(1<<i))!=0){
				x1 = res.longValue();
				x1 = x1|(1<<(31-i));
				
			}
		}
		;
		System.out.println(x1);
	}

}
