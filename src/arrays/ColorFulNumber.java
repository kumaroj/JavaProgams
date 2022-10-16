package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class ColorFulNumber {

	public static void main(String[] args) {
		int A = 23;
		int product = 1;
		boolean flag = false;
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer>set = new HashSet<Integer>();
		while(A!=0){
			int mod = A%10;
			list.add(mod);
			A = A/10;
		}		
		for(int i = 0; i<list.size(); i++){
			product = 1;
			for(int j = i ;j <list.size();j++){
				product = product*list.get(j);
				if(!set.add(product)){
					flag = true;
					break;
				}
			}
		}
		if(flag)
		  System.out.println(" Not ColorFull");
		else
			  System.out.println("ColorFull");
	}

}
