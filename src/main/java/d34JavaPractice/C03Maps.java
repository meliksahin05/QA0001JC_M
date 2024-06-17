package d34JavaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class C03Maps {
    public static void main(String[] args) {


    //Create a map
        /*
        add elements as key and as values
        Laptop = 1200
        Tv = 800
        Refrigerator = 1500
        Music System = 600

       in the map Contains product names as keys and their prices as values,
        write code to check if there is any product with a price greater than 1000 and print all such products.


         */

    Map<String, Integer> products = new LinkedHashMap<>();
    products.put("Laptop" , 1200);
    products.put("Tv" , 800);
    products.put("Refrigerator" , 1500);
    products.put("Music System" , 600);

        System.out.println("products = " + products); //products = {Laptop=1200, Tv=800, Refrigerator=1500, Music System=600}

        Set<Map.Entry<String ,Integer>> newProduct =products.entrySet();


        for (Map.Entry<String ,Integer> w: newProduct) {

            if (w.getValue()>1000){

                System.out.println(w.getKey() + " = " + w.getValue()); // Laptop = 1200  Refrigerator = 1500



            }

        }

    }


}
