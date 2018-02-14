//  largest of 3 numbers

import java.util.Scanner;

class largestNumber {
    public static void main(String args[]) {
        int x, y, z;
        System.out.println("Enter three integers: ");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if(x > y && x > z){
            System.out.println("First Number is largest");
        } else if( y > x && y > z){
            System.out.println("Second Number is largest");
        } else if( z > x && z > y){
            System.out.println("Third Number is largest");
        } else {
            System.out.println("The entered numbers are not distinct");
        }
    }
}