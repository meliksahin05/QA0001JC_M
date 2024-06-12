package d32Exceptions;

public class Exceptions06 {

    public static void main(String[] args) {


        //NullPointerException ===> if null values is passed as a referance, this execution is thrown....

        String str = "Java";

        String xyz = null;


        numOfchars(xyz);

    }

    public static void numOfchars(String str){


        int a = 0;
        try {
            a = str.length();
            System.out.println(a);
        } catch (Exception e) {

            System.out.println("dont use length method if your container is empty  " + e.getMessage());

        }



    }
}
