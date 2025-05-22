package pack;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatchpgm {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try
		{
			System.out.println("enter a number");
			int a1=s1.nextInt();
			System.out.println("Li");
		}
		catch(InputMismatchException e1)
		{
			System.out.println("hi");
		}

	}

}
