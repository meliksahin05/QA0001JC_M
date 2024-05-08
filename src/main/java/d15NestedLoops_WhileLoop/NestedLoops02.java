package d15NestedLoops_WhileLoop;

public class NestedLoops02 {


    public static void main(String[] args) {



        //Example: Calculate total value of digits in decimal part in the given data.....

        double num = 28.587;

        // 5+8+7 = 20


        //I need to take decimal parts but this is double and there is no option for methods....
        //Double data is primitive data type. That's why we can not reach methods

        //1) use valueOf


        String strNum = String.valueOf(num);
        System.out.println("strNum = " + strNum); //28.587

        //2) I need to take decimal part. Thats why i will use split method to reach decimal part....

        String  decPartStr = strNum.split("\\.")[1];
        System.out.println("decPartStr = " + decPartStr);


        //3) I have decimal part, i need to calculate value of digits.....

        //convert string into integer again to do addition operation.....

        int decPartInt = Integer.valueOf(decPartStr); //unboxing.....
        System.out.println("decPartInt = " + decPartInt);

        //Its time to create for loop structure.....

        int sum = 0; // we are creating empty container by using int. Because i need to calculate my values....

        for (int          i=decPartInt;           i>0;             i/=10){
            sum = sum + i%10;
        }

        System.out.println("sum = " +sum);




    }


}
