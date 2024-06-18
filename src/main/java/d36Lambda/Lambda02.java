package d36Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4,5,11,10));
        System.out.println(nums); //[2, 3, 4, 5, 11, 10]

        //convert data to square of this....

//        int x = 10;
//        x = x*x;
//        System.out.println(x); //100

        //map() => this conversion and updating the container can be done with map() in lambda
        //this method is completely different map<Key, Value>.....

       printSquare(nums); //4 9 16 25 121 100


    }

    //create a method to get square numbers by using lambda expression....


    public static void printSquare(List<Integer> nums){ //[2, 3, 4, 5, 11, 10]

        nums.stream().map(t -> t*t).forEach(t -> System.out.print(t+ " ")); //4 9 16 25 121 100


    }
}
