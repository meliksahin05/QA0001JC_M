package d35Enum_Iterator_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {


       /*
        Lambda expressions, introduced with Java 8, are a feature used to facilitate functional (method-based)
        programming.

Essentially, they represent anonymous functions and are usually used to define short functions that are to be used once.

The general advantages of lambda expressions:
1- Writing less code: Lambdas allow you to write less and more readable code.
2- Functional programming: They help you utilize Java's functional programming features.
3- Anonymous: Lambda expressions do not have a name.
4- Can contain a single expression: Lambda expressions can contain a single expression that performs one or more
operations.
5- Can take one or more parameters: Lambda expressions can take one or more parameters.

Lambda expressions are sometimes also called "arrow functions" ->

         */

            /*
        1) Lambda is Functional Programming, the other is "Structured Programming"
Structured Programming: Structured programming is a programming paradigm that encourages writing programs using
certain structures or control structures (such as loops, conditional statements).
2) Functional programming is commonly used with Collections and Arrays. (It's not directly used with maps but can be
used if converted to a Set with entrySet.)


         */


        //Create a method to print elements in a list

        List<Integer> nums = new ArrayList<>(Arrays.asList(12,9,31,14,9,10,4));
        System.out.println(nums); //[12, 9, 31, 14, 9, 10, 4]
//        prinElements(nums);
        prinElements2(nums);


    }

    public static void prinElements(List<Integer> nums){

        for (Integer w:nums) {

            System.out.println(w);
        }
    }

    public static void prinElements2(List<Integer> nums){

        nums.forEach(t -> System.out.println(t)); // "t" is variable representing each element of the list
                                                           // coming into the loop. Same like w ....


        nums.stream().forEach(t -> System.out.print(t + " "));   //12 9 31 14 9 10 4


    }


}
