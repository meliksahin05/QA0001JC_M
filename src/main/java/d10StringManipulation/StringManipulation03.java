package d10StringManipulation;

import java.util.Scanner;

public class StringManipulation03 {

    public static void main(String[] args) {


        //Example; Check the given password by user validate with following criteria....
        /*
        i)Must contain at least 8 characters
        ii)Must not contain space characters
        iii)Must contain at least one uppercase
        iv)must contain at least one lowercase
        v)must contain at least one digit
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password");

        String pwd = input.nextLine();

//        i)Must contain at least 8 characters
        Boolean lengthControl = pwd.length() >= 8; // if this returns true, first accepptance criteria will be validated
        System.out.println("lengthControl = " + lengthControl);

//        ii)Must not contain space characters
//        11) All the characters other than space ===> [^ ]
        Boolean spaceCheck = pwd.replaceAll("[^ ]", "").length() == 0;
        System.out.println("spaceCheck = " + spaceCheck);


//        iii)Must contain at least one uppercase
        Boolean upperCaseCheck = pwd.replaceAll("[^A-Z]", "").length() != 0;
        System.out.println("upperCaseCheck = " + upperCaseCheck);

//        iv)must contain at least one lowercase

        Boolean lowerCaseCheck = pwd.replaceAll("[^a-z]", "").length() != 0;
        System.out.println("lowerCaseCheck = " + lowerCaseCheck);

//        v)must contain at least one digit

        Boolean digitCheck = pwd.replaceAll("[^0-9]", "").length() != 0;
        System.out.println("digitCheck = " + digitCheck);

        //1st way
        if (lengthControl && spaceCheck && upperCaseCheck && lowerCaseCheck && digitCheck) {

            System.out.println("Password is valid");
        } else {
            System.out.println("You entered invalid password");
        }


        //2nd Way

        Boolean isValid = lengthControl && spaceCheck && upperCaseCheck && lowerCaseCheck && digitCheck;

        if (isValid) {
            System.out.println("Password is valid");
        } else {
            System.out.println("You entered invalid password");


        }
    }



}
