package CollectionsPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class setExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> hashSet = new HashSet<Object>();
		hashSet.add(100);
		hashSet.add(200);
		hashSet.add(300);
		hashSet.add(400);
		hashSet.add(500);
		hashSet.add(100);
		
		System.out.println(hashSet);
		hashSet.clear();
		hashSet.addAll(Arrays.asList(
	            new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		
		System.out.println(hashSet);
		for(Object value: hashSet) {
			System.out.print(value+" ");
		}
		
	}

}
