//  Program to print multiplication Table

import java.util.Scanner;

class multiplicationTable {
    public static void main(String args[]) {
        System.out.println("Enter a integer: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c;
        System.out.println("The multiplication table of "+n+ " is: ");

        for(c = 1; c<=10; c++) {
            System.out.println(n+"x"+c+"="+(n*c));
        }
    }
}