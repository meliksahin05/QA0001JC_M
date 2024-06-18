package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,3,4,5,10,10));


        // create a method to calculate cube of odd numbers in the list......

        printCubeOfOdds(nums);

        System.out.println("================================");

        removeDuplicateElements(nums);

    }

    public static void printCubeOfOdds(List<Integer> nums){

        nums.stream().filter(t -> t%2 !=0).map(t -> t*t*t).forEach(System.out::println); //27, 27, 125


    }

    //remove the duplicate elements in the list.....

    public static void removeDuplicateElements(List<Integer> nums){ //2,3,4,5,10,10

        nums.stream().distinct().filter(t -> t%2 !=0).map(t -> t*t*t).forEach(System.out::println);

    }

    //distinct methods provide us to remove duplicate values in the list........

}
