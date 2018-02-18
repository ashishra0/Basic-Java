// Control flow statements 
/* Program to display the working of
* If statements.
* Else statements.
* Else-if statements.
 */

import java.util.Scanner;
public  class Marks {
    public static void main(String[] args) {
        int marks;
        String a;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your marks: ");
        marks = in.nextInt();
        if (marks >= 50) {
            System.out.println("you have passed!");
        } else if (marks >= 36 && marks < 50) {
            System.out.println("Average Grade!");
        } else {
            System.out.println("Fail!");
        }
    }
}
