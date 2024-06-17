package d35Enum_Iterator_Lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator02 {

    public static void main(String[] args) {


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

        //Please delete only clara....

        while(myItr.hasNext()){  //  [Tom, Jim, Clara, Fatma, Mustafa]



            if (myItr.next()  == "Clara"){

                myItr.remove();
            }

            //2. way
//            String elm = myItr.next();
//            if (elm.equals("Clara")){
//
//                myItr.remove();
//            }

        }
        System.out.println("myList = " + myList); //myList = [Tom, Jim, Fatma, Mustafa]

    }

}
