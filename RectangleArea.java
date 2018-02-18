// Program to compute the Area of a Rectangle.
// No classes and objects are used.
// Do not change the code below.

import java.util.Scanner;


public class RectangleArea {
	public static void  main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length: ");
		int length = scan.nextInt();
		System.out.println("Enter breadth: ");
		int breadth = scan.nextInt();
		int area;
		area = length * breadth;
		System.out.println("Area of Rectangle is " + area);
	}
}

