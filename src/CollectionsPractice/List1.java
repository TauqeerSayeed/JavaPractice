package CollectionsPractice;
import java.util.*;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1 = new ArrayList<Integer>();
		
		// adding in list
		l1.add(5);
		l1.add(7);
		l1.add(9);
		System.out.println(l1);
		
		// adding at particular index
		l1.add(0,3);
		System.out.println(l1);
				
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(7);
		l2.add(1);
		
		l1.addAll(0,l2); //addAll
		System.out.println(l1);
		
		l1.remove(1); //remove particular index
		System.out.println(l1);
		
		System.out.println(l1.get(1)); //fetch value at index 1
		
		l1.set(0, 90); //set element update value
		System.out.println(l1);
		
		System.out.println(l1.size());
		l1.add(6,90);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(90)); // last index
		System.out.println(l1.indexOf(90)); //first index
		l1.remove(0); //remove index value
		l1.remove(l1.indexOf(5)); // remove value
		System.out.println(l1);
		
		boolean isPresent = l1.contains(990);
		System.out.println(isPresent);
		
		
	}

}
