package javaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapClassDemo {

	public static void main(String[] args) {

		Map<Integer,String> hm=new HashMap();
		
		hm.put(1, "Nnadlal");
		hm.put(2, "Hari");
		hm.put(3, "brahm");
		
		for(Map.Entry<Integer,String> m: hm.entrySet()) {
			
			System.out.println(m.getKey()+m.getValue());
		}
		
		hm.put(new Integer(2), "hey");
		hm.remove(3);
		System.out.println(hm);

	}

}
