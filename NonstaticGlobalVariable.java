package pack;

public class NonstaticGlobalVariable {
	int a=20;
	int b=30;
	 static void add()
	 {
		 NonstaticGlobalVariable c1=new NonstaticGlobalVariable();
		 System.out.println(c1.a+c1.b);
	 }
	 static void sub()
	 {
		 NonstaticGlobalVariable c1=new NonstaticGlobalVariable();
		 System.out.println(c1.a-c1.b);
	 }
	 static void mul()
	 {
		 NonstaticGlobalVariable c1=new NonstaticGlobalVariable();
		 System.out.println(c1.a*c1.b);
	 }
	 static void div()
	 {
		 NonstaticGlobalVariable c2=new NonstaticGlobalVariable();
		 System.out.println(c2.a/c2.b);
	 }
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		

	}

}
