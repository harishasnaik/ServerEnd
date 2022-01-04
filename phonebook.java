package Q1;

import java.util.HashMap;
import java.util.Map;

public class phonebook {
	Map<String, String> map = new HashMap<>();

	public void addDetails(String phno, String name) {
		map.put(phno, name);
	}

	public String getName(String phno) {
		if(map.containsKey(phno) == true) {
			return map.get(phno);
		}
		return "Contact not found";
	}

}

