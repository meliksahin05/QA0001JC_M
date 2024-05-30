package d26JavaPractice;

import java.util.Scanner;

public class C06_SWITCH {

    public static void main(String[] args) {

        /*
        Ask the user to enter his/her grade between 0-4.....

        if the grade between 0.0 - 1.0: print Fail..
        if the grade between 1.0 - 2.0: print Pass..
        if the grade between 2.0 - 2.5: print Good..
        if the grade between 2.5 - 3.5: print Better..
        if the grade between 3.5 - 4.0: print Great..

        then
        assing the letter grades using switch case....

        FAIL = F
        PASS = D
        GOOD = C
        BETTER = B
        GREAT = A

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade...");
        double grade = scan.nextDouble();

        String result = "";

        if (grade >=0 && grade<1){
            result = "FAIL";
        } else if (grade>=1 && grade<2) {
            result = "PASS";

        } else if (grade>=2 && grade<2.5) {
            result = "Good";

        } else if (grade>=2.5 && grade<3.5) {
            result = "Better";

        }else if (grade>=3.5 && grade<=4) {
            result = "Great";

        }  else {
            result ="Invalid grade...";
        }

        switch (result){

            case "FAIL" :
                System.out.println("F");
                break;
            case "PASS" :
                System.out.println("D");
                break;
            case "Good":
                System.out.println("C");
                break;
            case "Better" :
                System.out.println("B");
                break;
            case "Great":
                System.out.println("A");
                break;
            default:
                System.out.println("Invalid");
        }



        //syxtax of sytax
        /*
        switch(data){

            case "data" :
                 your codes

            case "data1" :
                  your codes



         */
    }
}
