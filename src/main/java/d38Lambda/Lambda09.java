package d38Lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda09 {

    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        System.out.println("myList = " + myList);  //[Ali, Elif, Yusuf, Elif, Zeynep, Mustafa]

        printElements(myList); //zeynep mustafa


    }

    //print the elements as unique on the console whose num of characters are greater than five.....

    public static void printElements(List<String> myList){

        myList.stream().distinct().filter(t -> t.length()>5).forEach(System.out ::println);


    }
}
