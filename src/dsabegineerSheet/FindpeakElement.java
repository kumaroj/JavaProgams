package dsabegineerSheet;

import java.util.ArrayList;

public class FindpeakElement {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(-17);
		al.add(75);
		al.add(34);
		al.add(16);
		al.add(-88);
		
		int  op = findpeakElement(al.size(),al);
		System.out.println(op);
	}
	
	public static int findpeakElement(int n ,ArrayList<Integer>a ){
		
	  int peak = 0;
		
	  if (a.size()==1)
		  return a.get(0);
	  
	  else if (a.get(0)>a.get(1))
		  return a.get(0);
	  
	  else if (a.get(a.size()-1)>a.get(a.size()-2))
		  return a.get(a.size()-1);
	  
	  int l = 0;
	  int h = n-1;
	  int mid = 0;
	  
	  while(l<=h){
		  
		  mid = (l+h)/2;
		  
		  if (mid==0 && a.get(mid)<a.get(mid+1)){
			  l = mid+1;
		  }
		  
		  else  if (a.get(mid)>a.get(mid-1) && a.get(mid)>a.get(mid+1)){
			  peak = a.get(mid);
			  return peak;
		  }
		  else if (a.get(mid)<a.get(mid+1)){
			  l = mid+1;
		  }
		  else if (a.get(mid)<a.get(mid-1)){
			  h = mid-1;
		  }
	  }
		return peak;
	}

}



/*9
13
-54 -44 -11 37 63 100 76 48 24 -2 -19 -32 -90 
5
-17 75 34 16 -88 
11
-90 57 85 88 64 53 48 1 -22 -86 -95 
15
95 82 74 60 54 31 28 6 -11 -21 -45 -46 -54 -76 -82 
5
-73 90 88 78 66 
5
8 29 66 -24 -90 
10
-3 96 63 57 12 3 -4 -44 -55 -66 
9
88 82 26 -5 -37 -49 -53 -80 -92 
7
-38 17 25 68 -2 -77 -96 */

