package d29Collections_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {


        //Maps are like dictionaries. Thet are descriptive Jim = 13; Maps are not collesctions

        /*
        The left side keys are unique. The rigt side value cah have duplicates....
        For keys, a set is used for the values is genrally used List....


         */

        //How to create a map??

        //1) HashMap; A type of map that stores key-value pairs in a random order...
        //it is the fastest.....

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Ismail" , 25);
        myMap.put("Tanya" , 28);
        myMap.put("Mikail" , 34);
        myMap.put("Derya" , 33);
        myMap.put("Goksen" , 45);
        myMap.put("Talha" , 28); //Talha=29,
//        myMap.put("Talha" , 29);
        System.out.println("myMap = " + myMap); //myMap = {Tanya=28, Derya=33, Talha=28, Ismail=25, Mikail=34, Goksen=45}

        //How to get only keys from map????

        Set<String> keys = myMap.keySet();
        System.out.println("keys = " + keys);  //keys = [Tanya, Derya, Talha, Ismail, Mikail, Goksen]


        //How to get only Values from map?
       Collection<Integer> values = myMap.values();
        System.out.println("values = " + values); //values = [28, 33, 28, 25, 34, 45]

        //Can we store returning values in ArrayList? or LinkedList?
//        LinkedList<Integer> values1 = myMap.values(); you can not convert

        LinkedList<Integer> values1 = new LinkedList<>(values);
        System.out.println("values1 = " + values1); //values1 = [28, 33, 28, 25, 34, 45]



    }
}
