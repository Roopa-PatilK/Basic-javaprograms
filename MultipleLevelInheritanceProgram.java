package pack;
interface one
{
	int a=10;
	int b=20;
	void add();
	abstract void sub();
	
}
interface two
{
	int c=10;
	int d=20;
	void mul();
	void div();

}

public class MultipleLevelInheritanceProgram implements one,two{

	public static void main(String[] args) {
		MultipleLevelInheritanceProgram m1=new MultipleLevelInheritanceProgram();
		m1.add();
		m1.mul();
		m1.div();
		m1.sub();

	}

	@Override
	public void mul() {
		System.out.println("multiplication:"+(c*d));
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division:"+(c/d));
	}

	@Override
	public void add() {
		System.out.println("addition:"+(a+b));
		
	}

	@Override
	public void sub() {
		
		System.out.println("subtraction:"+(a-b));
	}

}
