package d36Lambda;

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

        nums.stream().forEach(t -> System.out.println());

//        printEvenNumbers1(nums);
        printEvenNumbers2(nums);


    }

    public static void prinElements(List<Integer> nums){

        for (Integer w:nums) {

            System.out.println(w);
        }
    }

    public static void prinElements2(List<Integer> nums){

        nums.stream().forEach( t-> System.out.println(t)); // "t" is variable representing each element of the list
                                                           // coming into the loop. Same like w ....
        System.out.println("===========================");

        nums.stream().forEach(t -> System.out.print(t + " "));   //12 9 31 14 9 10 4


    }


    //Create a method to print the even elements of the list....

    public static void printEvenNumbers1(List<Integer> nums){

        for (Integer w:nums){  ////12 9 31 14 9 10 4

            if (w %2 ==0){

                System.out.print(w+ " ");
            }
        }

    }

    //In normal code structures we use If statements for conditions to filter output...

    //In Lambda expressions we use filter() function to create condition and filter output

    public static void printEvenNumbers2(List<Integer> nums){  ////12 9 31 14 9 10 4


        // variableName - stream - filter function (condition) - for each function (iterate)
        //stream() enables developers to use Lambda functions to make code simpler

           nums.stream().filter(t -> t%2 ==0).forEach(t -> System.out.print(t));


    }


}
