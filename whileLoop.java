// While loop program

import java.util.Scanner;

class whileLoop {
    public static void main(String args[]) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number");
        while((n = input.nextInt()) != 0) {
            System.out.println("The number entered is: " + n);
            System.out.println("input another number");
        }
        System.out.println("out of loop");
    }
}