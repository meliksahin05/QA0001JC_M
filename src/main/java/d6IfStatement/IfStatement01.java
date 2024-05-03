package d6IfStatement;

public class IfStatement01 {

    public static void main(String[] args) {


        //There 3 conditional statement
        //1) IF STATEMENT (most common)
        //2)SWITCH
        //3) TERNARY



        // IF YOU STUDY HARD, YOU WILL GET OFFER

        //IF YOU DONT STUDY HARD, YOU WONT REACH YOUR DREAM

        //IF STATEMENTS: IF IS A CONDITIONAL STATEMENTS IN JAVA
        //WHEN THE CONDITION RETURNS TRUE, RELATED CODE BLOCK WILL BE EXECUTED(RUN)

        //pOSITIVE SCENARIO IS EXECUTION IN JAVA
        //BUT NEGATIVE SCENARIO IS IGNORING CODES IN JAVA CODE BLOCK

//        if(condition is defined){ if body: contains codes to be executed is true};

        if (10 <15){
            System.out.println("if you see this message, condition is true");
        }

        if(5>9){
            System.out.println("Message will be visible when condition is true");
        }

        if (10 == 6+4){
            System.out.println("Condition is true , you see the message on the console");
        }

        //Example check the given number and print "3 digit" if it has 3 digits

        int a = 63;

        a += 100;

        if(a>100 && a<=999){
            System.out.println(a + " has three digits....");
            System.out.println("3 digits ");

            //Example check the given number and print DIGIT if it is a digit
            System.out.println("============================");


            int b = 17;

            b -= 8;

            if (b >=0 && b<=9){

                System.out.println(b + " is a digit" + b);
            }
        }
    }
}
