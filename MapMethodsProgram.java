package pack;

import java.util.HashMap;
import java.util.Map;

public class MapMethodsProgram {

	public static void main(String[] args) {
		Map<Integer,String> m1=new HashMap<Integer,String>();
		m1.put(12345, "Roopa");
		m1.put(54321, "Atul");
		m1.put(768767, "Krishiv");
		System.out.println(m1);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();
		m2.put(123435445, "Vijaya");
		m2.put(4645, "Prathvi");
		//m2.putAll(m1);
		System.out.println(m2);
		
		//m1.clear();
		System.out.println(m1);
		System.out.println(m1.isEmpty());
		
		System.out.println(m2.containsKey(12345));
		System.out.println(m2.containsValue("aaa"));
		
		m1.remove(12345);
		System.out.println(m1);
		
		m2.remove(4645,"Prathvi");
		System.out.println(m2);
		
		m2.replace(123435445, "Nanda");
		System.out.println(m2);
		
		m1.replace(54321, "Atul", "Damodar");
		System.out.println(m1);
		
		m1.putIfAbsent(12345, "Roopa");
		System.out.println(m1);
		m1.putIfAbsent(123456, "Roopa");
		System.out.println(m1);
		m1.putIfAbsent(12345, "Sandya");
		System.out.println(m1);
		
		//m1.get(12345);
		//System.out.println("After get method:"+m1);
	}

}
