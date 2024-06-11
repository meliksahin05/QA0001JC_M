package d32Exceptions;

public class Exceptions02 {

    public static void main(String[] args) {


        //NumberFormatException: When we are not able to convert a string to integer, this exception is thrown...

        String s = "12345we";
        convertStringToInt(s);


    }// closed main method here.....


    public static void convertStringToInt(String s){


        try{

        int intStr = Integer.valueOf(s);
        System.out.println(intStr);
        System.out.println(intStr+1);
        }catch (NumberFormatException nfe){

            System.out.println("Convertion must be performed with digit characters!!! " + nfe.getMessage());
        }
    }
}
