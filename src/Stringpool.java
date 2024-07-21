
public class Stringpool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Tauqeer";  
		String s2 = "Tauqeer";  
		String s3 = new String("Tauqeer");  
		String s4 = new String("Tauqeer").intern();  
		System.out.println((s1 == s2)+", String s1 and s2 are equal."); 
		System.out.println((s1 == s3)+", String s1 and s3 are not equal."); 
		System.out.println((s1 == s4)+", String s1 and s4 are equal."); 

	}

}
