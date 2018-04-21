import java.io.*;
import java.util.*;
public class exception {
    public static void main(String args[]) {
        try {
            int a[] = new int [2];
            System.out.println("Access element three :"+a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception "+e);
        }
        System.out.println("Out of the block");
    }
}