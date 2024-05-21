package d20ArrayList_MethodCreation;

import java.util.ArrayList;
import java.util.Collections;

public class ArraysList04 {

    public static void main(String[] args) {

        //Example; Create an integer list
        //find the closest element in the list
        // [12,23,10,19]  ==> 10 and 12  ===> 12-10=2

        //1.STEP, to create an arrayList
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(23);
        myList.add(10);
        myList.add(22);

        System.out.println("myList = " + myList); //[12, 23, 10, 19]

        //1.way to Sort() our arrayList....
//        myList.sort(null);
//        System.out.println("myList = " + myList); //myList = [10, 12, 19, 23] // in the list we can use sort() and type null inside of the parantesis...


        //2. way to Sort() our arralyList....

        Collections.sort(myList); // Collections is helper class to use some methods on our codes.....
        System.out.println("myList = " + myList); //myList = [10, 12, 22, 23]

        int minDiff = myList.get(1) - myList.get(0);

        System.out.println("minDiff = " + minDiff); //minDiff = 2

        //find the minumum differences

        for (int i = 1;       i < myList.size();               i++) {

            minDiff = Math.min(minDiff, myList.get(i)- myList.get(i-1));
        }

        System.out.println("minDiff = " + minDiff);


        //find the number whose diffrences is minumum

        for (int i=1; i<myList.size(); i++){

            if (myList.get(i)- myList.get(i-1)==minDiff){

                System.out.println(myList.get(i)+ " and " + myList.get(i-1));
            }


            }
    }
}














