package d35Enum_Iterator_Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

    public static void main(String[] args) {




        /*
        1- Iterators do the same job as loops
        2) There's no risk of an infinite loop with iterators (like with for-each)
        3) There is no performance difference between iterators and loops
        4) Iterators are more successful when it comes to removing elements from a collection or modifying an element within a collection
        5) There are two types of iterators:
            a) Iterator:
            This is only used for element removal;  adding new elements or changing an element is not possible
            b) ListIterator:
            This can remove, add, and modify elements

            Note:
            The Iterator only works from left to right (from the first element to the last)
            ListIterator can work in both directions (goes Next and get back to Previous)
         */

          //Create an ArrayList from List interface
          List<String> myList = new ArrayList<>();
          myList.add("Tom");
          myList.add("Jim");
          myList.add("Clara");
          myList.add("Fatma");
          myList.add("Mustafa");

        System.out.println(myList); // [Tom, Jim, Clara, Fatma, Mustafa]


        //lets apply iterator to myList : created an iterator on the existing.....

        Iterator<String> myItr = myList.iterator();
//        System.out.println("myItr = " + myItr); //this is references of myItr ==> java.util.ArrayList$Itr@7e0babb1

        //hashNext() : Checks if there is a next element in the collection and it will return true/false.....
        //next() :  Moves the pointer in front of the next element and returns the element in the pointer jumped over...
        //remove(): Removes the element jumped over by next() method.....

        while(myItr.hasNext()){  //[Tom,  Jim,  Clara,  Fatma,  Mustafa ]


            myItr.next();




            myItr.remove();

        }


        System.out.println("myList = " + myList); //myList = []


    }
}
