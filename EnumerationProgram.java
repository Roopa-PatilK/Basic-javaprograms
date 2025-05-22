package pack;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationProgram {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.addElement("Roopa");
		v1.addElement("Vijaya");
		v1.addElement("Prathviraj");
		v1.addElement("Pavan");
		v1.addElement("Krishiv");
		System.out.println(v1);
		v1.clear();
		
		Enumeration<String> e1=v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
		
	}

}
