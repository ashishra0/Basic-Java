// This is a program to compute the area of the circle.
// Do not change the code below.

import java.util.Scanner; // This allows to take user input.

public class CircleArea {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: "); // Enter a valid numeric value.
		double r = scan.nextDouble();
		System.out.println("Enter pi value: "); // Enter a valid pi value.
		double pi = scan.nextDouble();
		double area;
		area = pi * r * r;
		System.out.println("Area of circle is " + area);
	}
}
