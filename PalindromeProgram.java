//Reverse the string 
package pack.Arrayprograms;

public class PalindromeProgram {

	public static void main(String[] args) {
		
		String s1="rotator";
		String s2="";
		
		for(int i=6;i>=0;i--)
		{
			char c1=s1.charAt(i);
			s2=s2+c1;
		}
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("Given string is a Palindrome");
		}
		else
		{
			System.out.println("Give string is not  a Palindrome");
		}
	}

}
	