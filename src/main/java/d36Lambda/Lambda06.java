package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06 {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        System.out.println(nums); //[2, 2, 4, 5, 11, 10]



        //how to find maximum values in the list by using lambda expression
        findMaxiumValues(nums);

    }

    public static void findMaxiumValues(List<Integer> nums){  //[2, 2, 4, 5, 11, 10]


        nums.stream().distinct().reduce(Integer.MIN_VALUE, (t,u) -> t>u ? t : u);

    }
}








