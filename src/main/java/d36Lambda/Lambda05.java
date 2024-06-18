package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda05 {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 13));
        System.out.println(nums); //[2, 3, 4, 5, 11, 13]

        /*
        int multiplication = 1;

        for(Integer w : nums){

          multiplication = multiplication * (w * w);
          sout(multiplication)

         */

        multiplicationOfSquare(nums); //294465600
        multiplicationOfEvenSquare(nums);

    }


    //calculate multiplication of square of the elements.........

    public static void multiplicationOfSquare(List<Integer> nums){


      int multiplication = nums.stream().map(t-> t*t).reduce(1,(t, u) -> t*u);
        System.out.println("multiplication = " + multiplication); //294465600


    }

    public static void multiplicationOfEvenSquare(List<Integer> nums){ //[2, 3, 4, 5, 11, 13]


        int multiplication = nums.stream().
                filter(t -> t%2 == 0).
                map(t-> t*t).
                reduce(1,(t, u) -> t*u);
        System.out.println("multiplicationEven = " + multiplication); // 64


    }



}
