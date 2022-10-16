package heaps;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToHeap {

	public static void main(String[] args) {
		int A[] = {57, 3, -14, -87, 42, 38, 31, -7, -28, -61};
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(57);
		al.add(3);
		al.add(-14);
		al.add(-87);
		al.add(42);
		al.add(38);
		al.add(31);
		al.add(-7);
		al.add(-28);
		al.add(-61);
		
		
		/*creatingMinHeap(A);
		System.out.println(Arrays.toString(A));
		System.out.println("***********************");*/
		//creatMinHeap(al);
		System.out.println(al);
		System.out.println("***********************");
		int sum =solve(al , 10);
		System.out.println(sum);
		
	}

	
	public static int[] creatingMinHeap(int[]A){
		int lindex = -1;
		int i = -1;
		
		while(lindex<A.length-1){
			lindex++;
			i = lindex;			
			while(i>0){
				int pindex = (i-1)/2;
				if(A[pindex]>A[i]){
					int temp = A[i];
					A[i] = A[pindex];
					A[pindex] = temp;
					i = pindex;
				}
				else
					break;
			}
		}
		return A;
	}
	
	public static void insertelementMinHeap(ArrayList<Integer>al , int k){
		int lindex = al.size()-1;
		int i = -1;
		
		lindex++;
		i = lindex;
		al.add(i, k);
		
		while(i>0){
			int pindex = (i-1)/2;
			if(al.get(pindex)>al.get(i)){
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
	
	public static void creatMinHeap(ArrayList<Integer>al){
		int lindex = -1;
		int i = -1;
		
		while(lindex<al.size()-1){
			lindex++;
			i = lindex;			
			while(i>0){
				int pindex = (i-1)/2;
				if(al.get(pindex)>al.get(i)){
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
	
	 public static int solve(ArrayList<Integer> A, int B) {
	        int sum = 0;
	        int counter = B;
	        creatMinHeap(A);
	        
	        System.out.println(A);
	        
	        while(counter!=0){
	            if(A.get(0)<0){
	             int k =  A.get(0)*(-1);
	             deleteElementMinHeap(A);
	             insertelementMinHeap(A, k);
	             counter--;
	            }
	            
	            else if (A.get(0)>=0){
	              if(counter%2==0)
	                break;
	             else
	                 {
	                    int k =  A.get(0)*(-1); 
	                    deleteElementMinHeap(A);
	                    insertelementMinHeap(A, k);
	                    break;
	                  }
	            }
	        }
	        
	        for(int i = 0; i<A.size(); i++ ){
	            sum+=A.get(i);
	        }
	        return sum;
	    }
	
	public static void deleteElementMinHeap(ArrayList<Integer> A){
		 int lelement = A.get(A.size()-1);
		 A.remove(A.get(A.size()-1));
		 A.add(A.size(),A.get(0));
		 A.remove(0);
		 A.add(0,lelement);
		 A.remove(A.size()-1);
         
         int i = 0;
         
         while(i<A.size()){
        	 int minindex = i;
        	 
        	 int lchildindex = 2*i+1;
        	 int rchildindex = 2*i+2;
        	 
        	
        		
        		if((lchildindex<A.size())&&(A.get(lchildindex)<A.get(minindex)))
            			 minindex = lchildindex; 
 
        		 if ((rchildindex<A.size())&&(A.get(rchildindex)<A.get(minindex)))
        			 minindex = rchildindex;
        		
        		 if(i==minindex)
        			 break;
        		 
        			int temp = A.get(i);
					int temp1 = A.get(minindex);
					A.remove(i);
					A.add(minindex, temp);
					A.remove(minindex-1);
					A.add(i,temp1);
				
					
			   		i = minindex;
        	 
        	 
		
         }
	}
}