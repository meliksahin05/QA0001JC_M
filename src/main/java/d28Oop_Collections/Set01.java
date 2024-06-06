package d28Oop_Collections;

import java.util.*;

public class Set01 {

    public static void main(String[] args) {

        //Sets are used to store unique elements......
        //For Example; national id, fingerPrint, email, driver license, city plate number......

        /*
        1) HashSet; This set stores elements based on their hash code.... Elments are stored in a structure
        where each has unique element is added it has hash code is calculated.....
        and placed in a cell corresponding to that hash code...
         */

        /*
        HashSet offer the fastest performance. But they do not maintain the order elements.....


         */

        String a = "ac";
        System.out.println(a.hashCode()); //3106

        String b = "accordion";
        System.out.println("b.hashCode() = " + b.hashCode()); //-1830107832

        /*
        LinkedHashSet
          this set store elements based on their additional order...  (insertion order)
          the linkedHashSets are good choice for applications that require maintaning the order of the elements.
          however they offer slower perfomance than HashSet.....

          //TreeSet;
          This set stores elements based on their natural order(smallest to largest)
          it offers slower performance than HashSets and linkedHashSet
          in java, treeSet is a class that implements the sortedInterface...
          thats why treeSet is a sorted set......


         */

        //how to create a HashSet?????
        HashSet<String> hs = new HashSet<>();
        System.out.println("hs = " + hs); //hs = []

        //how to add elements to HashSet......
        hs.add("Ismail");
        hs.add("Masuma");
        hs.add("Anna");
        hs.add("Melek");
        System.out.println("hs = " + hs); //hs = [Melek, Ismail, Masuma, Anna]

        //if i add same element, what will happen on the console?
        hs.add("Ismail"); //it will be Overwritten to existing one. You wont get any error.......
        System.out.println("hs = " + hs); //hs = [Melek, Ismail, Masuma, Anna]
        hs.add(null);
        System.out.println("hs.add(null) = " + hs); //hs.add(null) = [null, Melek, Ismail, Masuma, Anna]

        HashSet<String> hs2 = new HashSet<>(Arrays.asList("Derya", "Kamola"));

        Set<String> hs3 = Set.of("Martin", "Barbara");

        System.out.println("hs3 = " + hs3); //hs3 = [Martin, Barbara]


        System.out.println("================LINKED HASHSET=============");

//        LinkedHashSet
//        this set store elements based on their additional order...  (insertion order)
//        the linkedHashSets are good choice for applications that require maintaning the order of the elements.
//                however they offer slower perfomance than HashSet.....

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        System.out.println("lhs = " + lhs); // []


        lhs.add(15);
        lhs.add(17);
        lhs.add(7);
        lhs.add(9);

        System.out.println("lhs = " + lhs); //lhs = [15, 17, 7, 9]        //lhs = [15, 17, 75, 99, null]

        //retainAll(); is used to find the intersection of elements in one collection with another.
        // When you wanna see the common elements between two different linkedHashSet we are using RetainAll methods.....

        LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();

        lhs2.add(15);
        lhs2.add(17);
        lhs2.add(75);
        lhs2.add(99);

        System.out.println("lhs.retainAll(lhs2) = " + lhs.retainAll(lhs2));
        System.out.println("lhs = " + lhs); //lhs = [15, 17= [15, 17]
        System.out.println("lhs2 = " + lhs2); //lhs2 = [15, 17, 75, 99]

        //TREESET

        //TreeSet;
//        This set stores elements based on their natural order(smallest to largest)
//        it offers slower performance than HashSets and linkedHashSet
//        in java, treeSet is a class that implements the sortedInterface...
//        thats why treeSet is a sorted set......

        //how to create TreeSet....?

        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('H');
        ts.add('K');
        ts.add('B');

        System.out.println(ts); //[A, B, G, H, K, Z]

        TreeSet<String> ts2 = new TreeSet<>();
        ts2.add("Istanbul");
        ts2.add("Berlin");
        ts2.add("Munich");
        ts2.add("Izmir");
        ts2.add("KOBLENZ");
        ts2.add("Paris");
        System.out.println("ts2 = " + ts2); //ts2 = [Berlin, Istanbul, Izmir, KOBLENZ, Munich, Paris]


        //subSet() is used to create a new set that contains element with in certain range....

//        TreeSet<Character> ss = new TreeSet<>();

        SortedSet<Character> ss = ts.subSet('B','K');
        System.out.println("ss = " + ss); //ss = [B, G, H]
        System.out.println("ts = " + ts); //ts = [A, B, G, H, K, Z]

        //Subset (inclusive, exclusive)


    }
}
