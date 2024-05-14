package d17Arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {



        //Example; Create an array in int data type and store 6 elements for ages....

        //Calculate total value of min and max values in the array

        //1.WAY TO CREATE AN ARRAY
//
//        int [] ages = new int[6];
//
//        ages[0] = 12;
//        ages[1] = 11;
//        ages[2] = 14;
//        ages[3] = 17;
//        ages[4] = 10;
//        ages[5] = 13;

        //2way to create array...

        int[] ages = {12,11,14,17,10,13};

        System.out.println(Arrays.toString(ages)); //[12, 11, 14, 17, 10, 13]

        //sort() ==> used to sort elements in ascending orders (smaller to larger)

        //type array class then put "." then choose sort method...

        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages)); //[10, 11, 12, 13, 14, 17]

        int min = ages[0];
        int max = ages[ages.length-1];

        System.out.println("Total value of min and max ; " + (min+max));


        //2way for each loop for this question

        int[] ages1 = {12,11,14,17,10,13};

        //Math.max() ==> compares two values and returns greatest one....
        //Math.min() ==> compares two values and return smallest one...

        int maximum = ages1[0]; //12
        int minumum = ages1[0]; //12


        for (int  w: ages1){ //{12,11,14,17,10,13};


     maximum = Math.max(maximum , w);
     minumum = Math.min(minumum , w);

        }

        System.out.println("Value ; " + (maximum+minumum));

        String [] cities = new String[5];

        cities[0] = "Adana";
        cities[1] = "Istanbul";
        cities[2] = "Samsun";
        cities[3] = "Batman";
        cities[4] = "ANkara";

        Arrays.sort(cities);

        System.out.println(Arrays.toString(cities));



    }
}
