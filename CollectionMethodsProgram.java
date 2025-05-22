package pack;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionMethodsProgram {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("MKT");
		c1.add(6867);
		c1.add(67.78);
		c1.add('m');
		System.out.println(c1);
		//c1.clear();
		System.out.println("After clear:"+c1);
		
		System.out.println(c1.isEmpty());
		Collection c2=new ArrayList();
		c2.add("Roopa");
		c2.add(9897897);
		c2.add(3.14);
		c2.add('A');
		System.out.println(c2);
		c2.addAll(c1);
		System.out.println(c2);
		System.out.println(c2.contains("Roopa"));
		System.out.println(c2.containsAll(c1));
		c2.remove("Roopa");
		System.out.println("Updated value is:"+c2);
		c2.removeAll(c1);
		System.out.println(c2);
		boolean b1=c2.equals(c1);
		System.out.println(b1);
		System.out.println(c2.size());
		System.out.println(c1.size());
	}
	

}
