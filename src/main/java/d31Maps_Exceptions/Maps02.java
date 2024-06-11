package d31Maps_Exceptions;

import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {

        HashMap<String , Integer> stdAges = new HashMap<>();

        stdAges.put("Ismail" , 25);
        stdAges.put("Tanya" , 28);
        stdAges.put("Mikail" , 34);
        stdAges.put("Derya" , 33);
        stdAges.put("Goksen" , 45);
        stdAges.put("Talha" , 28);

        System.out.println("stdAges = " + stdAges); //stdAges = {Tanya=28, Derya=33, Talha=28, Ismail=25, Mikail=34, Goksen=45}

        //replace() method is used to uptade values using their keys......

        stdAges.replace("Goksen",33);
        System.out.println("stdAges = " + stdAges); //stdAges = {Tanya=28, Derya=33, Talha=28, Ismail=25, Mikail=34, Goksen=33}

        stdAges.replace("Derya", 33,25);
        System.out.println("stdAges = " + stdAges); //stdAges = {Tanya=28, Derya=25, Talha=28, Ismail=25, Mikail=34, Goksen=33}

        stdAges.replace("Talha", 33,25); //stdAges = {Tanya=28, Derya=25, Talha=28, Ismail=25, Mikail=34, Goksen=33}
        System.out.println("stdAges = " + stdAges);

        //putIfAbsent() methods puts the specified key-value pair to the map if the key is not already present.....

        stdAges.putIfAbsent("Talha" ,66); //did not assign the value bcs Talha is in the map....
        System.out.println("stdAges = " + stdAges); //stdAges = {Tanya=28, Derya=25, Talha=28, Ismail=25, Mikail=34, Goksen=33}


        stdAges.putIfAbsent("Ronaldo" ,66);
        System.out.println("stdAges = " + stdAges); // stdAges = {Ronaldo=66, Tanya=28, Derya=25, Talha=28, Ismail=25, Mikail=34, Goksen=33}


        //Both get() and getOrDefault() methods do same the job if the searched element is in the map....
        System.out.println("stdAges.get(\"Ismail\") = " + stdAges.get("Ismail")); //stdAges.get("Ismail") = 25

        stdAges.getOrDefault("Derya" , 404); //stdAges = {Ronaldo=66, Tanya=28, Derya=25, Talha=28, Ismail=25, Mikail=34, Goksen=33}
        System.out.println("stdAges = " + stdAges);


        System.out.println("stdAges.getOrDefault(\"Gaffur\" , 404) = " + stdAges.getOrDefault("Gaffur", 404));
        //returns value of the key if exits, otherwise default one will return.....


        //The remove("key") method is used to delete an entry using the key.....

        stdAges.remove("Talha");
        System.out.println("stdAges = " + stdAges); //stdAges = {Ronaldo=66, Tanya=28, Derya=25, Ismail=25, Mikail=34, Goksen=33}


        stdAges.remove("Ronaldo" ,12);
        System.out.println("stdAges = " + stdAges); //stdAges = {Ronaldo=66, Tanya=28, Derya=25, Ismail=25, Mikail=34, Goksen=33}


    }
}
