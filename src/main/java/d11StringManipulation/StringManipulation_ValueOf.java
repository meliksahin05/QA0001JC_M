package d11StringManipulation;

public class StringManipulation_ValueOf {

    public static void main(String[] args) {


        //Example; Calculate total Price of the products given below in string data type....

        // expected result 456.99+875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";

        System.out.println("tv = " + tv);
        System.out.println("laptop = " + laptop);

        System.out.println("============================================================================");

        // first thing first, i need to remove dollar sign

       tv = tv.replace("$",""); //remove dollar sign and put nothing instead and uptade existing container
        laptop = laptop.replace("$","");

        System.out.println("tv = " + tv);
        System.out.println("laptop = " + laptop);

//        "double" this is primitive data types and in the primitive data types there is no methods bcuse it is primitive

//        Double.   this is wrapper class and wrapper class has the methods.


        //Use double wrapper class to access valueOf method. Dont use primitive double.....

        Double thePriceOfTv = Double.valueOf(tv);
        Double thePriceOfLaptop = Double.valueOf(laptop);

        System.out.println("Total Price : " + (thePriceOfTv+thePriceOfLaptop));

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);

        System.out.println("totalPrice = " + totalPrice);



    }
}
