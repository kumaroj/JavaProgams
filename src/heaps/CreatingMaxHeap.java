package heaps;

import java.util.ArrayList;

public class CreatingMaxHeap {
	
	


	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int product = 0;
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		if(al.size()>3){
			int i = 2;
			
			while(i<al.size()){
				
				for (int j = 0; j<=i; j++){
					temp.add(al.get(j));
				}
				creatMaxHeap(temp);
				product = temp.get(0)*temp.get(1)*temp.get(2);
				ans.add(product);
				product = 0;
				temp.clear();
				i++;
			}
			
			
		}
		else{
			product = al.get(0)*al.get(1)*al.get(2);
			ans.add(product);
		}
		
	   ans.add(0,-1);
	   ans.add(0, -1);
	   System.out.println(ans);

	}
	
	public static void creatMaxHeap(ArrayList<Integer>al){
		int lindex = -1;
		int i = -1;
		
		while(lindex<al.size()-1){
			lindex++;
			i = lindex;			
			while(i>0){
				int pindex = (i-1)/2;
				if(al.get(pindex)<al.get(i)){
					int temp = al.get(i);
					int temp1 = al.get(pindex);
					al.remove(i);
					al.remove(pindex);
					al.add(i-1,temp1);
					al.add(pindex, temp);
					i = pindex;
				}
				else
					break;
			}
		}
	}
	
	public static void findProductlargestNumbers(ArrayList<Integer>al){
		
		
		if(al.size()>3){
			int i = 2;
			
		
		}
		else{
			
		}
	}

}
