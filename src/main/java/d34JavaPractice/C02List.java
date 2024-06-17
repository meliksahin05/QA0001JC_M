package d34JavaPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02List {


    public static void main(String[] args) {


        //        If the list contains the element 20,
        //        replace all occurrences of 20 with 2020 and then calculate the sum of all elements in the modified list.
        //      Arraylist = [10, 20, 30, 20, 50]



        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(50);
        System.out.println("oldest list " + list);

        for (int i = 0; i <list.size();  i++) {
            if (list.get(i) == 20){

                list.set(i, 2020);
            }

        }
        System.out.println(list); //[10, 2020, 30, 2020, 50]

        int sum = 0;
        for (int w:list) {

            sum = sum+w;
        }

        System.out.println("Total Value " +sum); //4130
        System.out.println("list = " + list);


//Isa's Answer

//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        int  sum=0;
//
//        for (int w : list
//        ) {
//            if (w== 20) {
//
//
//                list.set(list.indexOf(w), 2020);
//
//            }
//
//        }
//        for (int w : list){
//            sum += w;
//        }
//        System.out.println(sum); //4130
//        System.out.println(list); //[10, 2020, 30, 2020, 50]







//        //Zakir's Answer
//        List<Integer> list = new LinkedList<>();
//
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        int sum=0;
//        for (int i = 0; i <= list.size() - 1; i++)
//        {
//
//            if (list.get(i) == 20) {
//                list.set(i, 2020);
//            }
//            sum+=list.get(i);
//
//
//        }
//        System.out.println(list); //[10, 2020, 30, 2020, 50]
//        System.out.println(sum); //4130
//
//
//
//



//Smitha's Answer
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        list1.add(20);
//        list1.add(50);
//
//        System.out.println("list = " + list1);
//

//        ArrayList<Integer> newList = new ArrayList<>();
//        for (Integer w : list1) {
//            if(w == 20){
//                newList.add(2020);
//            } else{
//                newList.add(w);
//            }
//        }System.out.println(newList);
//
//
//        int sum1 = 0;
//
//        for(Integer w: newList) {
//            sum1 = sum1 + w;
//
//        }
//        System.out.println("sum = " + sum1);
//
//
//
//
    }



}
