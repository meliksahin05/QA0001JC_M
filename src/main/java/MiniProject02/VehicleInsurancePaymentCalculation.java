package MiniProject02;

import java.util.Scanner;

public class VehicleInsurancePaymentCalculation {



       /*
       Project: Auto Insurance Payment Calculator
       Vehicle types: car, truck, bus, motorcycle
                     -bus: 18-30 seats or 31 and above seats
      Tariff period: December 2023, June 2023
      1st term: June 2023                      2nd term: December 2023
         cars: 2000                            cars: 2500
         truck: 3000                           truck: 3500
         bus: type1: 4000 type2: 5000          bus: type1: 4500,  type2: 5500
         motorcycle: 1500                      motorcycle: 1750
       In case of incorrect entry, the "Calculation failed" warning should be given to the user and the menu should be shown again.
       To be able to let user restart, we should present option to restart
*/

    public static void main(String[] args) {


        startCalculation();

    }


    //1) Create our own method....

    public static void startCalculation() {

        //3 create a scanner object to get input from user

        Scanner input = new Scanner(System.in);

        //2) we can use do while loop to give message user first

        boolean isFailed;
        do {

            isFailed = false;
            //4 give a message to user.....

            System.out.println("---Calculation for Vehicle Insurance----");
            System.out.println("---Choose a term for payment calculation---");
            System.out.println("1- June 2023");
            System.out.println("2- December 2023");
            int term = input.nextInt();


            //5 create if statement for term
            if (term==1 || term ==2){

                Vehicle objVehicle = new Vehicle();
                System.out.println("Enter the type of vehicle for the payment calculation");
                System.out.println("Car, Truck, Bus, Motocycle");

               objVehicle.type=input.next().toUpperCase();

               objVehicle.payment = objVehicle.countPayment(term);


                int select;
                if (objVehicle.payment>0){

                   System.out.println("---Insurance Details---");
                   System.out.println("---Term " + term);
                   System.out.println("---Payment " + objVehicle.payment);

                   System.out.println("To restart please press 1 , to exit press 0");
                  select = input.nextInt();

                   if (select == 1){

                       isFailed = true;

                   }else {
                       isFailed = false;
                   }

               }else{

                   System.out.println("Incorrect data entrance");
                   System.out.println("To restart please press 1 , to exit press 0");
                   select = input.nextInt();
                    if (select == 1){

                        isFailed = true;

                    }else {
                        isFailed = false;
                    }
               }


            }else {

                System.out.println("Incorret data from user");
                isFailed = true;

            }

        } while (isFailed);

    }

}


