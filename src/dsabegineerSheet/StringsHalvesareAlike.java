package dsabegineerSheet;

public class StringsHalvesareAlike {

	public static void main(String[] args) {
		
		String ip = "book";
		
	   ip = ip.toLowerCase();
	   String h1 = ip.substring(0, (ip.length()/2));
	   String h2 = ip.substring(ip.length()/2, ip.length());
	   
	  if ( vowelcount(h1) ==  vowelcount(h2)){
		  System.out.println("Its Alike");
	  }
	  else
		  System.out.println("Its  not Alike");
	   
	  
	}
	
	public static int vowelcount(String s){
		
		int count = 0;
		
		for (int i = 0; i<s.length(); i++){
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' 
					|| s.charAt(i)=='o' || s.charAt(i)=='u' ){
				
				count++;
			}
		}
		return count;
	}

}
