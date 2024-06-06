package d28Oop_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    public static void main(String[] args) {

//        ArrayList<String> myName = new ArrayList<>();
        LinkedList<String> myList = new LinkedList<>();

        //1) HOW TO ADD ELEMENTS TO THE LIST
        myList.add("Ozge");
        myList.add("Goksen");
        myList.add("Melik");
        myList.add("Ismail");

        System.out.println("myList = " + myList); //[Ozge, Goksen, Melik, Ismail] [HEAD] ==> Ozge [Tail] ==> Ismail

        //How to add element on the specific index?
        myList.add(1 , "Tanya");
        System.out.println("myList = " + myList);

        //AddFirst(E e); adds and element to the begining of the list.....
        myList.addFirst("Mikail");
        System.out.println("myList = " + myList); //[Mikail, Ozge, Tanya, Goksen, Melik, Ismail]

        //ADD ELEMENT ON THE LAST INDEX?
        myList.addLast("Maryam");
        System.out.println("myList = " + myList); //myList = [Mikail, Ozge, Tanya, Goksen, Melik, Ismail, Maryam]

        //How to remove elements form the list???

        boolean name =myList.remove("Ozge");
        System.out.println("name = " + name);
//        myList.remove("Ozge");
        System.out.println("myList = " + myList); //myList = [Mikail, Tanya, Goksen, Melik, Ismail, Maryam]

        myList.add("Talha");
        myList.add(4, "Talha");

        System.out.println("myList = " + myList); //myList = [Mikail, Tanya, Goksen, Melik, Talha, Ismail, Maryam, Talha]

        //How to remove first "Talha" element????
        boolean firstTalha = myList.removeFirstOccurrence("Talha");
        System.out.println("firstTalha = " + firstTalha); //firstTalha = true
        System.out.println("myList = " + myList); //myList = [Mikail, Tanya, Goksen, Melik, Ismail, Maryam, Talha]

        //How to remove last "Talha" element?
        myList.removeLastOccurrence("Talha");
        System.out.println("myList = " + myList);// myList = [Mikail, Tanya, Goksen, Melik, Ismail, Maryam]

        //How to get first element(HEAD)?
        //peek(); is used to access the first element in the list.....

        String firstElement = myList.peek();
//        System.out.println("myList.peek() = " + myList.peek());
        System.out.println("firstElement = " + firstElement); //firstElement = Mikail
        System.out.println(myList); //[Mikail, Tanya, Goksen, Melik, Ismail, Maryam]

        //How to remove first element(head) from the list....
        //poll(); method retrives and removes the head(first element) of the list.....

        String mikail = myList.poll();
        System.out.println("mikail = " + mikail); //mikail = Mikail
        System.out.println("myList = " + myList); //myList = [Tanya, Goksen, Melik, Ismail, Maryam]

        LinkedList<String> car = new LinkedList<>();
        //Element()
        System.out.println("myList.element() = " + myList.element()); //myList.element() = Tanya
        //This method throws an exception if the collection is empty wheares peek(); returns null
        //nosuchelementException

//        System.out.println("car.element() = " + car.element()); //NoSuchElementException
        System.out.println("car.peek() = " + car.peek()); //car.peek() = null

        //pop() method, retrieves and removes the first element on the list
        System.out.println("myList.pop() = " + myList.pop()); //myList.pop() = Tanya
        System.out.println("myList = " + myList); //myList = [Goksen, Melik, Ismail, Maryam]

//        System.out.println("car.pop() = " + car.pop()); //NoSuchElementException
        System.out.println("car.poll() = " + car.poll()); //car.poll() = null

        //Summary; we learned ArrayList and LinkedList
        //LinkedList is faster than ArrayList to add and remove the elements....
        //ArrayList is faster than LinkedList to read the elements....

        //Convert from one to another?
        List<String> arrL = new ArrayList<>();
        List<String> LinkedList = new LinkedList<>(arrL);


    }
}
