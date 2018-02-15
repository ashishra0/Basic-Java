// program to check if a number is prime or not

import java.util.Scanner;

class primeOrNot {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;

        for(i = 2; i<n; i++)
        if(n%i==0)
        break;
        if(i==n)
        System.out.println("number is prime");
        else
        System.out.println("number is not prime");
    }
}