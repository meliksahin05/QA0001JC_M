package d20ArrayList_MethodCreation;

import java.util.ArrayList;

public class ArrayList03 {

    public static void main(String[] args) {

        //  Create a String ArrayList and remove the elements containing "a"....
        // "Istanbul", "Atina", "Houston", "Moscow"
        //You can not decrease element in the list by using "for each loop"
        //if the size of the collection or array changes, it du=istrubs the consistency of the loop..
        //Specifically, when an element is removed, the loop will still consider the old size...
        //Which can lead exceding array boudraiers....
        ////Exception in thread "main" java.util.ConcurrentModificationException
        //loops says we started looping with 4 elements, and now i can not go to less element than 4
        // but it is changing because of remoce method and i can not run anymore....


        ArrayList<String> cities = new ArrayList<>();

        cities.add("Istanbul");
        cities.add("Atina");
        cities.add("Houston");
        cities.add("Moscow");

        System.out.println("cities = " + cities);  //cities = [Istanbul, Atina, Houston, Moscow]
//
//        for (String w :cities) {
//
//            if (w.contains("a")){
//
//                cities.remove(w);
//            }
//
//        }
//
//        System.out.println("cities = " + cities); //Exception in thread "main" java.util.ConcurrentModificationException
        for (int i=0;           i<cities.size();                i++){

            if (cities.get(i).contains("a")){ // [Istanbul, Atina, Houston, Moscow]

                cities.remove(i);
                i--;
            }

        }
        System.out.println("cities = " + cities); //cities = [Houston, Moscow]


    }
}
