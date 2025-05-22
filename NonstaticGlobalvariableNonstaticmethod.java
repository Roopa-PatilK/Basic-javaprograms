package pack;

public class NonstaticGlobalvariableNonstaticmethod {
	int a=15;
	int b=10;
	void add()
	{
		System.out.println(a+b);
	}
	void sub()
	{
		System.out.println(a-b);
		
	}
	void mul()
	{
		System.out.println(a*b);
	}
	void div()
	{
		System.out.println(a/b);
	}
	public static void main(String[] args) {
		NonstaticGlobalvariableNonstaticmethod n1=new NonstaticGlobalvariableNonstaticmethod();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
		
		
	}

}
