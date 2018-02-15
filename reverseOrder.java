// Program to print N natural numbers in reverse order

import java.util.Scanner;

class reverseOrder {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        while(n>0) {
            System.out.print(n+ " ");
            n--;
        }
    }
}