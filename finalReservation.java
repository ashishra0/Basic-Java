/* Airline / Hotel Reservation System.

* This system books Hotel rooms.
* give user an array of location, hotel, rooms to choose from.
* User must enter:
    1) Name
    2) Age
    3) Gender

* Print a invoice which shows
    1)hotel name.
    2)necessary reference id
    3)rate, amount, total(Taxes included)
    4)User name and details.

    Author: Ashish Rao.
    Date: 30/11/17.

*/


import java.util.*; //imports all java packages.


class preReservation {
    // Variables declaration done here.

    String userName, userEmail, userMobile, userHotel, fullDetail;
    String userRoom, hotelLocation, totalBill;
    int roomRate, bookingId, roomType, qty, pinCode;
    double totalRate, amount, rate, GST, SGST, setGst, setSgst;
    Scanner in = new Scanner(System.in);
    Random rnd = new Random();

    void finance (){
        
        setGst = (double)(12.0/100.0);
        setSgst = (double)(23.0/100.0);
        
        if (userRoom.equals ("Deluxe")) {

            rate = 20000;
        }

        else if (userRoom.equals ("Superior")){

            rate = 40000;
        }
        
        else if (userRoom.equals ("Executive")) {

            rate = 60000;
        }

        else if (userRoom.equals ("Presidential")) {

            rate = 100000;
        }
        amount = rate * qty;
    }

    void userDetail(){
        System.out.println("Enter your Name: ");
        userName = in.nextLine();
        System.out.println("Enter your Email: ");
        userEmail = in.nextLine();
        System.out.println("Enter your Mobile Number: ");
        userMobile = in.nextLine();
        fullDetail = ("Name: " + userName + "\n" + "Mobile No: " + userMobile + "\n" + "Email: " +  userEmail);
    }

    void hotelDetail(){

        String[] hotelArea = {"Pune", "Mumbai", "Delhi"}; //location for hotel.
        System.out.println(Arrays.asList(hotelArea));
        System.out.println("Choose the location from the above: ");
        hotelLocation = in.nextLine();

        if(hotelLocation.equals  ("Pune")){
            String[] hotelName = {"JW Marriot", "Hyatt Regency", "ibis hotel", "Novotel"}; //Hotels in Pune.
            System.out.println(Arrays.asList(hotelName));
        } 

        else if (hotelLocation.equals ("Mumbai")) {
            String[] hotelName = {"TAJ", "Hyatt Regency", "Sheraton", "Oberoi Hotel"}; //Hotels in Mumbai.
            System.out.println(Arrays.asList(hotelName));
        } 

        else if (hotelLocation.equals ("Delhi")) {
            String[] hotelName = {"Leela Ambience", "Pride Plaza", "Caspia Hotel", "Hotel Vista Inn"}; //Hotels in Delhi.
            System.out.println(Arrays.asList(hotelName));
        } else {
            System.out.println("Error choosing hotel!");
        }

        System.out.println("Choose the hotel from " + hotelLocation);
        userHotel = in.nextLine();
        String[] roomType = {"Deluxe", "Superior", "Executive", "Presidential"}; //Types of room available.
        System.out.println(Arrays.asList(roomType));
        System.out.println("Choose the type of room you wish to book at " + userHotel);
        userRoom = in.nextLine();
        System.out.println("Choose the number of room");
        qty = in.nextInt();
        
        System.out.println("Confirm booking?");
        totalBill = in.next();
    }

     void invoice (){

        bookingId = rnd.nextInt(199876531);
        pinCode = rnd.nextInt(20);

        if (totalBill.equals ("yes")){
            System.out.println("Congratulations!" + "\n" + "Booking confirmed" + "\n" + "printing invoice.....");
            System.out.println("*****************************" + "\n" + "\t" + "Final Invoice" + "\n" + "*****************************");
            System.out.println( "\t" + "Hotel Details" + "\n" + "Booking Id: " + "#00" + bookingId);
            System.out.println(userHotel + "\n" + hotelLocation + "\n" + "Pincode: " + "41100" + pinCode);
            System.out.println("*****************************"+ "\n" + "\t" + "Guest Details" + "\n" + fullDetail);
            System.out.println("*****************************" + "\n"+ "\t" +"Bill details" + "\n" + "Room type: " + userRoom +"\n"+ "No of rooms: " + qty);

            GST = amount * setGst;
            SGST = amount * setSgst;

            System.out.println("Room rate: " + rate + "\n" + "GST @ 12%: " + GST + "\n" + "SGST @ 12%: " + SGST);
            totalRate = amount + GST + SGST;
            System.out.println("Total: " + "INR " + totalRate +"\n"+"****************************");
        } else {
            System.out.println("booking cancelled!");
        }
    }
}



class finalReservation {
    public static void main(String[] args){
        System.out.println("Welcome to Online Reservation System");
        preReservation ob = new preReservation ();
        ob.userDetail();
        ob.hotelDetail();
        ob.finance();
        ob.invoice();
    }
}