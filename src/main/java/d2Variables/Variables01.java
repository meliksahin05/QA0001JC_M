package d2Variables;

public class Variables01 {



    //type ""main" and press enter
    public static void main(String[]args){

        String message = "Hello World!";


        System.out.println(message);


        //COMPARISON OPERATORS(THEY RETURN TRUE OR FALSE)
        //Mostly used in conditional Statements

        /*
        EQUAL TO : "=="   ==> myAge == 45 (returns true or false)
        !(exclamation) Not equal to : "!=" ===> myAge != 45

        Greater Than : ">" ==> 8>7 returns true
        Lower Than :   "<" ==> 8<7 returns false

        Returning data (true or false) will be in Boolean data type....

        Note: "==" represents equality in java
        But "=" represents asignment operator
         */

        /*



       LOGICAL OPERATORS

       AND: "&&" Represents AND operator ==> AND operator is perfectionist. Need all of them true get true in result
       ==> grade>70 AND grade<100
       ==> computer<2000 AND Computer>1000

       OR: "||" represent OR operator. ==> So generous. IF one is true, that is enough

       Tamara = 30  Nahed = 25  Ayse = 18

       Tamara <= 35 && Nahed > 25 =====> FALSE
       Tamara <= 35 && Nahed >= 25 =====> TRUE

       (Ayse != 19 && Nahed < 26 ) || Tamara == 28 ====> TRUE
 */

        /*
        MATH OPERATIONS

        Addition : +
        Multiplication ; *
        Subtraction : -
        Division : /


        Operation Piority
        1) if there is paranthesis; inside parantesis is executed first
        2) Multiplication/Division; has first priority between the operators
        3) Addition/Subtraction; has second priority between the operators

        8/2*(2+2) == 16
        30 - 3 + 2*3 == 33
         */

        //Java does not read that comments this lines and all the lines above Because all in comment block
        //Java is strongly typed programming languange
        //So every data must be associated with any of data types

        //Data Types

        //byte
        //For whole numbers, covers 1 byte in memory
        //-128 <-> 127

        byte ageOfStudent = 22;

        System.out.println(ageOfStudent);

        //Create an Example; Create a greeting message in String data type, and please print on the console

        //Data type   variableName      assignment operator     our message with double quotes      semicolumn
        String         greeting                =                        "Hi! Im coming"                  ;

        System.out.println(greeting);
        System.out.println("greeting = " + greeting);


        //Example 2 ; Create a data in int  data type and assign 13. Then print on the console
        int myNumber = 13;
        System.out.println("myNumber = " + myNumber);


        //Short type
        //-32,768 <-> 32,767

        short popOfTown = 1390;
        System.out.println("popOfTown = " + popOfTown);


    } //main method closing brace

} // class closing brace
