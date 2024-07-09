
public class stringBuilder {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder("Tauqeer");
		StringBuilder s1 = new StringBuilder("Mr. ");
		s1.append(str);
		System.out.println(s1); //change in original string
		s1.reverse();
		System.out.println(s1);
		String s2 = s1.toString(); //String Builder toi string
		System.out.println(s2);

		System.out.println("Hashcode test of String:");  
        String str1="java";  
        System.out.println(str1.hashCode());  
        str1=str1+"programming";  
        System.out.println(str.hashCode());  
   
        System.out.println("Hashcode test of StringBuffer:");  
        StringBuffer sb=new StringBuffer("java");  
        System.out.println(sb.hashCode());  
        sb.append("programming");  
        System.out.println(sb.hashCode());
	}

}
