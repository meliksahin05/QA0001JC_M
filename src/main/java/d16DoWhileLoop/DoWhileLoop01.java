package d16DoWhileLoop;

public class DoWhileLoop01 {

    public static void main(String[] args) {


        // ---- while

        /*

        starting value

        while(condition to start loop){

        codes to execute
        //incerement/decrement
         */

        // ------- do while loop
        /*

        starting value

        do{

              //codes to execute
              //increment/decrement

              }while(condition to run loop);

         */

        //Example 1; print the numbers from 5 to 3 on the console.....

        // 1) starting value
        int i = 5;

        //2) create do part
        do{
            System.out.println(i);

            //3) create increment/decrement
            i--;


        }while(i>2);

        System.out.println("===================================");


        //Example print the number from 5 to 9 by using do while loop
        //1)starting value
        int k = 5;

        //2) create do part

        do {


                  System.out.println(k); //k==5


                       k++;



                     }while(k>10);

        System.out.println(k); //k==6

        //in do while, even the condition is false in first check, it will do task before the condition in do body......
        //This is difference between while loop and do while loop...
        //do while loop ==> do something first then thinks about it

    }
}
