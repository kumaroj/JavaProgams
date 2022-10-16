package homeworkProblems;

public class ConcatenatehreeNumbers {

	public static void main(String[] args) {
		int x = solve(10, 20 ,30);
		System.out.println(x);
	

	}
	 public  static int  solve(int A, int B, int C) {	        
	        String s1 = "";
	        if(A<B && A<C){
	            if(B>C)
	              s1 = A+""+C+""+B;
	            else
	              s1 = A+""+B+""+C;
	        }
	        else if(B<A && B<C){
	            if(A>C)
	              s1 = B+""+C+""+A;
	            else
	              s1 = B+""+A+""+C;
	        }
	        else if(C<A && C<B){
	             if(A>B)
	              s1 = C+""+B+""+A;
	            else
	              s1 = C+""+A+""+B;
	        }
	        
	        return Integer.parseInt(s1);
	    }
}
