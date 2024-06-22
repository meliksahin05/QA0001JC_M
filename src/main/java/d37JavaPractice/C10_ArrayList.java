package d37JavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C10_ArrayList {


    public static void main(String[] args) {


    //    Type code that finds the smallest number in a list and adds this number to both the beginning and the end of the list.
//    If the list is empty, print "The list is empty".
//    10,5,30,20,50


        List<Integer> g = new ArrayList<>(Arrays.asList(10,5,30,20,50));

        if (g.isEmpty()){
            System.out.println("This is empty list");


        }else{

            //Find the smallest number in the list
            int minValue = g.get(0);
            for (Integer w:g) {

                if(w<minValue){

                    minValue = w;
                }

            }

            g.add(minValue);
            g.add(0, minValue);
        }

        System.out.println("g = " + g);  //[5, 10, 5, 30, 20, 50, 5]


    }
}
