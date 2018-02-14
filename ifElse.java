// If Else Program
import java.util.Scanner;

class ifElse {
    public static void main(String args[]) {
        int marksObtained, passingMarks;

        passingMarks = 40;
        Scanner input = new Scanner(System.in);
        System.out.println("input marks scored by you");
        marksObtained = input.nextInt();
        if(marksObtained >= passingMarks) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("Unfortunately you failed.");
        }
    }
}