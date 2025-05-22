package pack;
public class ConstructorProgram 
{
	public static void main(String[] args) {
		new ConstructorProgram("abc","efc");
		new ConstructorProgram(5,'k',4.4);

		new ConstructorProgram(87,3.2,'I');
		//1st way to create an object
		ConstructorProgram c1=new ConstructorProgram();//create an object

		//2nd way to create an object
		new ConstructorProgram();
		new ConstructorProgram(1250);
	
	}
	ConstructorProgram()   //constructor
	{
		System.out.println("This is Constructor 1");
	}
	ConstructorProgram(int a)   //constructor
	{
		System.out.println("This is Constructor 2");
	}
	ConstructorProgram(float a)   //constructor
	{
		System.out.println("This is Constructor 5");
	}
	ConstructorProgram(boolean a)   //constructor
	{
		System.out.println("This is Constructor 6");
	}
	ConstructorProgram(int a,double b,char c)   //constructor
	{
		System.out.println("This is Constructor 3");
	}
	ConstructorProgram(String a,String b)   //constructor
	{
		
		System.out.println("This is Constructor 4");
	}
	ConstructorProgram(int a,char b,double c)   //constructor
	{
		this("Roopa","patil");
		//this(3,4.5,'I');
		System.out.println("This is Constructor 7");
	}
	

}
