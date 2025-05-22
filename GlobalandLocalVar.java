package pack;

public class GlobalandLocalVar {
	 int a=500;
	static double b=5.5;
	static String s="Roopa";
	static void add()
	{
		GlobalandLocalVar g=new GlobalandLocalVar();
		System.out.println(g.a);
		System.out.println(b);
	}
	static void add1()
	{
		int a=98;
		double b=9.9999;
		String s="Krishiv";
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
	}
	

	public static void main(String[] args) {
		add();
		add1();

	}

}
