package d16DoWhileLoop;

import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {


        //Example; Create a game to guess the number crated by RANDOM CLASS

        //The number that random class will create should  be between 0-100

        //Random class will be used to create a number randomly

        //create conditions, if entered number is larger, smaller or equal to random number

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // CREATED AN OBJECT FROM THE RANDOM CLASS

        //lETS CREATE A RANDOM NUMBER BETWEEN 0-100

        int randomNum = random.nextInt(101);
        //to keep entered number create our container
        int enteredNum;

        //starting value
        int numOfTrial = 0;


        do {
            System.out.println("Guess the number between 0 and 100!");
            enteredNum = scanner.nextInt();

            //after each guess increase by one
            numOfTrial++;

            if (enteredNum<randomNum){
                System.out.println("You entered a smaller number!");
            } else if (enteredNum>randomNum) {
                System.out.println("You entered a larger number");
            }else {
                System.out.println("Guessed number is correctly");
                System.out.println("Number of trial; " + numOfTrial);
                break;
            }
        }while(true);

//
//        Guess the number between 0 and 100!
//                22
//        You entered a smaller number!
//                Guess the number between 0 and 100!
//                44
//        You entered a larger number
//        Guess the number between 0 and 100!
//                33
//        You entered a larger number
//        Guess the number between 0 and 100!
//                30
//        You entered a larger number
//        Guess the number between 0 and 100!
//                29
//        Guessed number is correctly
//        Number of trial; 5


    }
}
