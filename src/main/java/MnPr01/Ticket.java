package MnPr01;

public class Ticket {

    //distance, journey type, price, seatNum

    public double distance;
    public int journeyType;
    public double price;
    public int seatNum;

    //create a method to see details for the ticket informations

    public void printTicket(Bus bus){


        System.out.println("------Ticket Details----------");
        System.out.println("Bus No : " + bus.busNum);
        System.out.println("Journey Type " + (this.journeyType == 1 ? "One Way" : "Round Way"));
        System.out.println("Seat no " + this.seatNum);
        System.out.println("Distance " + this.distance);
        System.out.println("Total Price " + this.price);
        System.out.println("Have a nice trip");

        //when you finished ticket class go to ticketReservation class


    }
}
