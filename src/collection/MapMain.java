package collection;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class MapCom implements Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String str1 = (String)o1;
		String str2 = (String)o2;
		return str1.compareTo(str2)*-1;
	}
}

public class MapMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map mm = new LinkedHashMap();
		mm = new TreeMap<>(new MapCom());
		mm.put("ddd", 5678);
		mm.put("aaa", "º“≥‡Ω√¥Î");
		mm.put("bbb", "º“≥‡Ω√¥Î");
		//mm.put(1, "¥Î≥‡Ω√¥Î");
		mm.put("aaa", "º“≥‡Ω√º“");
		//mm.put(1, "º“≥‡Ω√¡ﬂ");
		mm.put("ccc", 1234);
		
		
		mm.remove("ccc");
		System.out.println(mm);
		System.out.println(mm.get("bbb"));
		
		Set key = mm.keySet();
		System.out.println(key);
		Collection col = mm.values();
		System.out.println(col);
		
		System.out.println(mm.size());
		
		/*for (int i =0; i<mm.size();i++) {
			System.out.println(i+"."+mm.get(i));
		}*/
		
		/*Set es = mm.entrySet();
		Iterator it = es.iterator();*/
		Iterator it = mm.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry em = (Map.Entry)it.next();
			System.out.println(em.getKey()+":"+em.getValue());
		}
		
		System.out.println("-----------------");
		it = mm.keySet().iterator();
		
		while(it.hasNext())
		{
			Object kk = it.next();
			System.out.println(kk+":"+mm.get(kk));
		}
	}

}
