package d32Exceptions;

public class Exceptions01 {

    public static void main(String[] args) {



              /*Exception: Errors that disrupt the flow of code execution when the code is run. It means "unexpected problems."
        Each exception contains an error message and information about the type of error.

        1- Exceptions are errors that disrupt the normal flow of code execution.

                2- An exception is a class. It has methods. It contains error codes, information messages, etc.
        For example; when a method in a class is called, the code starts running. From this moment, the code lines
        start to be read. And if there is an error in the code, an exception situation occurs.

        Of course, developers should foresee these errors beforehand and handle or correct them, but unforeseen situations
        can always occur while the user is using our program. When an error occurs, it is necessary to find out why it
        happened and solve it, or if it cannot be solved at the moment, to produce alternative solutions to ensure the
        system continues to work.

        3- When an exception occurs, code execution stops. Exceptions log sessions in debugging logs.

        4- Exception Handling in Java is a method that allows us to process undesired exceptions or problems in our code
        without interrupting the flow.

        5- When you think of Exception, three things should come to mind: try, catch, and finally (optional).

        6- Even when the code does not run successfully, wrapping all executions in a try-catch statement is considered
        best practice in the programming world to ensure a smooth user experience.
        However, blindly wrapping all code in try-catch blocks is not always the best practice.
        This can mask errors and lead to the program hiding real issues.

        The entire list of exceptions:

        https://docs.oracle.com/javase/8/docs/api/java/lang/Exception.html


        */
        //Aritmethic Exceptions.....
        divide(10,2);
          divide2(10,0);
    }//closing main method here

   //first way.. not recommmend.....
    public static void divide (int a , int b){

        if (b==0){
            System.out.println("Dont enter zero");
        }else {
            System.out.println(a/b);
        }//this solution is not recommend thats why we will use try-catch block.....

    }


    public static void divide2 (int a , int b){


        try{
            System.out.println(a/b);
            System.out.println("Task inside the try is done");

        }catch (ArithmeticException e){

            System.out.println("Please do not perform division by zero");
            System.out.println("DONT ENTER ZERO " +e.getMessage());

        }
        System.out.println("This catch is working after try-catch");
    }

}
