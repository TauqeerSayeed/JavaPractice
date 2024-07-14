package CollectionsPractice;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al=new ArrayList<Object>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add(1000);

		for(Object obj:al) {
			System.out.println(obj);
		 }

	}

}
