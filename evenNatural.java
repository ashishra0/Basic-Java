// Program to print N natural numbers

import java.util.Scanner;

class evenNatural {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a range till you want the natural numbers to appear: ");
        int n = in.nextInt();
        int i = 1;
        do {
            System.out.println(2*i);
            i++;
        } while (i<=n);
    }
}