package d38Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda11 {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println("Original: " + myList);


       List<String> result = ss(myList);
        for (String w: result) {
            System.out.print(w+ " "); //ali elif mustafa yusuf zeynep
        }

        System.out.println("===========================================");

        System.out.println("isaAnswer(myList) = " + isaAnswer(myList));


    }

    //print the elements between in the same line with a space...
    //Eliminate repaeated data and order then in alphabetical
    //Have them all lowercase....
    //return it as a list.....

    public static List<String> ss(List<String> myList) {
        List<String> newList = myList.stream().distinct().sorted().map(t->
                t.toLowerCase()).collect(Collectors.toList());

        return newList;

    }

    public static List<String> isaAnswer(List<String> list) {
        List<String> newList=  list.stream().distinct().map(t->
                t.toLowerCase()).sorted().collect(Collectors.toList());
        for (String w : newList
        ) {
            String  b=w+" ";
            newList.set(newList.indexOf(w),b);

        }
        return newList;
    }
}
