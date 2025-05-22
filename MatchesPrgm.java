package pack;

import java.util.Arrays;

public class MatchesPrgm {

	public static void main(String[] args) {
		String s1="school";
		//check if the string starts with s or not
		System.out.println(s1.matches("m(.*)"));
			//check if the string end with l or not
		System.out.println(	s1.matches("(.*)l"));
		//check if the given string has exact 4 letters in it
		String s2="with";
		System.out.println(s2.matches("....."));
		String s3="spiderman";
		//check if the string has man in it
		//manager
		System.out.println(s3.matches("(.*)man(.*)"));
		String name="manish kumar tiwari";
		String [] c1=name.split("a");
		System.out.println(Arrays.toString(c1));
		String []c2=name.split("",3);
		System.out.println(Arrays.toString(c2));
		

	}

}
