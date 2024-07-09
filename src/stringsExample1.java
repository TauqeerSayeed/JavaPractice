
public class stringsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a string 
		String name = "Mr.";
		String str = new String("Tauqeer Sayeed");
		System.out.println(name);
		System.out.println(str);

		//String length
		System.out.println("String length :"+ str.length());
		System.out.println("Chracter at position 3 is "+str.charAt(3));
		System.out.println("Substring " + str.substring(0,3));
		System.out.println("Substring " + str.substring(1));
		
		System.out.println("Concatenated string = " +name.concat(str));
		String s1 = "Learn Share Learn";
		System.out.println("Index of Share " + s1.indexOf("Share"));
		System.out.println("Index of a = " + s1.indexOf('a',9));
		
		Boolean out = "Tauqeer".equals("tauqeer");
		System.out.println("Checking Equality " + out);
		out = "Geeks".equals("Geeks");
		System.out.println("Checking Equality " + out);
		
		out = "Tauqeer".equalsIgnoreCase("tauqeer");
		System.out.println("Checking Equality" + out);

		int out1 = "Tauqeer".compareTo("Tauqeer");
		System.out.println("name = str " + out1);
		
		System.out.println("Changing to lower Case " +str.toLowerCase());
		System.out.println("Changing to upper Case " +str.toUpperCase());
		
		System.out.println("Trim the word " + str.trim()); //trim the trailing and leading spaces from string
		
		String s2 = "Tausif Alam";
		System.out.println("Original String " + s2);
		String s3 = s2.replace('a' ,'g') ;
		System.out.println("Replaced a with g -> " + s3);
	}

}
