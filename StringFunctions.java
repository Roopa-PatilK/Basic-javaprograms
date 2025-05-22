package pack;

public class StringFunctions {

	public static void main(String[] args) {
		String a="school";
		int a1=a.length();
		System.out.println(a1);
		
		boolean b1=a.equals("SCHOOL");
		System.out.println(b1);
		
		String s="HOSPITAL";
		System.out.println(s.equalsIgnoreCase("hospital"));//true or false value
		
		String b="Manish Kumar tiwari";
		boolean b2=b.contains("Kumar");
		System.out.println(b2);
		
		String a2="college";
		String a3=a2.toUpperCase();
		
		String a4="HOSPITAL";
		System.out.println(a4.toLowerCase());
		
		String c="I am Student";
		System.out.println(c.concat(" of batch ab54"));//append the string 
		/*c.concat(" of batch ab54");//we can create new string we cannot change string value 
		System.out.println(c);
		*/
		String d="laptop of brand ABC";
		System.out.println(d.substring(2));
		System.out.println(d.substring(2, 6));//print from 2 to 5
		
		String s1="manish kumar tiwari";
		String fname=b.substring(0,6);
		String mname=b.substring(7,12);
		String lname=b.substring(13,19);
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(lname);
		
		System.out.println(fname.concat("".concat(mname).concat("").concat(lname)));//remove spaces in the middle
		
		char c1=a.charAt(5);//if pass out of range will get java.lang.StringIndexOutOfBoundsException
		System.out.println(c1);
		
		int l1=a.indexOf(a);
		System.out.println(l1);
		
		String s2="   Automation batch 54 by GTM   ";
		System.out.println(s2.trim());
		
		String s3="api testing";
		String s4="ramu";
		System.out.println(s4.replace('r', 'm'));
		System.out.println(s3.replace("api", "Automation"));//Replace string 
		
		String s5="Manish Kumar Tiwari";
		System.out.println(s5.replaceAll("[A-Z]", ""));
		System.out.println(s5.replaceAll("[a-z]", ""));
		
		String s6="K V No 123";
		System.out.println(s6.replaceAll("[0-9]",""));
		
		String input="college";
		String output="";
		
		for(int i=6;i>=0;i--)
		{
			char f=input.charAt(i);
			output=output+f;
			
		}
		System.out.print(output);
	}

}	