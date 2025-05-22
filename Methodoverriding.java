package pack;

class ClassParent{
	void Login()
	{
		System.out.println("Login with Email id");
	}
}

public class Methodoverriding extends ClassParent
{
	void Login()
	{
		super.Login();
		System.out.println("Login with Mobile number");
		
	}
	
	public static void main(String[] args) {
		Methodoverriding m1=new Methodoverriding();
		m1.Login();
		
	}

}
