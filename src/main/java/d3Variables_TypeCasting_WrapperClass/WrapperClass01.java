package d3Variables_TypeCasting_WrapperClass;

public class WrapperClass01 {

    public static void main(String[] args) {


        //Wrapper Class; Jave created a new data structure by adding some usefull methods to primitive data types.

        //This new data structure is called "Wrapper Class"

        /*
        primitive data           wrapper class

        byte            ===>     Byte
        short           ===>     Short
        int             ===>     Integer
        long            ===>     Long
        float           ===>     Float
        boolean         ===>     Boolean
        char         ====>       Character
         */


        Integer age = 35;

        int weight = 25;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);


        //How to convert primiteve to wrapper class

        char ch = '?';

        Character chWrapper = ch; //Autoboxing

        Boolean b1 = true;
        boolean b2 = b1; //unboxing


    }
}
