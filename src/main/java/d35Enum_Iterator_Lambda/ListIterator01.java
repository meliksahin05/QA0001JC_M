package d35Enum_Iterator_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {

    public static void main(String[] args) {


        //List Iterator

        //  b) ListIterator:
        //  This can remove, add, and modify elements

        List<String> yourList = new ArrayList<>(Arrays.asList("Mike", "Tom", "Ali"));
        System.out.println(yourList);  //[Mike, Tom, Ali]


        //1) set() method is used to update an element in a list.....

        ListIterator<String> listItr = yourList.listIterator();


        while (listItr.hasNext()) {    //[Mike, Tom, Ali]

            String element = listItr.next();
            listItr.set(element + " *** ");

//            if (element.equals("Tom")){
//
//                listItr.set("Daniel");
//            }


        }
        System.out.println(yourList);  //[Mike *** , Tom *** , Ali *** ] [Mike, Daniel, Ali]


        //================================================================================

        //Print the element from end to head of list......

        List<String> yourList2 = new ArrayList<>(Arrays.asList("Mike", "Tom", "Ali"));
        System.out.println(yourList2);  //[Mike, Tom, Ali]


        ListIterator<String> listItr2 = yourList.listIterator();

        while (listItr2.hasNext()) {    //[Mike, Tom, Ali]



            String element = listItr2.next();


        }

        System.out.println(yourList2); // [Mike, Tom, Ali]

        //After having pointer on the end of the list, we can print from last element to first element.....

        while(listItr2.hasPrevious()){


            String previousElement = listItr2.previous(); //[Mike, Tom, Ali]
            System.out.println(previousElement);


        }
//        System.out.println("yourList2 = " + yourList2); //yourList2 = [Mike, Tom, Ali]


    }
}
