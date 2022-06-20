package Elements;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {



	public static void main(String[] args) {

		String s = "engineering";
		char[] c = s.toCharArray();

		int count = c.length;
		System.out.println(count);
		int j = 0;
		for(int i = 0; i<c.length;i++) {
			System.out.println(j++ +" "+c[i]);
		}


		Map<String,String> m = new TreeMap();

		m.put("e", "duplicate");
		m.put("n", "duplicate");
		m.put("g", "duplicate");
		m.put("i", "duplicate");
		m.put("n", "duplicate");
		m.put("e", "duplicate");
		m.put("e", "duplicate");
		m.put("r", "unique");
		m.put("i", "duplicate");
		m.put("n", "duplicate");
		m.put("g", "duplicate");


		Set<Entry<String, String>> output = m.entrySet();
		for (Entry<String, String> e : output) {

			System.out.println(e.getKey()+" - "+e.getValue());

		}


		for (Entry<String, String> en2 : output) {

			if(m.get("r").equals(en2.getValue())) {
				System.out.println("the variable  is unique");
			}else {
				System.out.println("not unique");
			}
		}

	}

}

