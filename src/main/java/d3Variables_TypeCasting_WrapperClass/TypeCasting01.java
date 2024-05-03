package d3Variables_TypeCasting_WrapperClass;

public class TypeCasting01 {

    public static void main(String[] args) {

        //if you assign a value of a primitive data type to another primitive data type,
        //it is called type casting

        //to put small data type into large data type is easy and java do it automatically
        // we call it as autowideng


        byte myAge = 34;
        int age = myAge;


        //to put large data type into small data type has risk and java does not do it autoamtically
        //you have to type small data type in front of the name of the large data explicit
        //the name of this process is Explicit Narrowing
        long value1 = 3400;
        short value2 = (short)  value1;

        long value3 = 37712831288318321L;
        short value4 = (short)value3;

        int value5 = 130;
        byte value6 = (byte) value5;
        System.out.println("value6 = " + value6);





        int numOfStudent = 12;
        float moneyAmount = 500.0F;

        System.out.println(moneyAmount/numOfStudent); //41.66666


        int numOfStudent1 = 12;
        int moneyAmount1 = 500;

        System.out.println(moneyAmount1/numOfStudent1); //41.66666


    }


}
