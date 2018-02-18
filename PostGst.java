/* A program to calculate the price of certain item with GST and SGST.
 * User is needed to input rate.
 * Along with the desired quantity.
 * This is still under development, do not change the code at any cost.
 * Trespasers will be made to work on windows machine.

 Author: Ashish Rao
 Date: 29/11/17

 Made using Objects and classes.
 */

import java.util.*;
// all the variables have been initialised in this class.
class PreGst {
    double rate, amount,GST, SGST, pre_rate, post_rate, set_gst, set_sgst;
    int qty, selectCategory;
    String product_name;
    Scanner in = new Scanner(System.in);
//  Method of PreGst class.
    void setdata(){
        System.out.println("Enter the category from above: ");
        selectCategory = in.nextInt();
        System.out.println("Enter a rate: ");
        rate = in.nextInt();
        System.out.println("Enter the quantity: ");
        qty = in.nextInt();
        amount = rate * qty;
        if( selectCategory == 5 ){
            set_gst = (double)(5.0/100.0);
            // set_sgst = (double)(5.0/100.0);
        }
        else if( selectCategory == 12){
            set_gst = (double)(12.0/100.0);
            // set_sgst = (double)(12.0/100.0);
        }
        else if ( selectCategory == 18){
            set_gst = (double)(18.0/100.0);
            // set_sgst = (double)(18.0/100.0);
        }
        // set_gst = (double)(5.0/100.0);
        // set_sgst = (double)(5.0/100.0);
    }
    void Gst(){
        GST = amount * set_gst;
        if( selectCategory == 5 ){
            System.out.println("GST @ 5%: " + GST);
        }
        else if ( selectCategory == 12){
            System.out.println("GST @ 12%: " + GST);
        }
        else if ( selectCategory == 18) {
            System.out.println("GST @ 18%: " + GST);
        }
        // System.out.println("GST @ 5%: " + GST);
    }
    void Sgst(){
        SGST = amount * set_sgst;
        if ( selectCategory == 5){
            System.out.println("SGST @ 5%: " + SGST);
        }
        else if ( selectCategory == 12){
            System.out.println("SGST @ 12%: " + SGST);
        }
        else if ( selectCategory == 18){
            System.out.println("SGST @ 18%: " + SGST);
        }
        System.out.println("SGST @ 5%: " + SGST);

    }
    void SubTotal(){
        pre_rate = amount;
        System.out.println("Sub Total: " + pre_rate);
    }
    void Total(){
        post_rate = amount + GST+ SGST;
        System.out.println("Invoice Total: " + post_rate);
    }

}
// This is the main class.
class PostGst{
    public static void main(String[] args){
        System.out.println("Welcome to GST and SGST Calculation Program");
        System.out.println("Please choose the percent of GST calculation you want from below.");
        int[] categoryName = {5, 12, 18};
        System.out.println(Arrays.toString(categoryName));
        // We are creating objects below.
        PreGst ob = new PreGst ();
        ob.setdata();
        ob.Gst();
        ob.Sgst();
        ob.SubTotal();
        ob.Total();
    }
}
