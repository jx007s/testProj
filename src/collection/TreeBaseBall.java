package collection;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeBaseBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr ={3,5,7,1,2,3,5,6,2,1,8,2,9};
		
		TreeMap<Integer,Integer> mm = new TreeMap<>();
		
		for (int i : arr) {
			int vv = 1;
			if(mm.containsKey(i))
			{
				vv += mm.get(i);
				//System.out.println(i+"ÀÖ¾î¿ä");
			}
			mm.put(i, vv);
		}
		
		Iterator it = mm.keySet().iterator();
		
		while(it.hasNext())
		{
			Object key = it.next();
			
			System.out.println(key+":"+graphic(mm.get(key)));
		}
	}
	
	static String graphic(int vv)
	{
		String res="";
		
		for (int i = 0; i < vv; i++) {
			res+="*";
		}
		
		return res;
	}

}
