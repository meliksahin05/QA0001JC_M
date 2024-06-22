package d37JavaPractice;

import java.util.*;

public class C06ArrayList {

    public static void main(String[] args) {

//        Type the code that shows the count of unique elements in a list of strings.
//        Example: {"apple", "banana", "apple", "orange", "banana", "apple"} ==> 3


        List<String> myList = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));


        //1st way
        Set<String> mySet = new HashSet<>(myList);
        System.out.println("mySet = " + mySet); //mySet = [banana, orange, apple]
        System.out.println("mySet.size() = " + mySet.size()); //3


        //2nd way
        HashSet<String> mySet1 = new HashSet<>(myList);
        System.out.println("mySet1 = " + mySet1);
        System.out.println("mySet1.size() = " + mySet1.size());

        //3nd way coming from Zakir

        long count = myList.stream().distinct().count();
        System.out.println("count = " + count);

    }
}
