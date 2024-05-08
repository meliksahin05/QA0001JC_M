package d15NestedLoops_WhileLoop;

public class WhileLoop01 {

    public static void main(String[] args) {


        // ---------- for

        /*

         for(startingValue; condition to exit loop;  decrement/increment){

                      body to execute}

         */


        //=========== WHILE

        /*

       starting value

       while(condition to start loop){

               codes to execute

               increment/decrement

            }

            //if we know number of iteration for loop is most convenient one.....

            // if we dont know number of iteration, while loop is better than ForLoop

         */

        //Example; print the numbers from 3 to 6 on the consolee....

        //first way forloops

        for (int i=3; i<=6; i++){

            System.out.println(i);
        }

        System.out.println("===================================================================================");

        //second way....

        int i =3;





                          while (i<=6){



                                    System.out.println(i);

                 i++;
        }
        System.out.println(i);
    }
}
