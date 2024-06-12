package d32Exceptions;

public class Exceptions05 {

    public static void main(String[] args) {


        //Can use catch block more than one after try catch????

        int a = 12;
        int b = 0;

        String s = "My Java";
        getCharFromString(s,a,b);

    }

    public static void getCharFromString(String s, int a, int b){


        int idx = 0;
        try {
            idx = a/b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Do not perform division by zero ; " + e.getMessage());
            e.getCause();

        } catch (StringIndexOutOfBoundsException siobe){

            System.out.println("Do not use index out of bound : " +siobe.getMessage());
        }

    }

}
