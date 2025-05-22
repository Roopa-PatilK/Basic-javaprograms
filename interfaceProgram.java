package pack;

interface interfaceclass1
{
	int a=10;
	int b=6;
	
	private void add()
	{
		System.out.println("Hi");
	}
	 static void sub()
	 {
		 System.out.println("hello");
	 }
	abstract void mul();
}
public class interfaceProgram implements interfaceclass1{

	public static void main(String[] args) {
		interfaceProgram i=new interfaceProgram();
		i.add();
		i.sub();
		i.mul();

	}

	
	public void add() {
		//int a=10;
		//int b=30;
		int sum=a+b;
		System.out.println("Sum of 2 numbers:"+sum);
		
	}

	
	public void sub() {
		//int a=10;
		//int b=30;
		int sub=b-a;
		System.out.println("Substrction of 2 numbers:"+sub );
		
	}


	@Override
	public void mul() {
		
		int mul=a*b;
		System.out.println("Multiplication of 2 numbers:"+mul );
		
	}

	
	

}
