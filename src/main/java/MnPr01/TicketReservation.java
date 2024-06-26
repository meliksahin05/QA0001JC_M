package MnPr01;

import java.util.Scanner;

public class TicketReservation {

    /*
    Project: app that calculates bus ticket price based on distance and conditions

Distance from User (KM), age and trip type (One-Way OR  Round-trip (Going&Returning )
Get seat number information.
All buses should have a seat number in total "32".

Take the payment as 1 USD / km for distance. (*2 for Round-trip trip)
First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;

Conditions:

Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
Otherwise, "You Have Entered Wrong Data!" or Any warning should be given.

Discounts:

1- If the person has chosen the "Journey Type" Round-trip trip, 20% discount is applied on the ticket price.

2- Single Seat Fee:
If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.

3- Age discount:
If the person is younger than 12 years old, 50% discount is applied on the ticket price.
If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
If the person is over 65 years old, a 30% discount is applied on the ticket price.
     */

    public static void main(String[] args) {


        Bus bus = new Bus("KnightsBridge 78");


        Ticket ticket = new Ticket();




//        System.out.println(bus.busNum);
//        System.out.println(bus.seats);

        start(bus , ticket);


    }


    public static void start(Bus bus, Ticket ticket){

        Scanner scan = new Scanner(System.in);

       int select;

        do{
            System.out.println("----Welcome to our Reservation Ticket System ----");
            System.out.println("Enter the distance in KM");
            double distance = scan.nextDouble();
            System.out.println("Enter the type of journey");
            System.out.println("1- One way\n2- Round Trip");
            int type = scan.nextInt();
            System.out.println("Enter your age ");
            int age = scan.nextInt();
            System.out.println("Choose seat number");
            System.out.println("Single seat is 20% more expensive than others");
            System.out.println(bus.seats);
            int seat = scan.nextInt();

            boolean check = type ==1 || type ==2;

            if(distance > 0 && age>0 && check){

                 ticket.journeyType =type;
                ticket.distance =distance;
                ticket.seatNum =seat;

                ticket.price = calculatePrice(ticket, age);

                ticket.printTicket(bus);


            //There is a bug here. This is also your homework.....

              boolean removed  = bus.seats.remove(String.valueOf(seat));


            }else{

                System.out.println("You have entered wrong data");
            }

            System.out.println("Press any number to Restart or press 0 to quit");
            select = scan.nextInt();



        }while(select !=0);



    }

    //Create a method to calculatePrice
    public static double calculatePrice(Ticket ticket, int age){

               double dis =ticket.distance;
               int type  = ticket.journeyType;
               int seat = ticket.seatNum;

               double total = 0;

               switch (type){

                   case 1 : //one way

                       if (seat %3 == 0){ //in case under chooeses single seat

                          total = dis*1.2;
                           System.out.println("Total Price for single seat " + total);
                       }else {

                           total = dis*1;

                           System.out.println("Total Price for regular seat " + total);
                       }
                       System.out.println("total = " + total);
                       break;

                   case 2 : //round trip

                       if (seat %3 == 0){ //in case under chooeses single seat

                           total = dis*2.4;
                           System.out.println("Total Price for single seat " + total);
                       }else {

                           total = dis*2;

                           System.out.println("Total Price for regular seat " + total);
                       }
                       total =total*0.8; // we make discount if user chose round trip
                       System.out.println("Total after discount = " + total);
                       break;
               }

               if(age<12){

                   total = total*0.5;

               } else if (age<25) {

                   total = total*0.9;

               }else if(age >65 && age<150){

                   total = total*0.7;
               }


        return total;

    }

                   /*


Discounts:


3- Age discount:
If the person is younger than 12 years old, 50% discount is applied on the ticket price.
If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
If the person is over 65 years old, a 30% discount is applied on the ticket price.
     */




}
