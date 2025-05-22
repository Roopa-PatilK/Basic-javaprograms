package pack;

public class DefaultvalueGlobalVariable {
	static int a;
	static double b;
	static String s;
	int i;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		DefaultvalueGlobalVariable g=new DefaultvalueGlobalVariable();
		System.out.println(g.i);
	}

}
