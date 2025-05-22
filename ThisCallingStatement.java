package pack;
public class ThisCallingStatement {
	ThisCallingStatement()
	{
		this(5.4,'R');
		System.out.println("Constructor 1");
	}
	ThisCallingStatement(int a)
	{
		this();
		System.out.println("COnstructor 2");
	}
	ThisCallingStatement(double a,char c)
	{
		
		System.out.println("Constructor 3");
	}

	public static void main(String[] args) {
		new ThisCallingStatement(5);
		

	}

}
