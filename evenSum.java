// Program to print the sum of first even 10 natural numbers

class evenSum {
    public static void main(String args[]){
        int s = 0, i;
        for(i = 1; i<=10; i++){
            s = s + 2*i;
        }
        System.out.println("sum of first 10 even natural numbers is: " + s);
    }
}
