package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06 {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        System.out.println(nums); //[2, 2, 4, 5, 11, 10]



        //how to find maximum values in the list by using lambda expression
//        findMaxiumValues(nums);
        findMaxiumValues3(nums);
        findMaxiumValues2(nums);
        findMaxiumValues4(nums);

    }


    // 1st way
    public static void findMaxiumValues(List<Integer> nums){  //[2, 2, 4, 5, 11, 10]


        nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u) -> t>u ? t : u);




    }

    //2nd way




    public static void findMaxiumValues2(List<Integer> nums){  //[2, 2, 4, 5, 11, 10]


       int max2 = nums.stream().distinct().reduce(nums.get(0), (t,u) -> t>u ? t : u);

        System.out.println("max2 = " + max2);

    }


    public static void findMaxiumValues3(List<Integer> nums){  //[2, 2, 4, 5, 11, 10]


       int max3 = nums.stream().distinct().sorted().  //2,4,5,10,11
                reduce((t,u) -> u).get();

        System.out.println("max3 = " + max3); //max3 = 11

    }

    //4 way

    public static void findMaxiumValues4(List<Integer> nums){  //[2, 2, 4, 5, 11, 10]


        int max4 = nums.stream().
                distinct().
                reduce(Math::max).get();







        System.out.println("max4 = " + max4); //max3 = 11

    }


    //get() method is used to get the result from reduce() function returning in Optional object.


}








