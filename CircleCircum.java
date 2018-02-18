// Program to compute the circumference of the circle.
// This program does not use Objects and classes.

import java.util.Scanner; // This is used to accept user input.

public class CircleCircum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: "); // Enter any valid value.
		double r = scan.nextDouble();
		System.out.println("Enter pi value: "); // Enter the valid pi value.
		double pi = scan.nextDouble();
		double circumference;
		circumference = 2 * pi * r;
		System.out.println("Circumference of the circle is " + circumference);
	}
}
