package d30JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class C05_ArrayList {

    public static void main(String[] args) {


//  1)  Create an ArrayList and add numbers into the ArrayList ====> 15, 20, 25, 30, 35, 40, 45, 50.
//  2)  Print all the elements of the ArrayList.
//  3)  Add the value 55 at the 5th index (as the 6th element) of the ArrayList. //15, 20, 25, 30, 35, 55, 40, 45, 50.
//  4)  Calculate and print the sum of all even numbers in the ArrayList.
//  5)  Find and print the smallest and largest numbers in the ArrayList.
//  6)  Create a new ArrayList that contains all elements of the original ArrayList in reverse order and print this new ArrayList.

        //Step1; Create an ArrayList and add numbers into the ArrayList

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        numbers.add(40);
        numbers.add(45);
        numbers.add(50);

        //Step2; Print all elements.....
        System.out.println("numbers = " + numbers);  //numbers = [15, 20, 25, 30, 35, 40, 45, 50]


        //Step 3; Add the value 55 at the 5th index

        numbers.add(5,55); //overloading is here.....
        System.out.println("numbers = " + numbers);

        //4th step Calculate and print the sum of all even numbers in the ArrayList.

        int sumOfEven = 0;
        for (int w : numbers){


            if (w%2 ==0){

                sumOfEven = sumOfEven+w;

            }
        }
        System.out.println("sumOfEven = " + sumOfEven);

        //5th //  5)  Find and print the smallest and largest numbers in the ArrayList.

       int max = Collections.max(numbers);
       int min =  Collections.min(numbers);


      // 2. way to find largest and smallest element in the list...
       int largest = numbers.get(0);
       int smallest = numbers.get(0);


        for (int w : numbers){


          largest = Math.max(largest,w);
          smallest = Math.min(smallest,w);

        }
        System.out.println("largest = " + largest); //largest = 55
        System.out.println("smallest = " + smallest); //smallest = 15

        System.out.println("max number = " + max); //max number = 55

        System.out.println("min number = " + min);  //min number = 15

        //6)  Create a new ArrayList that contains all elements of the original ArrayList in reverse order
        // and print this new ArrayList.

        ArrayList<Integer> reversed = new ArrayList<>(numbers);

        Collections.reverse(reversed);

        System.out.println("reversed = " + reversed);


    }
}
