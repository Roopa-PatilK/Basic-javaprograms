package pack;

abstract class loginClass1
{
	abstract void add();
	abstract void sub();
	void multiplication() {
		 int a=4;
		 int b=5;
		 System.out.println("Multiplication of 2 numbers:"+a*b);
	} 
	
}
public class Abstractclassprogram extends loginClass1 {

	public static void main(String[] args) {
		Abstractclassprogram a1=new Abstractclassprogram();
		a1.add();
		a1.sub();
		a1.multiplication();
	}
	void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition of 2 numbers:"+sum);
		
	}

	void sub() {
		int a=50;
		int b=20;
		int Subtraction=a-b;
		System.out.println("Subtraction of 2 numbers:"+Subtraction);
		
	}
	
}
