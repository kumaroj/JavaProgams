package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class Longestsubseq {

	public static void main(String[] args) {
		int A[]= {100, 4, 200, 1, 3, 2};
		int seq = 0;
		int maxseq = 0;
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0 ;i<A.length;i++){
			hs.add(A[i]);
		}

		for(int k:hs){
			if(!hs.contains(k-1)){
				int s = k;
				seq = 0;
				while(hs.contains(s)){
					s++;
					seq++;
				}
				if(seq>maxseq)
					maxseq = seq;
			}
			
		}
		
		System.out.println(maxseq);
	}

}
