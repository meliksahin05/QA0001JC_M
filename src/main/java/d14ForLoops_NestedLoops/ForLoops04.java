package d14ForLoops_NestedLoops;

public class ForLoops04 {

    public static void main(String[] args) {


        //Example; Calculate total value of the integers from 5 to 9
        // 5+6+7+8+9 = 35

       int sum = 0;

       for (int i=5; i<10; i++){

           sum = sum + i;
       }

        System.out.println("sum = " + sum);



       //Example 2 calculate the multiplication of the numbers from 10 to 7

        int mult = 1;

        for (int i=10; i>6;  i--){

            mult = mult*i;

            System.out.println("mult = " + mult );
        }

        System.out.println("mult = " + mult );


    }
}
