package d3Variables_TypeCasting_WrapperClass;

public class Variables04 {

    public static void main(String[] args) {


        //Non-Primitive Data Types

        /*
        1)Non primitive data types start with upper case in naming
        2)Non primitive data types have values and methods


         */

        //String:
        /*

         Non-primitive data types starts with uppercase in naming
         stores: sentences, words, symbols, numbers etc.
         */

        String nameOfStudent = "Martin Tobias";

        //What is the difference between primitive and non-primitve data types?

        /*
        Primitive data types created by java but Non-primitive created by the developers
        Primitive data types stores in stack memory(smaller)
        Non primitives stores in heap memory(bigger)
        Non primitive data types use memory different sizes based on the content
        Primitive data types use the memory sizes based on the data type

         */

        //Updating existing container with a new data....



        String city = "Istanbul";

        System.out.println("city = " + city); //istanbul // update previously created variable with new data

        city = "Izmir";

        System.out.println("city = " + city); //izmir
    }
}
