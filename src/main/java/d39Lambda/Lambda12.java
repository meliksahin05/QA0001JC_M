package d39Lambda;

import d21MethodCreation_MethodOverloading.ExampleStatic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda12 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Solomon");
        myList.add("Jesus");
        myList.add("Mustafa");
        System.out.println("Original: " + myList);

        //Exapmle: Create a method that prints the elements of a list to console without duplicates in lowercase.......
        //And sorted by their lenght, from shortest to longest...



        sortElementsWithLenght(myList);

        newMethod(myList);




    }


    public static void sortElementsWithLenght(List<String> myList){

        myList.stream().distinct().map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).sorted().
                forEach(t -> System.out.print(t + " "));  //ali elif yusuf jesus solomon mustafa



    }

    public static void newMethod(List<String> myList){


        myList.stream().distinct().map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(Utills::printInTheSameLineWithSpace);


    }

}
