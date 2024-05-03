package d3Variables_TypeCasting_WrapperClass;

public class Variables02 {

    public static void main(String[] args) {

        //3) int data type: covers memory 32 bit (4 byte)
        // -2,147483,648 <-> 2,147463648

        //Example: Create two int data and print total value of them on the console

        int a = 19 , b = 13;
        System.out.println("Total Value : " + (a+b));

        //2. way
        int totalValue = a+b;
        System.out.println("totalValue = " + totalValue);

        //Long data type
        //long data type covers 8 byte (64 bit) in memory

        //Example: Create a variable and store number of cells in a human body

        long numOfCells = 12345678901L;


        //I wanna create a variable by using long
        long age = 50L;


        //typing long as data is not enough to make data long so put L at the end

        long myAge = 45;

        System.out.println("numOfCells = " + numOfCells);

        //fLOAT DATA: COVERS 32 BIT (4 BYTE) IN MEMORY
        //CONTAINS DECIMAL NUMBER

        //EXAMPLE; cREATE A FLOAT DATA AND PRINT ON THE CONSOLE

        float priceOfBook = 13.99F;
        float priceOfCoffee = 15.99f;

        float totalPrice = priceOfBook + priceOfCoffee;
        System.out.println("totalPrice = " + totalPrice);


    }
}
