package pack;

public class test2 {

	public static void main(String[] args) {
		
		String str1="abc";
		String str2=new String("abc");
		System.out.println(str2);
		String str3="abc";
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
	}

}
