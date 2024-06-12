package d33Exceptions_Enum;

public class Exceptions10 {

    public static void main(String[] args) {


        // The finally block
/*
1) The finally block is commonly used for;
   a) Releasing resources: (disconnecting database connections, using the close() method),
       Especially before Java 7, resources like database connections had to be closed manually.
       Such resources, if left open for too long, would occupy unnecessary space in the system
       and could lead to potential performance issues.
       This became automated post-Java 7 (with the try-with-resources statement).

   b) Closing files: (we had just made a file connection. it could be closed with fis.close();)
      It's necessary to close files after reading or writing operations are done. Otherwise,
      file handles unnecessarily occupy space in the system.

   c) Cleanup operations that must run in all cases:
      (Some operations, whether successful or not, should always be performed at the end of a certain process.
      For example, logging the start and end times of each operation to a log file.
      With BufferedWriter)

*/

        int a = 12;
        int b = 6;
        int [] c = {3,5,9,7};

        call(c,a,b);


    }


    public static void call(int[]c, int a, int b){

       try {

           int idx = a / b;
           int element = c[idx];
           System.out.println(element);


       }catch (ArithmeticException e){
           System.err.println("The problem is " + e.getMessage());

       }catch (ArrayIndexOutOfBoundsException aio){
           System.err.println("The problem is " + aio.getMessage());


       }finally { //works everytime when code is executed....
           System.out.println("Cut the connection with database!"); //multiple finally is not allowed.. it  can be used once...


           // try +catch || try+multiple catch || try+ catch finally || try+finally scenarios are available.....
           //multiple catch is okey but finally is not...
           //try+finally is okey.....
       }
    }
}
