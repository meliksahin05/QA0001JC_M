package d20ArrayList_MethodCreation;

import java.util.ArrayList;

public class ArrayList02 {

    public static void main(String[] args) {


        //Create an ArrayList with repeated letters/elements. And move them to new arrayList as unique letters/elements
        // J, a , v, a, v

        ArrayList<Character> character = new ArrayList<>();

        character.add('J');
        character.add('a');
        character.add('v');
        character.add('a');
        character.add('v');

        System.out.println("character = " + character); //character = [J, a, v, a, v]

        ArrayList<Character> newArr = new ArrayList<>();


        for (Character w:character) {

            if (!newArr.contains(w)){

                newArr.add(w);
            }

        }

        System.out.println("newArr = " + newArr);  //newArr = [J, a, v]


    }
}
