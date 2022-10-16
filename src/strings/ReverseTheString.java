package strings;

public class ReverseTheString {

	public static void main(String[] args) {
		String x = "the sky is   blue";
		String y ="";
		x=x.replaceAll("\\s", ",");
		String[]arr = x.split(",");
		for(int i = arr.length-1; i>=0 ;i--){
			if(!arr[i].isEmpty())
			y+=arr[i]+" ";
		}
		y=y.trim();
		System.out.println(y);
	}

}
