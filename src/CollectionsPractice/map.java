package CollectionsPractice;
import java.util.*;
public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1000, "tauqeer");
		map.put(1001, "raushan");
		map.put(1003, "rahul");
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.containsKey(1000));
		System.out.println(map.containsValue("tauqeer"));
		for(Integer id : map.keySet()) {
			System.out.println(map.get(id));
		}
		for(Map.Entry id : map.entrySet()) {
			System.out.println(id.getKey()+" : "+id.getValue());
		}
	}

}
