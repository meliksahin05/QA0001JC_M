package d19MultiDimensionArrays_ArrayList;

import java.util.ArrayList;

public class ArrayList01 {

    public static void main(String[] args) {

        //What is ArrayList?

        // ArrayList has dynamic structure. This means the size of array list can be automatically change,
        // you can change the size of arraylist with what ever you want....
        // it means that automatically adjust during the addition or removal of the elements....


        //ArrayList can not store primitive data types... on the other hand direct values...
        // we can use wrapper classes or String etc.

        //As a real life example; a shopping list can be represented as ArrayList....
        //The shopping list contains a list of name of products. Products are string data types..

        /*

        Arrays can store primitive data types and references but ArrayList store non-primitve data types or wrapper class
        Arrays can store less memory than ArrayList
        Arrays is faster than ArrayList
        When you create Arrays, you have to specify total number of elements
        But ArrayList is more flexibility
         */

        /*
        Why java didnt destroye Arrays?
        Bcause Arrays is faster than Arraylist...
        Arrays cover very little space in memory
        therefore arrays prefered for storing data with a known number of elements.....

         */


        //How to create an ArrayList?
//        ArrayList<Integer> ages = new ArrayList<Integer>(); // java version 6
        ArrayList<Integer> ages = new ArrayList<>();  //java version 7 uptaded....

        System.out.println("ages = " + ages); //ages =

        //How to add elements into the ArrayList...
        ages.add(21);
        ages.add(43);
        ages.add(33);

        System.out.println(ages); //[21, 43, 33]

        //How to add element into a specific index...
        ages.add(1,26);

        System.out.println("ages = " + ages); //ages = [21, 26, 43, 33]

        ages.add(99);

        System.out.println("ages = " + ages); //ages = [21, 26, 43, 33, 99]

        // add 19 between 43 and 33
        ages.add(3,19);
        System.out.println("ages = " + ages); //ages = [21, 26, 43, 19, 33, 99]

        //how to add 45 on end of the list?
        ages.add(45);
        System.out.println("ages = " + ages);

        //Example: create new arrayList below into the existing arrayList (ages)
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(3);
        newAges.add(5);
        newAges.add(7);

        System.out.println(newAges); //[1, 3, 5, 7]

        ages.addAll(newAges);


        System.out.println("Newages = " + ages); //ages = [21, 26, 43, 19, 33, 99, 45, 1, 3, 5, 7]

        ages.addAll(0,newAges);
        System.out.println("ages = " + ages); // ages = [1, 3, 5, 7, 21, 26, 43, 19, 33, 99, 45, 1, 3, 5, 7]


        //CALCULATE NUMBERS OF ELEMENT FOR AGES?

        System.out.println("ages.size() = " + ages.size());
        int totalElements = ages.size();
        System.out.println("totalElements = " + totalElements);

        // ages = [1, 3, 5, 7, 21, 26, 43, 19, 33, 99, 45, 1, 3, 5, 7]
        //get() and set() in array list

        int ages5 = ages.get(2);
        System.out.println("ages5 = " + ages5); //ages5 = 5

        //set method(); // will replace the element from the existing one...
        ages.set(2, 10);

        System.out.println("ages = " + ages); //ages = [1, 3, 10, 7, 21, 26, 43, 19, 33, 99, 45, 1, 3, 5, 7]


        //Create an Arraylist as Integer and change odd elements with 10.....
        // 23 , 24, 12, 18,9

        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(23);
        myArray.add(24);
        myArray.add(12);
        myArray.add(18);
        myArray.add(9);

        System.out.println("myArray = " + myArray);


        //2.step
        for (int w:myArray) { //myArray = [23, 24, 12, 18, 9]

            if (w%2!=0){

                myArray.set(myArray.indexOf(w) , 10);
            }
        }
        System.out.println("After removing odd numbers ; " + myArray); //After removing odd numbers ; [10, 24, 12, 18, 10]

    }
}
