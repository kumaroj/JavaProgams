package dsabegineerSheet;

public class Powerofnumber {

	public static void main(String[] args) {
		long res = Pow(9,6);
		System.out.println(res);
	}
	
	public static long Pow(int X, int N) {
		long power = 1;
		if (N==0)
			return 1;
		
		for (int i = 1; i<=N ; i++){
			power = power * X;
		}
		
		return power;
	}

}
