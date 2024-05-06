package d13StringManipulation_ForLoops;

public class ForLoops {

    public static void main(String[] args) {


        //Print "Hi" five times on the console....
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        //There is repetition ann not good..
        //Java created loop structures to handle repetitive tasks....

        System.out.println("=============================");

        //2. way

        //Loops: Repetitive tasks are handled with loops in java
        //in specified condition, repetition is permorfed by loops based on the need in the task

        /*
        1)for loop
        2)while loop
        3) do while loop
        4) for each loop
         */

        //for loop: we define a starting point(value), ending point to exit loop, direction from start to end
        //so we can modify loop structure based on our need in a flexible way

        //for(data type startingValue; condition to Stop; direction=> increment/decrement){loop body}

        for (int i=1; i>5;  i++){
            System.out.println("Hi");
        }

        //Example2 print the numbers from 20 to 17 on the console (8 is included)

        for (int i=20;              i>=17;                  i--){

            System.out.println(i);
        }




        System.out.println("===========================================================================");





        //example3: Print all the even numbers from 3 to 10(included) on the console......
        // 4 - 6 - 8 - 10
        //First way
        for (int x=3; x<11;  x++){

            if (x%2==0){

                System.out.println(x);
            }
        }

        //Second way

        for (int x=4; x<11; x+=2){

            System.out.println(x);
        }


        //Example4 print odd numbers from 21 to 9 on the console.....

        //first way
        for (int i=21; i>8;  i--){

            if (i%2 !=0){

                System.out.print(" " + i);
            }
        }


        //second way
        for (int i=21; i>=9; i-=2) {
            System.out.println(i);
        }










    }
}
