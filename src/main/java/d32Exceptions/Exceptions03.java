package d32Exceptions;

public class Exceptions03 {

    public static void main(String[] args) {

        //StringIndexOutOfBoundException; when a non existing index is tried to be reached out,
        //this exception is thrown.........

        String str = "Java";

        pickChars(str, 2);
        pickChars(str, 5);

    }//closing main method...


    public static void pickChars(String str, int idx) {

        try {
            char ch = str.charAt(idx);
            System.out.println(ch);
        } catch (Exception e) {
            System.out.println("Index numbers should be in bound of the string");
            System.err.println("Dont use an index number out ouf bound " + e.getMessage() );
            e.printStackTrace(); //When a developer wants to see details about the error or exception. They uses also this method....

        }

        //for macOs ==> cmd+opt+T ==> Populates surround with ; then select try-catch.....
        //for windows ==> ctrl+alt+T ==> Populates surround with ; then select try-catch.....

        // go to menu; click "code" and then click on "the surround with" then you will see the try catch blocks shortly......

    }
}
