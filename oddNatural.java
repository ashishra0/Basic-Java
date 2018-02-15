// program to print N odd natural numbers

import java.util.Scanner;

class oddNatural {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number till you want the odd numbers to print: ");
        int n = in.nextInt();
        int i = 1;

        do {
            System.out.println(2*i-1);
            i++;
        } while (i<=n);
    }
}