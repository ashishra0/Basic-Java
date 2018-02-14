// odd or even program

import java.util.Scanner;

class oddEven {
    public static void main(String[] args) {
        int x;
        System.out.println("Enter a integer: ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();

        if(x%2==0) {
            System.out.println("The number you entered is even");
        } else {
            System.out.println("The number you entered is odd");
        }
    }
}