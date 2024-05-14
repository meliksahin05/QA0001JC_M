package d16DoWhileLoop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {


        //Arrays; This is a structure allows storing multiple data. For example: the names of the student in your class
        //2) arrays can store only one data type... that means an int array can store only int values..
        // a string array can store only string values.....

        //3) to create an array, we need to specify
        // i) data type ii) give a name //iii) data size

        //(Maximum value that can be specified for the array size limited to Integer.Max_Values,

        //4) arrays are faster than other collections (set, map), because arrays are size-fixed structures....
        //5) arrays can use less memory than the other collections because they dont have extra metadata of functunality...
        //6) arrays can store primitive data types and object references (String , Integer wrapper class, int etc....)


        //How to create an Array....
        //1st way
        String[] names = new String[4]; // most common used. We recommend this type....

        //2nd way
        String names1[] = new String[4];

//        System.out.println(names);

        System.out.println(Arrays.toString(names));
        //in array class we need to use methods...
        //We need to use toString method for printing....

        //String element can not be directly printing on the console....

        //Example; Create an array with int data type and name it notes.... store 5 datas...

        int[] notes = new int[5];

        System.out.println(Arrays.toString(notes));

        //Example; Create an array with Integer (wrapper class) data type for 10 elements...

        Integer[] number = new Integer[10];

        System.out.println(Arrays.toString(number));

        //Example; create an array to store 3 names in it....

        String[] firstNames = new String[3];

        System.out.println(Arrays.toString(firstNames)); // [null, null, null]

        //How to add elements into array.... Mike, Mary, Jim

        firstNames[0] = "Mike";

        System.out.println(Arrays.toString(firstNames));

        firstNames[1] = "Mary";
        firstNames[2] = "Jim";

        System.out.println(Arrays.toString(firstNames));

        //Example; Create an array for 5 city names, assign the cities and print on the console....

        //1) Create an array
        String[] cities = new String[5];

        //2) add/assign the name of cities

        cities[0] = "Istanbul";
        cities[1] = "Denizli";
        cities[2] = "Izmir";
        cities[3] = "New York";
        cities[4] = "Paris";

        System.out.println(Arrays.toString(cities));

        System.out.println("===========================================");

        //Example; print the cities one by one on the console....

        for (int i = 0; i < cities.length; i++) {

            System.out.println(cities[i]);
        }

        System.out.println("===========================================");

        //2.way for each loop (enhanced loop)
        //in this loop; starting value, condition direction is defined automatically....
        //but there is only one single direction, from begining to end....


        //for(element data types, variable: arrayName/CollectionName){

        //codes
    //}

        for (String c: cities){ //[Istanbul, Denizli, Izmir, New York, Paris]

            System.out.println(c);
        }

        }

}
