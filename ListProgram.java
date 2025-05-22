package pack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProgram {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Nethra");
		l1.add("Sindhu");
		l1.add("Uma");
		l1.add("Shweta");
		l1.add("soumya");
		System.out.println(l1);
		
		Iterator<String> i1=l1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator<String>i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
	}

}
