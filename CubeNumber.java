// A program in Java to display the cube of the number upto given an integer.
// Do not change the below code.

import java.util.Scanner;

public class CubeNumber{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            System.out.println("Number is: "+ i + " and the cube is " + i*i*i);
        }
    }
}
