package pack;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionWithI {

	public static void main(String[] args) {
		
		Collection<String>c1=new ArrayList<String>();
		c1.add("Roopa");
		c1.add("Roopa");
		c1.add("Krishiv");
		c1.add("Atul");
		System.out.println(c1);
		
		Collection<Integer> c2=new ArrayList<Integer>();
		c2.add(1);
		c2.add(2);
		c2.add(3);
		c2.add(3);
		c2.add(null);
		c2.add(null);
		//c2.get();  selenium
		
		System.out.println(c2);
		
		Collection<Character> c3=new ArrayList<Character>();
		c3.add('P');
		c3.add('P');
		c3.add('K');
		c3.add('K');
		System.out.println(c3);
		
		
		
		

	}

}
