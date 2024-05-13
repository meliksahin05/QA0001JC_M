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
        String names1 [] = new String[4];

//        System.out.println(names);

        System.out.println(Arrays.toString(names));
        //in array class we need to use methods...
        //We need to use toString method for printing....

        //String element can not be directly printing on the console....

        //Example; Create an array with int data type and name it notes.... store 5 datas...

       int  [] notes = new int[5];

        System.out.println(Arrays.toString(notes));

        //Example; Create an array with Integer (wrapper class) data type for 10 elements...

        Integer [] number = new Integer[10];

        System.out.println(Arrays.toString(number));

        //Example; create an array to store 3 names in it....

        String [] firstNames = new String[3];

        System.out.println(Arrays.toString(firstNames)); // [null, null, null]

        //How to add elements into array.... Mike, Mary, Jim

        firstNames[0] = "Mike";

        System.out.println(Arrays.toString(firstNames));

        firstNames[1] = "Mary";
        firstNames[2] = "Jim";
        firstNames[3] = "Alex";

        System.out.println(Arrays.toString(firstNames));





    }
}
