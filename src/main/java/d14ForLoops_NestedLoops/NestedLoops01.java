package d14ForLoops_NestedLoops;

import java.util.Scanner;

public class NestedLoops01 {

    public static void main(String[] args) {

        //Nested Loop

        /*
            for(){

                for(){

                }

           }


         */

        //type the code printing following output...

        /*
        Week 1:  ====>>>>>>>main loop

            Day: 1
            Day: 2
            Day: 3

        Week 2:

            Day: 1
            Day: 2
            Day: 3

         */

      //Create an outer for loop
        for (int       i=1;                           i<=2;                           i++){


                                        System.out.println("Week " + i + ":");

             //Create an inner for loop
                                                      for (int k=1;            k<4;                    k++){




                                                                         System.out.println(" Day: " + k);
            }



        }

        //Note: in the main loop when we have starting point and condition is true....
        // in loop body; nested loop is iterating for all the values which are in the nested loops....


        //When nested loop is done, iterating in all values; then java will go to main loop in increment/decrement part,
        //and check second value in condition.....

        System.out.println("===================================================================");


        //Example; Print the following pattern on the console....


        /*

                               X X X X
                               X X X X
                               X X X X
         */

              Scanner scan = new Scanner(System.in);

              System.out.println("Enter a number for rows");

              int rows = scan.nextInt();

        System.out.println("Enter a number for column");

              int column = scan.nextInt();

              for (int i=1;       i<=rows;       i++){

                  for(int k=1;     k<=column;                       k++){

                      System.out.print("X ");
                     }

                  System.out.println();

              }

    }
}
