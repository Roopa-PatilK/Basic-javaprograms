package pack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterfaceProgram {

	public static void main(String[] args) {
		Set<String> s1=new HashSet<String>();
		s1.add("Roopa");
		s1.add("Prathvi");
		s1.add("Krishiv");
		s1.add("Atul");
		System.out.println(s1);
		
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		
	}

}
