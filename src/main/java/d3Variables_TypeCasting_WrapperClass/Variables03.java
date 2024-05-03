package d3Variables_TypeCasting_WrapperClass;

public class Variables03 {

    public static void main(String[] args) {


        //Double data type; covers 8 byte (64 bit ) in memory

        //Example create a variable to store weight of a cell in human body and print on the console

        double weightOfCell = 0.000000000028; // two point eight times eleven to the power of negative fourteen
        System.out.println("weightOfCell = " + weightOfCell);

        //Char data type; covers 2 byte in the memory
        //store one single character ==> digits, letters, symbols etc.

        //Example; Create a variable in char data type and store initial of your name....

        char nameOfSmitha = 'S';
        System.out.println("nameofSmitha = " + nameOfSmitha);
        System.out.println("nameOfSmitha = " + nameOfSmitha);

        //BOOLEAN DATA TYPE: ACCEPT TRUE OR FALSE AS A DATA

        //Example; we have an old man. pLease store the data if he is retired or not (assign true)

        boolean isRetired = true;
        System.out.println("isRetired = " + isRetired);

        //practice
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = 3>5;

        System.out.println("Practice......");

        System.out.println(b1&&b2); //true
        System.out.println(b2 || b3); //true
        System.out.println(b3&&b1); //false
        System.out.println(b4 || b2); //true


        //What is the difference between System.out.println(); and System.out.print();
        System.out.println("Hello");
        System.out.println("World");


        System.out.println("------");


        System.out.print("Hello");
        System.out.print("World");







    }
}
