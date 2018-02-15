// Factorial of user defined number 

import java.util.Scanner;

class factorial {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int f = 1;
            if(n>=0){
            do {
                f = f*n;
                n--;
            } while (n!=0);
            System.out.println(f);
        } else {
            System.out.println("invalid input");
        }
    }
}