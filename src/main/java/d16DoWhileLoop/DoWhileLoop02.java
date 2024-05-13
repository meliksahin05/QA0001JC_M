package d16DoWhileLoop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {


        //Example; Accept input from user
        //if password and username are correct; ==> print "Welcome to your account"
        //if username and password incorrect; ==print 4 times "Enter your username and password...
        //if username and password are incorrect in fourth time again, ==> print "Account is blocked

        //username = "admin"  password = "pwd123"


        Scanner input = new Scanner(System.in);

        int numOfTrials = 1;

        do {


            if(numOfTrials==5){
                System.out.println("Your account is blocked");
                break;
            }


            System.out.println("Enter your username");
            String username = input.next();

            System.out.println("Enter your password");

            String password = input.next();


            numOfTrials++;


            if (username.equals("admin") && password.equals("pwd123")){

                System.out.println("Welcome to your account");
                break;


            }

            System.out.println("Check your credentials");

        }while(true);


    }
}
