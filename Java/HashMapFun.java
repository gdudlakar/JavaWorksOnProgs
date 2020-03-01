import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapFun {

	public static void main(String[] args) {
		
		Map<Integer,String> ip = new HashMap<>();
		ip.put(1, "guru");
		ip.put(2, "supru");
		Set<Map.Entry<Integer,String>> vl = ip.entrySet();
		for(Map.Entry<Integer,String> e: vl)
		{
			
			System.out.println(e.getKey() +":"+ e.getValue());
			e.setValue("III");
		}

	}

}
