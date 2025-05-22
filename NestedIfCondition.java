package pack;

public class NestedIfCondition {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if (a<b)
		{
			System.out.println("Block 0");
			if(b<c)
			{
				System.out.println("Block 1");
			}
			if(c==a)
			{
				System.out.println("block 2");
			}
			else
			{
				System.out.println("Block 3");
			}
		}
		else
		{
			System.out.println("Block 4");
		}
	}

}
