import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestImplemt {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("name", "gtueu");
		map.put("ceo", "sundar Picahi");
		map.put("names","panenes");
		Set<String> l = map.keySet();
		for(String k: l)
		{
			System.out.println(k +"<- thats here we go ->" + map.get(k));
		}
	}
}
