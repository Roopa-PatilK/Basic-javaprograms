package pack;

import java.util.ArrayList;
import java.util.List;

public class ListMethodsProgram {

	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<String>();
		l1.add("Roopa");
		l1.add("Vijaya");
		l1.add("Prathvi");
		l1.add(3,"Pavan");
		l1.remove(3);
		l1.remove(l1);
		System.out.println(l1);
		
		List<String> l2=new ArrayList<String>();
		l2.add("Nanda");
		l2.add("Damodar");
		l2.add("Prathvi");
		System.out.println(l2);
		boolean b1=l1.equals(l2);
		System.out.println(b1);
		
		List<Integer> l3=new ArrayList<Integer>();
		l3.add(1234);
		l3.add(8977);
		l3.add(9999);
		System.out.println(l3);
		boolean b2=l1.equals(l3);
		System.out.println(b2);
		
		//l1.addAll(1,l2);
		//System.out.println(l1);
		l2.addAll(l1);
		System.out.println(l2);
		
		l1.contains("Roopa");
		
	}

}
