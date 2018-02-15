// Program to print the sum of first N natural numbers

import java.util.Scanner;

class naturalSum{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a natural number");
        int N = in.nextInt();
        int s = 0, i;
        for(i = 1; i<=N; i++){
            s = s + i;
        }
        System.out.println("The sum of "+N+" natural numbers is: "+s);
    }
}