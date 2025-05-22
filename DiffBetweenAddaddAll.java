package pack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DiffBetweenAddaddAll {

	public static void main(String[] args) {
		Collection<String>c1=new ArrayList<>();
		c1.add("Roopa");
		c1.add("Krishiv");
		c1.add("Atul");
		System.out.println(c1);
		
		Collection<String>c2=new ArrayList<>();
		c2.add("Vijaya");
		c2.add("Prathvi");
		c2.add("Nanda");
		c2.add("Damodar");
		System.out.println(c2);
		
		c1.addAll(c2);
		System.out.println(c1);
		
		List list1=new ArrayList();
		list1.add("Lata");
		list1.add("Sindhu");
		list1.add(1, "Nethra");
		System.out.println(list1);
		
		List list2=new ArrayList();
		list2.add("shradha");
		list2.add("smita");
		list2.add(1, "Nethra");
		System.out.println(list2);
		
		list2.addAll(list1);
		System.out.println(list2);
		
		list2.addAll(0, list1);
		System.out.println(list2);
		
				

	}

}
