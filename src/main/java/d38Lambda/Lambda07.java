package d38Lambda;

import java.util.*;

public class Lambda07 {

    public static void main(String[] args) {



        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
        System.out.println(nums); //[2, 2, 4, 5, 11, 10]


        findMinumum(nums);
        findMinumum2(nums);
        findMinumum3(nums);
        findMinumum4(nums);
        findMinumum5(nums);
        findMinumum6(nums);
        findMinumum7(nums);



        //create a method to find minimum value of the elements from list....
    }

 // Smitha answer // first way
    public static void findMinumum(List<Integer> nums){

        int min = nums.stream().distinct().sorted().
                reduce((t,u) -> t).get();

        System.out.println("min = " + min);


    }

    //isa answer second way
    public static void findMinumum2(List<Integer> nums){

        int min2 = nums.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);

        System.out.println("min2 = " + min2);


    }

    //zakir answer
    public static void findMinumum3(List<Integer> nums){

        int min3 = nums.stream().distinct().reduce(nums.get(0), (t,u) -> t<u ? t : u);
        System.out.println("min3 = " + min3);


    }

    //4. way

    //Comparator.reverseOrder();
    // sort the elements in reverse order

    //sorted(Comparator.reverseOrder()); is used in Java stream api to sort elements in reverse order.....

    public static void findMinumum4(List<Integer> nums){

        int min4 = nums.stream().distinct().sorted(Comparator.reverseOrder()).////[11, 10, 5, 4, 2]
                reduce((t,u) -> u).get();

        System.out.println("min4 = " + min4);
    }


    //5.way

    public static void findMinumum5(List<Integer> nums){

        Optional<Integer> min5 = nums.stream().distinct().sorted(Comparator.reverseOrder()).////[11, 10, 5, 4, 2]
                reduce((t,u) -> u);

        if(min5.isPresent()){ //isPresent method to check data if data is coming after

            System.out.println("min5 " + min5.get());
        }else {
            System.out.println("List is empty or value can not be found");
        }

        //In order to use isPresent() method (returning boolean); we create Optional object and keep the result from reduce()
        //after that check the condition with isPresent() method and apply get() method to display result...

    }


    //6. way

    public static void findMinumum6(List<Integer> nums){  ////[2, 2, 4, 5, 11, 10]

        int min6 =nums.stream().distinct().reduce(Math::min).get();


        System.out.println("min6 = " + min6);

    }


    //7.way
    //we can use findFirst()

    public static void findMinumum7(List<Integer> nums){  ////[2, 2, 4, 5, 11, 10]

        int min7 =nums.stream().distinct().sorted(Comparator.reverseOrder()).findFirst().get(); //after sorting get the first element as minumum

        System.out.println("min7 = " + min7);

    }












}
