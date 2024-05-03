package d4Scanner_Concatenation;

import java.util.Scanner; //coming it automatically from java.util.

public class Scanner03 {

    public static void main(String[] args) {

        //DO NOT FORGET TO PUT MAIN METHOD OTHERWISE YOU CAN NOT RUN(EXECUTE) YOUR CODES

        /*
        Example: Ask user to enter;
                 1)Firstname and Lastname
                 2) Age
                 3) Height
                 4) Weight
                 5) Marital Status
                 then print those data with labels in different lines on the console
         */

        //lETS CALL SCANNER CLASS AND CREATE AN OBJECT FIRST
        Scanner  input = new Scanner(System.in);

        //Give a message to user
        System.out.println("Please enter your full name : "); //I wanna get multiple words from user thats why i use nextLine
                                                              //But if you dont use numerical methods before next line

        //CREATE A METHOD WHICH ABOUT THE MESSAGE ABOVE
        String  fullname = input.nextLine(); // allows user to enter multiple words with spaces between them

        System.out.println("Please enter your age ; ");

        byte age = input.nextByte();

        System.out.println("Please enter your height : "); //when user enter value with "," or "." please be careful!!! You can get an error but no worries
                                                           // try to another one which the user didnt use

        float height = input.nextFloat();

        System.out.println("Please enter your weight :");

        short weight = input.nextShort();

        System.out.println("Please enter your Marital Status : ");

//        String maritalStatus = input.nextLine();
        String maritalStatus1 = input.next(); //this method allows java take one word from the user


        System.out.println("Full name : " + fullname);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
//        System.out.println("Marital Status : " + maritalStatus);
        System.out.println("Marital Status : " + maritalStatus1);






    }
}
