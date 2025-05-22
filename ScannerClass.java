package pack;
import java.util.Scanner;
public class ScannerClass {
		public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		double r=s1.nextDouble();
		double  area=Math.PI*r*r;
		System.out.println("Area of the circle is:"+area);
		
		System.out.println("Enter the base of the Triangle:");
		int b=s1.nextInt();
		System.out.println("Enter the height of the Triangle::");
		int h=s1.nextInt();
		double Triangle=0.5*b*h;
		System.out.println("Area of the Triangle is:"+Triangle );
		
		System.out.println("Enter lenght of the Rectangle:");
		int l1=s1.nextInt();
		System.out.println("Enter the width of the Rectangle:");
		int w=s1.nextInt();
		int Rect=l1*w;
		System.out.println("Area of the Rectangle is:"+Rect);
		
		System.out.println("Enter the radius of the circle:");
		int c=s1.nextInt();
		double Circumcircle=2*Math.PI*c;
		System.out.println("Circumference of the circle is:" +Circumcircle);
		
		System.out.println("Enter the value of lenght a:");
		int a1=s1.nextInt();
		System.out.println("Enter the value of lenght b:");
		int b1=s1.nextInt();
		System.out.println("Enter the value of lenght c:");
		int c1=s1.nextInt();
		int CircumTri=a1+b1+c1;
		System.out.println("Circumference of a Triagle is:" +CircumTri);
		
		System.out.println("Enter the lenght of the Rectangle ");
		int lenght=s1.nextInt();
		System.out.println("Enter the width value of the Rectangle");
		int width=s1.nextInt();
		int circumRect=2*(lenght*width);
		System.out.println("Circumference of the Rectangle is:" +circumRect);
			s1.close();

	}

}
