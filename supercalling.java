package pack;

class supercalling1
{
	supercalling1()
	{
		System.out.println("constructor 1");
	}
}
class supercalling2 extends supercalling1
{
	supercalling2()
	{
		System.out.println("constructor 2");
	}
	
}
class supercalling3 extends supercalling2
{
	supercalling3()
	{
		super();
		System.out.println("constructor 3");
	}

	 public static void main(String[] args)
	 {
		 supercalling2 s1=new supercalling2();
		 
	 }

}
