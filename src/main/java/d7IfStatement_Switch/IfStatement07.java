package d7IfStatement_Switch;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class IfStatement07 {
    public static void main(String[] args) {


        //type main method

        //Example; based on the entered age, print the phase on the console

        //0-4 ==> baby
        //5-12 ==> child
        //13-20 ==> teen
        //21-40 ==> adult
        // 41+ ==> middle age

        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your age");

        int age = input.nextInt();

        if(age <0 ){
            System.out.println("Invalid age!");

        } else if (age <5){
            System.out.println("Baby");
        } else if (age <13 ){

            System.out.println("Child");
        } else if ((age <21)){
            System.out.println("Teen");
        } else if(age < 41){
            System.out.println("Adult");
        } else {
            System.out.println("Middle Age");

        }

//        Scanner input= new Scanner(System.in);
        System.out.println("Enter the age");

        int age1 = input.nextInt();
        if (age>-1&&age<5){
            System.out.println("it is  a baby");
        } else if (age>4&&age<13) {
            System.out.println("child");

        } else if (age > 12 && age < 21) {
            System.out.println("teen");
        } else if (age > 20 && age < 40) {
            System.out.println("adult");

        } else if (age>40) {
            System.out.println("middle age");

        }
    }

}


